package com.practice.designpattern;

public class SingletonPattern {

	public static void main(String[] args) {
		Singleton singleton = Singleton.getInstance();
		if(null != singleton){
			System.out.println("Object created...");
		}
	}
}

class Singleton{
	private static Singleton singleton = null;
	private Singleton(){
		
	}
	
	public static Singleton getInstance(){
		if(null==singleton){
			synchronized (Singleton.class) {
				if(null == singleton){
					singleton = new Singleton();
				}
			}
		}
		return singleton;
	}
}
