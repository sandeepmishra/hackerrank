package com.practice.thread;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class VaultOpenGuessThread {

    public static final int MAX_PASSWORD = 9999;

    public static void main(String[] args) {

        Random random= new Random();
        List<Thread> list  = new ArrayList<>();
        Vault vault = new Vault(random.nextInt(MAX_PASSWORD));
        list.add(new AscendingThread(vault));
        list.add(new DescendingThread(vault));
        list.add(new PoliceThread());

        list.forEach(t-> t.start());
    }

    private static class Vault{
        private int password;
        public Vault(int password){
            this.password = password;
        }

        public boolean isCorrectPassword(int guess){

            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return guess == this.password;
        }
    }

    private static abstract class HackerThread extends Thread{
        protected Vault vault;

        public HackerThread(Vault vault) {
            this.vault = vault;
            this.setName(this.getClass().getSimpleName());
            this.setPriority(Thread.MAX_PRIORITY);
        }

        @Override
        public void start() {
            super.start();
        }
    }

    private static class AscendingThread extends  HackerThread{

        public AscendingThread(Vault vault) {
            super(vault);
        }

        @Override
        public void run() {
            for(int guess=0;guess<MAX_PASSWORD;guess++){
                if(vault.isCorrectPassword(guess)){
                    System.out.println(this.getName()+ " guessed the password "+ guess);
                    System.exit(0);
                }
            }
        }
    }

    private static class DescendingThread extends  HackerThread{

        public DescendingThread(Vault vault) {
            super(vault);
        }

        @Override
        public void run() {
            for(int guess=MAX_PASSWORD;guess>0;guess--){
                if(vault.isCorrectPassword(guess)){
                    System.out.println(this.getName()+ " guessed the password "+ guess);
                    System.exit(0);
                }
            }
        }
    }


    private static class PoliceThread extends  Thread{
        @Override
        public void run() {
            for(int i=0;i<10;i++){
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(i);
            }
            System.out.println("Game over for you hacker");
            System.exit(0);
        }
    }
}
