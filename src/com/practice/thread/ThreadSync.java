package com.practice.thread;

public class ThreadSync {

	public int count  =0;
	public  synchronized int increment(){
		return count++;
	}
	public static void main(String[] args) {
		new ThreadSync().doWork();
	}
	public void doWork(){
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				for(int i=0;i<10000;i++){
					increment();
				}
			}
		});
		
		Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				for(int i=0;i<10000;i++){
					increment();
				}
			}
		});
		
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(count);
	}
}
