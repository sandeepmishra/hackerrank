package com.datastructures.stack;

import java.util.EmptyStackException;
import java.util.Stack;

public class StackListImpl {

	public static void main(String[] args) {
		CustomListStack<String> stack = new CustomListStack<>();
		System.out.println(stack.push("sdfj"));
		stack.push("sdjfhksdf");
		stack.push("43895ufj");
		System.out.println(stack.pop());
		System.out.println(stack.size());
		System.out.println(stack.isEmpty());
	}
}
/**
 * 
 * @author sandeep
 *
 * @param <E>
 * Stack LIFO (last in first out)
 */
class CustomListStack<E> extends Stack<E>
{
	protected int size;
	protected Node<E> top;
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public synchronized boolean isEmpty() {
		// TODO Auto-generated method stub
		return size==0;
	}
	// add on 0 index while pop it will make easier..
	
	@Override
	public E push(E item) {
		// TODO Auto-generated method stub
		Node<E> node = new Node<E>(item);
		if(null == top){
			top = node;
		}else{
			node.next=top;
			top = node;
		}
		size++;
		return item;
	}
	
	@Override
	public synchronized E peek() {
		if(null == top){
			throw new EmptyStackException();
		}
		return top.e;
	}
	
	@Override
	public synchronized E pop() {
		if(null == top){
			throw new EmptyStackException();
		}
		E e = top.e;
		top = top.next;
		size--;
		return e;
	}
	
	@Override
	public synchronized int size() {
		return size;
	}
	
	class Node<E>
	{
		Node<E> next;
		E e;
		public Node(E e) {
			this.next = null;
			this.e = e;
		}
	}
}