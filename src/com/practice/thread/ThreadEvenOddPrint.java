package com.practice.thread;

public class ThreadEvenOddPrint {
	int count = 1;
	boolean isOdd = true;

	public void printEven() {
		synchronized (this) {
			if (isOdd) {
				try {
					wait(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println("EVEN: " + count);
			isOdd = true;
			count++;
			notify();
		}
	}

	public void printOdd() {
		synchronized (this) {
			if (!isOdd) {
				try {
					wait(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println("ODD : " + count);
			count++;
			isOdd = false;
			notify();
		}
	}

	public static void main(String[] args) {
		ThreadEvenOddPrint th = new ThreadEvenOddPrint();
		Thread t1 = new Thread(() -> {
			// TODO Auto-generated method stub
			while (th.count < 10) {
				th.printOdd();
			}

		});

		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				while (th.count < 10) {
					th.printEven();
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
	}
}
