package com.practice.thread.udemy.example;

public class DeadLockScenario {

    public static void main(String[] args) {
        InterSection interSection = new InterSection();
        Thread t1 = new Thread(new ThreadA(interSection));
        Thread t2 = new Thread(new ThreadB(interSection));
        t1.start();
        t2.start();
    }

    static class ThreadA implements Runnable{

        InterSection interSection;

        public ThreadA(InterSection interSection) {
            this.interSection = interSection;
        }

        @Override
        public void run() {
            interSection.takeRoadA();
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    static class ThreadB implements Runnable{
        InterSection interSection;

        public ThreadB(InterSection interSection) {
            this.interSection = interSection;
        }

        @Override
        public void run() {
            interSection.takeRoadB();
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


    public static class InterSection{
        Object lockA = new Object();
        Object lockB = new Object();

        public void takeRoadA(){
            synchronized (lockA){
                System.out.println("Road A lock a acquired.");
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (lockB){
                    System.out.println("Road A lock b acquired.");
                }
            }
        }

        public void takeRoadB(){
            synchronized (lockB){
                System.out.println("Road B lock b acquired.");
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (lockA){
                    System.out.println("Road B lock a acqired.");
                }
            }
        }
    }
}
