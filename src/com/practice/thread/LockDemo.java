package com.practice.thread;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockDemo {

    public static void main(String[] args) throws InterruptedException {
        LockThread r1 = new LockThread();
        LockThread r2 = new LockThread();
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);

        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(LockThread.counter);
        System.out.println("Using atomic integer: "+LockThread.atomicInteger.get());
    }
}

class LockThread implements Runnable{
    static private Lock lock =new ReentrantLock();
    public static int counter = 0;
    static AtomicInteger atomicInteger = new AtomicInteger(0);
    @Override
    public void run() {

        for(int i=0;i<10_000_000;i++){
            lock.lock();
            counter++;
            lock.unlock();
            atomicInteger.incrementAndGet();
        }

    }
}
