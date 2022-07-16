package com.practice.thread;

import java.math.BigInteger;

public class InterruptedDemo {


    public static void main(String[] args) {
        Thread t = new Thread(new BlockingThread());
        t.start();
        t.interrupt();// this can be one method to stop a thread using
        // interrupted when thread is handling interrupted exception


        Thread t2 = new Thread(new LongComputationalTask(new BigInteger("23"), new BigInteger("43895")));
        t2.start();// in this scenario thread.interrupt() will not stop the thread
        // and can be done throw explicit interrupted handling
    }

    // if thread is executing a method that throws an interruptedException
    public static class BlockingThread implements Runnable{
        @Override
        public void run() {
            try {
                Thread.sleep(500000);
            } catch (InterruptedException e) {
                System.out.println("exist from blocking thread..");
            }
        }
    }

    // if thread code is handling the interrupt signal explicitly or by setting deamon true
    public static class LongComputationalTask implements Runnable{
        BigInteger base, power;

        public LongComputationalTask(BigInteger base, BigInteger power) {
            this.base = base;
            this.power = power;
        }

        @Override
        public void run() {
            System.out.println(base+" ^ "+power+" = "+pow(base, power));
        }

        private BigInteger pow(BigInteger base, BigInteger power) {
            BigInteger result = BigInteger.ONE;
            for(BigInteger i=BigInteger.ZERO;i.compareTo(power) != 0;i = i.add(BigInteger.ONE)){
                if(Thread.currentThread().isInterrupted()){
                    System.out.println("explicit intrruption handling to stop thread execution");
                    return BigInteger.ZERO;
                }
                result = result.multiply(base);
            }
            return result;
        }
    }
}
