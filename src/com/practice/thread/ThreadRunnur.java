package com.practice.thread;

public class ThreadRunnur {

	public static void main(String[] args) {
		ThreadApp threadApp = new ThreadApp();
		threadApp.start();
		Thread runnableThread = new Thread(new RunnableApp());
		runnableThread.start();
		System.out.println(Thread.currentThread()+" "+Thread.activeCount());
	}
}

class ThreadApp extends Thread implements Cloneable{
	public void run() {
		for(int i=0;i<5;i++){
			try {
				System.out.println("Thread :"+i);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO: handle exception
			}
		}
	}
}

class RunnableApp implements Runnable{
	@Override
	public void run() {
		for(int i=0;i<5;i++){
			try {
				System.out.println("Runnable :"+i);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO: handle exception
			}
		}
	}
}