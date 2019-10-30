package com.practice.lambda;

public class LambdaDemo {
	public static void main(String[] args) {
		Greeting greeting = new HelloWorld();
		Greeter greeter = new Greeter();
		greeter.greet(greeting);
		
		Greeting greet = () -> System.out.println("Hello World!");
		
		/**
		 * 	() -> System.out.println("Hello World!"); is equivalant to below code
		 * 	
		 *			  	greet = new Greeting() {
		 *				
		 *				@Override
		 *				public void perform() {
		 *					System.out.println("Hello World!");
		 *				}
		 *			};
		 */
		
		greet.perform();
		
		SquareCalc calc = (a)-> a*a;
		
		System.out.println(calc.numbersquare(3));
	}
}

class Greeter{
	public void greet(Greeting greeting) {
		greeting.perform();
	}
}

interface Greeting{
	public void perform();
}

class HelloWorld implements Greeting
{
	@Override
	public void perform() {
		System.out.println("Hello World!");
	}
}

@FunctionalInterface
interface SquareCalc{
	public int numbersquare(int num);
}