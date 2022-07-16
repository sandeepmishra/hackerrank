package com.java.newfeature.handson;

import java.util.*;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Dummy{
    static Object lock1=new Object();
    static Object lock2 = new Object();
    public static void main(String[] args) throws InterruptedException {
        SharedObject sharedObject = new SharedObject();
        Thread t1 = new Thread(new Thread1(sharedObject));
        Thread t2 = new Thread(new Thread2(sharedObject));
        t1.start();
        t2.start();
        t1.join();
        t2.join();
    }

    static class SharedObject{
        public  void doSomething(){
            System.out.println("print something via shared object");
        }
    }

    static class Thread2 implements Runnable{
        SharedObject sharedObject;

        Thread2(SharedObject sharedObject){
            this.sharedObject = sharedObject;
        }
        @Override
        public void run() {
            synchronized (lock1) {
                this.sharedObject.doSomething();
                synchronized (lock2) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
            System.out.println("exit run 2");
        }
    }

    static class Thread1 implements Runnable{
        SharedObject sharedObject;

        Thread1(SharedObject sharedObject){
            this.sharedObject = sharedObject;
        }
        @Override
        public void run() {
            synchronized (lock1) {
                this.sharedObject.doSomething();
                synchronized (lock2) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
            System.out.println("exit run 1");
        }
    }
}
