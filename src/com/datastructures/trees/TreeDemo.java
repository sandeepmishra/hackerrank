package com.datastructures.trees;

/**
 * 
 * @author sandeep</br>
 * 		</br>
 *
 *
 *         Trees having parent node as <b>root</b> and <b>child</b> nodes.</br>
 * 		</br>
 * 
 *         Two nodes that are children of same parent are siblings A node v is
 *         said to be external if it doesn't have child node, external nodes are
 *         also known as leaves. A node is internal if it has one or more
 *         children node An Edge is is pair of nodes
 * 
 *         InvalidPositionException, BoundryViolationException,
 *         EmptyTreeException
 * 
 *         The depth of v is the number of ancestors of v, excluding v itself.
 *         The height of a nonempty tree T is equal to the maximum depth of an
 *         external node of T.
 * 
 */
public class TreeDemo<E extends Comparable<E>> implements Tree<E> {

	Node<E> root = null;

	@Override
	public void insert(E e) {
		if (null == e)
			throw new NullPointerException();
		Node<E> node = new Node<E>(e);
		if (null == root) {
			root = node;
		} else {
			Node<E> temp = root;
			while (true) {
				if (temp.data.compareTo(e) > 0) // if data is less it will be added to left
				{
					temp = temp.left;
					if (null == temp) {
						temp = node;
						return;
					}

				} else if (temp.data.compareTo(e) < 0) {
					temp = temp.right;
					if (null == temp) {
						temp = node;
						return;
					}
				}
			}
		}
	}

	public void display(Node<E> root) {

		display(root.left);
		System.out.println(root.data);
		display(root.left);
	}

	class Node<E> {
		E data;
		private Node<E> left;
		private Node<E> right;

		public Node(E data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}

	@Override
	public boolean find() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete() {
		// TODO Auto-generated method stub
		return false;
	}

	public static void main(String[] args) {

		TreeDemo<Integer> b = new TreeDemo<>();
		b.insert(3);
		b.insert(8);
		b.insert(1);
		b.insert(4);
		b.insert(6);
		b.insert(2);
		b.insert(10);
		b.insert(9);
		b.insert(20);
		b.insert(25);
		b.insert(15);
		b.insert(16);
		
		b.display(b.root);
		
	
	}

}

interface Tree<E> {
	boolean find();

	boolean delete();

	void insert(E e);

}