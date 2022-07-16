package com.practice.thread.udemy.example;

import java.util.*;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;


// use case inventory database
public class ReenterentReadWriteLockCheck {
    public static final int HIGHEST_PRICE = 1000;
    public static void main(String[] args) throws InterruptedException {
       InventoryDatabase inventoryDatabase = new InventoryDatabase();
        Random random = new Random();
        for(int i=0;i<100000;i++){
            inventoryDatabase.addItem(random.nextInt(HIGHEST_PRICE));
        }
        Thread writer = new Thread(()-> {
           while(true){
               inventoryDatabase.addItem(random.nextInt(HIGHEST_PRICE));
               inventoryDatabase.removeItem(random.nextInt(HIGHEST_PRICE));
               try{
                   Thread.sleep(10);
               }catch (InterruptedException e){

               }
           }
        });
        writer.setDaemon(true);
        writer.start();
        int numberOfReaderThreads = 7;
        List<Thread> readers = new ArrayList<>();
        for(int readerIndex=0;readerIndex<numberOfReaderThreads;readerIndex++){
            Thread reader = new Thread(()->{
               for(int i=0;i<100000;i++){
                   int upperBoundPrice = random.nextInt(HIGHEST_PRICE);
                   int lowerBoundPrice = upperBoundPrice>0 ?random.nextInt(upperBoundPrice):0;
                   inventoryDatabase.getNumberOfItemsInPriceRange(upperBoundPrice, lowerBoundPrice);
               }
            });
            reader.setDaemon(true);
            readers.add(reader);
        }

        long startReadTime = System.currentTimeMillis();
        for(Thread reader: readers){
            reader.start();
        }
        for(Thread reader: readers){
            reader.join();
        }
        System.out.println(System.currentTimeMillis()-startReadTime);
    }

    public static class InventoryDatabase{
        private TreeMap<Integer, Integer>priceToCountTreeMap=new TreeMap<>();
        private ReentrantLock reentrantLock=new ReentrantLock();
        private ReadWriteLock readWriteLock = new ReentrantReadWriteLock();
        Lock readLock = readWriteLock.readLock();
        Lock writeLock = readWriteLock.writeLock();
        public int getNumberOfItemsInPriceRange(int lowerBound, int uppderBound){
            //reentrantLock.lock();
            readLock.lock();
            try {
                Integer toKey = priceToCountTreeMap.ceilingKey(lowerBound);
                Integer fromKey = priceToCountTreeMap.floorKey(uppderBound);
                if (fromKey == null || toKey == null) {
                    return 0;
                }
                NavigableMap<Integer, Integer> integerIntegerNavigableMap = priceToCountTreeMap.subMap(fromKey, true, toKey, true);
                int sum = 0;
                for (int numberOfItemsForPrice : integerIntegerNavigableMap.values()) {
                    sum += numberOfItemsForPrice;
                }
                return sum;
            }finally {
                //reentrantLock.unlock();
                readLock.unlock();
            }
        }

        public void addItem(int price){
            //reentrantLock.lock();
            writeLock.lock();
            try {
                Integer numberOfItemsForPrice = priceToCountTreeMap.get(price);
                if (null == numberOfItemsForPrice) {
                    priceToCountTreeMap.put(price, 1);
                } else {
                    priceToCountTreeMap.put(price, numberOfItemsForPrice + 1);
                }
            }finally {
                //reentrantLock.unlock();
                writeLock.unlock();
            }
        }

        public void removeItem(int price){
            //reentrantLock.lock();
            writeLock.lock();
            try {
                Integer numberOfItemsForPrice = priceToCountTreeMap.get(price);
                if(null == numberOfItemsForPrice || numberOfItemsForPrice == 1){
                    priceToCountTreeMap.remove(price);
                }else{
                    priceToCountTreeMap.put(price, numberOfItemsForPrice-1);
                }
            }finally {
                writeLock.unlock();
                //reentrantLock.unlock();
            }
        }
    }
}
