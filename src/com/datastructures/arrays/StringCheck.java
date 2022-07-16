package com.datastructures.arrays;

public class StringCheck implements SamplInterface{
	public static void main(String[] args) {
		String s="abc";
		String s2 = new String("abc");
		String s3 = s+s2;
		System.out.println(s==s2);
		System.out.println(s.hashCode()==s2.hashCode());
	}

	@Override
	public void sampleMethod() {
		System.out.println("calling sample method...");
	}
}

class ManyImpl implements SamplInterface
{

	@Override
	public void sampleMethod() {
		System.out.println("kfdhaksf");
	}
}

interface  SamplInterface{
	void sampleMethod();
}

class PojoDemo{
	private String name;
	private String deba;

	public void setName(String name) {
		this.name = name;
	}

	public void setDeba(String deba) {
		this.deba = deba;
		SamplInterface s = new StringCheck();
		s.sampleMethod();
	}


}

/*
enum Element{
	HELIUM("He", "Gas"),
	MAGNESIUM("Mg", "Solid");
	
	private String symbol;
	private nature;
	
	
	
}

interface MyInterface{
	void method1();
	static void method2() {};
}

abstract class Abc implements MyInterface{
	abstract void method1();
}

class  abstract Child extends Abc implements MyInterface{

	public
	void method1() {
		// TODO Auto-generated method stub
		
	}
	
	public static void method2();
	
}*/