package com.practice.thread;

import java.util.Random;

/**
 * except double and long all primitive types can be used without synchronized or volatile
 * but for double and long write operation happens in two steps
 * first for first 32 bit and second for remaining 32 bit
 *
 */
public class VolatileDemo {

    public static void main(String[] args) {
        Metrics metrics = new Metrics();
        BusinessLogic businessLogic =new BusinessLogic(metrics);
        BusinessLogic businessLogic1 = new BusinessLogic(metrics);

        MetricsPrinter metricsPrinter = new MetricsPrinter(metrics);
        businessLogic.start();
        businessLogic1.start();
        metricsPrinter.start();
    }

    public static class MetricsPrinter extends  Thread{
        private Metrics metrics;

        MetricsPrinter(Metrics metrics){
            this.metrics = metrics;
        }
        @Override
        public void run() {
            while(true){
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Current average is: "+metrics.getAverage());
            }
        }
    }
    public static class BusinessLogic extends Thread{
        private Metrics metrics;
        private Random random = new Random();

        public BusinessLogic(Metrics metrics){
            this.metrics = metrics;
        }

        @Override
        public void run() {
            while (true){
                long startTime = System.currentTimeMillis();

                try {
                    Thread.sleep(random.nextInt(10));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                metrics.addSample(System.currentTimeMillis() - startTime);
            }
        }
    }
    private static class Metrics{
        private long count =0;
        private volatile double average = 0.0;

        public void addSample(long sample){
            double currentSum = count * average;
            count++;
            average = (currentSum + sample) / count;
        }

        public double getAverage(){
            return  average;
        }
    }
}
