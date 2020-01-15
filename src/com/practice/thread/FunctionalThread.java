package com.practice.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FunctionalThread {
    public static void main(String[] args) {
        Runnable r = ()->{

            System.out.println("Thread execution using functional interface way: "+Thread.currentThread().getName());
        };
        for(int i=0;i<10;i++){
            new Thread(r).start();
        }

        ExecutorService executorService=null;
        try {
             executorService = Executors.newSingleThreadExecutor();
            for (int i = 0; i < 10; i++) {
                executorService.execute(r);
            }
        }finally {
            executorService.shutdown();
        }

    }
}
