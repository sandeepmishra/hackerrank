package com.practice.thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Intrinsic lock (synchronized, Object key = new Object();
 * Main issue with using intrinsic lock is if block guarded by synchronized block doesn't executes
 * or the code inside block is blocked by another thread indefinitely, so the solutions of this
 * situation is to reboot the jvm
 *
 */
public class IntrinsicLock {
    public static void main(String[] args) {


    }

    // if synchronized  block of this code doesn't completes we need to reboot jvm to overcome
    // from this situation
    // The other way is to use API locking
    public void intrinsicLocking(){
        Object key = new Object();
        synchronized (key){
            System.out.println("this block implements intrinsic locking");
        }

        // to overcome above situation we can proceed with using like below
        // this locking called as explicit locking
        Lock lock = new ReentrantLock();
        try{
            lock.lock();// lockInterruptibley() to execute same block of code by interrupting current thread executiion
            System.out.println("this system will behave as its in synchronized block");
        }finally {
            lock.unlock();
        }
    }
}
