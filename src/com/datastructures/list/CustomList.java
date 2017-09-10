package com.datastructures.list;

public class CustomList {

	public static void main(String[] args) {
		CustomListImpl<String> list = new CustomListImpl<String>();
		list.add("a");
		list.add("c");
		list.add("b");
		list.add("f");
		list.printList();
	}
}
class CustomListImpl<E>{
	Node<E> head = null;
	private int size;
	
	public CustomListImpl() {
		head = null;
		size = 0;
	}
	
	
	public void add(E e){
		Node<E> node = new Node<E>(e);
		if(head==null){
			head = node;
		}else{
			Node<E> current = head;
			while(null != current.next){
				current = current.next;
			}
			current.next=node;
		}
		size++;
	}
	
	public int size(){
		return size;
	}
	
	public void printList(){
		Node<E> current = head;
		while(null != current){
			System.out.println(current.data);
			current = current.next;
		}
	}
	 class Node<E>{
		
		Node<E> next;
		E data;
		
		public Node(E data) {
			this.data = data;
			this.next=null;
		}
	}
}