package com.practice.thread;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *  till the time one thread is working and the other thread is waiting for result form the firest one
 *  the second thread can sleep and wakeup when first thread is done
 *
 *  the above functionality can be achieved by joining two threads.
 *
 *
 *  disadvantages: order of execution is not fixed
 *
 *  NOTE: design code for worst case scenario
 *
 *  Throughput -> number of task completed in given time.
 *  approaches to improve throughput
 *
 */
public class ThradJoinDemo {

    public static void main(String[] args) {
        List<Long> list = Arrays.asList(21L, 12L,434L,4353L,3453L,353453L);
        // calculate factorial of all numbers by using list of threads and join and then return result.

        List<FactorialThread> threads = new ArrayList<>();

        for(long inputNumber: list){
            threads.add(new FactorialThread(inputNumber));
        }

        for(Thread thread: threads){
            thread.start();
        }
        for(Thread thread: threads){
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static class FactorialThread extends Thread{
        private BigInteger result = BigInteger.ZERO;
        private Long inputNumber;
        private boolean isFinished;

        FactorialThread(Long inputNumber){
            this.inputNumber= inputNumber;
            isFinished = false;
        }

        @Override
        public void run() {
            // calculate factorial
            isFinished = true;
        }


        public boolean isFinished() {
            return isFinished;
        }

        public BigInteger getResult() {
            return result;
        }
    }
}
