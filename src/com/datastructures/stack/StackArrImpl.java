package com.datastructures.stack;

import java.util.EmptyStackException;
import java.util.Stack;

/**
 * 
 * @author sandeep
 *
 */
public class StackArrImpl {

	public static void main(String[] args) {
		CustomArrayStack<String> stack = new CustomArrayStack<>();
		System.out.println(stack.size());
		stack.push("sdfsf");
		stack.push("eoisad");
		System.out.println(stack.size);
		System.out.println(stack.peek());
		stack.pop();
		stack.push("345dfg");
		stack.printStack();
	}
}

class CustomArrayStack<E> extends Stack<E>
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	protected int size;
	protected static int DEFAULT_SIZE = 1000;
	int capacity;
	protected E [] e;
	
	public CustomArrayStack() {
		this(DEFAULT_SIZE);
	}
	
	@SuppressWarnings("unchecked")
	public CustomArrayStack(int capacity){
		this.capacity = capacity;
		e = (E[])new Object[capacity];
		size=0;
		this.capacity = capacity;
	}
	
	@Override
	public synchronized boolean isEmpty() {
		return size==0;
	}
	
	@Override
	public E push(E item) {
		if(size==capacity){
			throw new StackOverflowError();
		}
		e[size] = item;
		size++;
		return item;
	}
	
	@Override
	public synchronized E peek() {
		if(isEmpty()){
			throw new EmptyStackException();
		}
		return e[size-1];
	}
	
	@Override
	public synchronized E pop() {
		if(isEmpty()){
			throw new EmptyStackException();
		}
		E obj = e[size-1];
		e[size-1]=null;
		size--;
		return obj;
	}
	
	@Override
	public synchronized int size() {
		return size;
	}
	
	public void printStack(){
		for(int i=0;i<size;i++){
			System.out.print(e[i]+" ");
		}
	}
}
