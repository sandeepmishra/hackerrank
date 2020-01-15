package com.practice.thread;

import java.util.concurrent.*;

/**
 * An Executor that provides methods to manage termination and methods that can produce a Future
 * for tracking progress of one or more asynchronous tasks.
 */
public class ExecutorServiceThread {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        Runnable task = () -> System.out.println(Thread.currentThread().getName());
        for (int i = 0; i < 4; i++) {
            executor.execute(task);
        }

        try {
            Callable<String> callable = () -> {
                return "I am in thread: " + Thread.currentThread().getName();
            };
            for (int i = 0; i < 10; i++) {
                Future<String> future = executor.submit(callable);
                System.out.println(future.get());// best practice to use get with  timeout
            }
        } finally {
            executor.shutdown();
        }

    }
}
