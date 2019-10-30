package com.practice.thread;

import java.util.Scanner;

public class ThreadStackOverflowDemo {

	public static void main(String[] args) {
		System.out.println("please enter two numbers to add");
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter first number.");
		int a = sc.nextInt();
		System.out.println("please enter second number.");
		int b = sc.nextInt();
		System.out.println("sum is "+(a+b));
	}
}
