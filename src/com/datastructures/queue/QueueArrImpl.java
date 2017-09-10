package com.datastructures.queue;

/**
 * 
 * @author sandeep
 *
 */
public class QueueArrImpl {
	public static void main(String[] args) {
		CustomArrayQueue<String> queue = new CustomArrayQueue<>(5);
		queue.add("1");
		queue.add("4");
		queue.add("2");
		queue.add("3");
		queue.add("5");
		System.out.println(queue.remove()+" retrived element..");
		queue.remove();
		queue.printqueue();
	}
	
}

/**
 * 
 * @author sandeep
 *
 * @param <E>
 */
class CustomArrayQueue<E> 
{
	
	private int size;
	private int capacity;
	private E [] e;
	public static final int DEFAULT_CAPACITY = 1000;
	
	int front;
	int rear;
	
	@SuppressWarnings("unchecked")
	public CustomArrayQueue(int capacity) {
		size=0;
		this.capacity = capacity;
		e = (E[]) new Object[this.capacity];
		this.front = 0;
		this.rear=0;
	}
	
	public CustomArrayQueue() {
		this(DEFAULT_CAPACITY);
	}
	
	/**
	 *  Returns size of Queue
	 *  
	 * @return
	 */
	public int size() {
		return size;
	}
	
	/**
	 * Check whether queue is empty
	 * @return
	 */
	public boolean isEmpty() {
		return size==0;
	}
	
	/**
	 * Insert element into queue.
	 * @param e
	 * @return
	 */
	public boolean offer(E e) {
		
		if(size!=capacity && null != e) {
			this.e[size]=e;
			size++;
			return true;
		}
		return false;
	}
	
	/**
	 * Get first element of queue without removing it from queue
	 * @return
	 */
	public E peek() {
		if(null != e[0]) {
			return e[0];
		}
		return null;
	}
	
	/**
	 *  Return top element and remove it from queue.
	 * @return
	 */
	public E poll() {
		E obj = e[0];
		for(int i=0;i<size;i++) {
			if(i==size-1) {
				e[i] = null;
			}else {
				e[i] = e[i+1];
			}
		}
		size--;
		return obj;
	}
	
	/**
	 * 
	 * on add: r should be next index to fill 
	 * rear = (rear + 1) mod n
	 * 
	 * @param e
	 * @return
	 */
	
	public boolean add(E e) {
		if(null == e) {
			throw new NullPointerException();
		}
		if(capacity<size) {
			throw new IllegalStateException();
		}
		this.e[rear]=e;
		rear = (rear + 1) % capacity;
		size++;
		return true;
	}
	
	/**
	 * Returns and removes first element of queue, by using circular array we can avoid loops and increase efficiency.
	 * front =0; rear = 0; 
	 * e[front] = null; 
	 * front = (front+1) mod n;
	 * @return
	 */
	public E remove() {
		if(null == e[front]) {
			throw new NullPointerException();
		}
		/*for(int i=0;i<size;i++) {
			e[i]=e[i+1];
			if(i==size-1) {
				e[i] = null;
			}
		}*/
		E obj = e[front];
		e[front] = null;
		front = (front + 1) % capacity;
		size--;
		return obj;
	}
	
	/**
	 * Returns but no remove element
	 * @return
	 */
	public E element() {
		if(null == e[0]) {
			throw new NullPointerException();
		}
		return e[0];
	}
	
	public void printqueue() {
		for(int i=front;i<(front + size);i++) {
			System.out.println(e[(i) % capacity] );
		}
	}
}