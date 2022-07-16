package com.practice.thread;

public class ThreadEvenOdd {

	private boolean isOdd=false;
	private int val=0;
	public static void main(String[] args) throws InterruptedException {
		ThreadEvenOdd threadEvenOdd = new ThreadEvenOdd();
		Thread t1 = new Thread(() -> {
			while(threadEvenOdd.val<10){
				try {
					threadEvenOdd.printEven();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});

		Thread t2 = new Thread(() -> {
			while(threadEvenOdd.val<10){
				try {
					threadEvenOdd.printOdd();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});

		t1.start();
		t2.start();
		t1.join();
		t2.join();

	}

	public void printEven() throws InterruptedException {
		synchronized (this){
			if(!isOdd){
				System.out.println(val);

				isOdd=true;
				val++;
				notify();
			}
			wait(1000);
		}
	}

	public void printOdd() throws InterruptedException {
		synchronized (this){
			if(isOdd){
				System.out.println(val);
				isOdd=false;
				val++;
				notify();
			}
			wait(1000);

		}
	}
}
