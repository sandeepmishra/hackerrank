package com.datastructures.list;

import javax.print.attribute.Size2DSyntax;

/**
 * 
 * @author sandeep
 *
 * Custom Double linked list implementaton. 
 * 
 *
 * @param <E>
 */
public class DListImpl<E> {

	
	private int size;
	Node<E> head = null;
	Node<E> tail = null;
	 
	public DListImpl() {
		size = 0;
		head = null;
		tail = null;
	}
	
	public int size() {
		return size;
	}
	
	public boolean isEmpty() {
		return size ==0;
	}
	
	public boolean add(E e) {
		if(null == e) {
			throw new NullPointerException();
		}else {
			Node<E> node = new Node<E>(e);
			if(null == head) {
				head = node;
				tail = node;
				head.prev = null;
				tail.prev = null;
			}else {
				tail.next = node;
				node.prev = tail;
				tail = tail.next;
			}
			size++;
		}
		return true;
	}
	
	public boolean addLast(E e) {
		if(null == e) {
			throw new NullPointerException();
		}
		Node<E> node = new Node<E>(e);
		if(null == tail) {
			head = node;
			tail = node;
		}else {
			tail.next = node;
			node.prev = tail;
			tail = tail.next;
		}
		size++;
		return true;
	}
	
	public boolean addFirst(E e) {
		if(null == e) {
			throw new NullPointerException();
		}
		Node<E> node = new Node<E>(e);
		if(null == head) {
			head = node;
			tail = node;
		}else {
			Node<E> temp = head;
			head = node;
			temp.prev = node;
			head.next = temp;
		}
		size++;
		return true;
	}
	
	public void add(int index, E e) {
		if(index >= size()){
			throw new ArrayIndexOutOfBoundsException();
		}
	}
	
	public E get(int index) {
		if(null == head)
			throw new NullPointerException();
		int count = 0;
		Node<E> temp = head;
		while(null != temp) {
			if(index==count) {
				return temp.data;
			}else {
				temp = temp.next;
			}
		}
		return null;
	}
	
	public E getFirst() {
		if(null == head) {
			throw new NullPointerException();
		}
		return head.data;
	}
	
	public E getLast() {
		if(null == tail) {
			throw new NullPointerException();
		}
		return tail.data;
	}
	
	/**
	 *  retrives and removes from head
	 * @return
	 */
	public E remove() {
		if(null == head) {
			throw new NullPointerException();
		}
		head = head.next;
		size--;
		return head.data;
	}
	
	public E remove(int index) {
		return null;
	}
	
	public E removeLast() {
		if(null == head) {
			throw new NullPointerException();
		}
		Node<E> temp = tail.prev;
		E e = tail.data;
		temp.next = null;
		tail= temp;
		size--;
		return e;
	}
	/**
	 * 
	 * @author sandeep
	 *
	 * Inner node class
	 * @param <E>
	 * 
	 */
	private class Node<E>{
		private Node<E> next;
		private Node<E> prev;
		private E data;
		
		public Node(E data) {
			this.data = data;
			this.next = null;
			this.prev = null;
		}
	}
	
	public void printlist() {
		Node<E> temp = head;
		while(null!= temp) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
	
	public static void main(String[] args) {
		DListImpl<String> dlist = new DListImpl<>();
		dlist.add("rdfs");
		dlist.addLast("last added");
		dlist.addFirst("first added");
		System.out.println(dlist.getFirst()+ " get first");
		System.out.println(dlist.getLast()+" get last");
		System.out.println(dlist.removeLast()+" removed from list");
		System.out.println(dlist.size()+" after removal");
		System.out.println("---------print list--------");
		dlist.printlist();
	}
}
