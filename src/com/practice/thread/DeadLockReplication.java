package com.practice.thread;

import com.java.newfeature.handson.Dummy;

public class DeadLockReplication {
    static Object lock1=new Object();
    static Object lock2 = new Object();
    public static void main(String[] args) throws InterruptedException {
        DeadLockReplication.SharedObject sharedObject = new DeadLockReplication.SharedObject();
        Thread t1 = new Thread(new DeadLockReplication.Thread1(sharedObject));
        Thread t2 = new Thread(new DeadLockReplication.Thread2(sharedObject));
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
        DeadLockReplication.SharedObject sharedObject;

        Thread2(DeadLockReplication.SharedObject sharedObject){
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
        DeadLockReplication.SharedObject sharedObject;

        Thread1(DeadLockReplication.SharedObject sharedObject){
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
