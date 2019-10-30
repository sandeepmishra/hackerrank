/*
package com.hackerrank.java;

public class InstanceInitializerCheck {

	public static void main(String[] args) {
		final B a = new ABC();
		a = new ABC();
		
		a.printA();
	}
}
interface A{
	default void printA() {
		System.out.println("print a");
	}
	
	static void printagain() {
		System.out.println("print again");
	}
}

interface B{
	//private int member;
	private void privateMethod() {
		
	}
	
	default void printA() {
		System.out.println("print b");
	}
	
	default void printB() {
		
	}
	
	static void printagain() {
		System.out.println("print again");
	}
	
	static void printOneByOne() {
		
	}
	
	//void abc();
}

class ABC implements A, B{

	@Override
	public void printA() {
		A.super.printA();
		A.printagain();
	}
	
	
}*/
