package com.practice.thread;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class BlockingQueueProducerConsumer {
    public static void main(String[] args) throws InterruptedException {
        BlockingQueue<String> blockingQueue = new LinkedBlockingQueue<>(10);
        BlockingProducer blockingProducer = new BlockingProducer(blockingQueue);
        Thread producer = new Thread(blockingProducer);

        BlockingConsumer blockingConsumer = new BlockingConsumer(blockingQueue);
        Thread consumer = new Thread(blockingConsumer);
        producer.start();
        consumer.start();
        Thread.sleep(2000);
        blockingProducer.stop();
        producer.join();
        consumer.join();
        //System.out.println("exit main method...");
        //System.exit(0);
    }
}

class BlockingConsumer implements Runnable {

    private BlockingQueue<String> blockingQueue;

    public BlockingConsumer(BlockingQueue<String> blockingQueue) {
        this.blockingQueue = blockingQueue;
    }

    @Override
    public void run() {
        while (true) {
            try {
                System.out.println("Consumer Thread: " + blockingQueue.take());
                System.out.println("Elements available to be consumed in.." + blockingQueue.size());
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class BlockingProducer implements Runnable {
    private BlockingQueue<String> blockingQueue;
    private volatile boolean producing = false;
    private volatile int count = 65;

    public BlockingProducer(BlockingQueue<String> blockingQueue) {
        this.blockingQueue = blockingQueue;
    }

    @Override
    public void run() {

        char s = (char) count;
        while (!producing) {
            try {
                blockingQueue.put(Character.toString(s));
                System.out.println("Producer Thread: " + s);
                Thread.sleep(100);
                count++;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    public void stop() {
        System.out.println("Producer stopped..");
        producing = false;
    }
}


