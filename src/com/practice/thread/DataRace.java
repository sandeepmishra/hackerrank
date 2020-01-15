package com.practice.thread;

import java.util.concurrent.atomic.AtomicInteger;

public class DataRace {

    public static void main(String[] args) throws InterruptedException {
        Thread t1=new DataRaceThread();
        Thread t2=new DataRaceThread();
        t1.start();
        t2.start();

        t1.join();;
        t2.join();
        System.out.println("Thread count:"+DataRaceThread.getThreadCount);
    }

}
class DataRaceThread extends Thread{
    static AtomicInteger getThreadCount=new AtomicInteger(0);

    public void run(){
        for(int i=0;i<10_000_000;i++){
            getThreadCount.incrementAndGet();
        }

    }

}