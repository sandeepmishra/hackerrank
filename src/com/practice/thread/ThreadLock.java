package com.practice.thread;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class ThreadLock {

	List<Integer> list1 = new ArrayList<>();
	List<Integer> list2 = new ArrayList<>();
	private Object lock1 =new Object();
	private Object lock2 =new Object();
	Map<String, String> map = new HashMap<>();
	public void stageOne() {
		
		synchronized (lock1) {
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO: handle exception
			}
			list1.add(new Random().nextInt(100));
		}
	}

	public void stageTwo() {
		
		synchronized (lock2) {
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO: handle exception
			}
			list2.add(new Random().nextInt(100));
		}
	}

	public void process() {
		for (int i = 0; i < 1000; i++) {
			stageOne();
			stageTwo();
		}
	}

	public void main() {
		System.out.println("start...");
		long startCurrentMillis = System.currentTimeMillis();
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				process();
			}
		});

		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				process();
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
		System.out.println("Total time taken: "+(System.currentTimeMillis()-startCurrentMillis));
		System.out.println("List1 :" + list1.size() + " List2 : " + list2.size());
	}

	public static void main(String[] args) {
		new ThreadLock().main();
	}
}
