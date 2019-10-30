package com.datastructures.list;

public class CustomList {

	public static void main(String[] args) {
		CustomListImpl<String> list = new CustomListImpl<String>();
		list.add("a");
		list.add("c");
		list.add("b");
		list.add("f");
		list.remove("b");
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
	
	/**
	 * Deleting a node for a given key.
	 * @param e
	 * @return
	 */
	
	public boolean remove(E e) {
		if(null == e)
			throw new NullPointerException();
		boolean isPresent = false;
		Node<E> tempnode = head;
		Node<E> prevNode = null;
		if(tempnode.data.equals(e)) {
			head = head.next;
			isPresent = true;
		}else {
			while(!tempnode.data.equals(e)) {
				prevNode = tempnode;
				tempnode = tempnode.next;
			}
			if(null != tempnode.next) {
				prevNode.next = tempnode.next;
			}else {
				prevNode.next = null;
			}
			isPresent =  true;
		}
		
		if(isPresent) {
			return isPresent;
		}else {
			return false;
		}
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