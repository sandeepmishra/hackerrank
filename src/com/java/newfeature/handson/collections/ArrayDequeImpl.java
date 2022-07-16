package com.java.newfeature.handson.collections;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.Queue;

/**
 * Resizeable array implementation of Deque
 * This class is likely to be faster than Stack when used as a stack, and faster than LinkedList when used as a queue.
 * The iterators returned by this class's iterator method are fail-fast:
 */
public class ArrayDequeImpl {
    public static void main(String[] args) {
        Queue<String> stringQueue = new ArrayDeque<>();
        stringQueue.offer("offer1");
        stringQueue.offer("offer2");
        stringQueue.offer("offer3");
//        System.out.println(stringQueue.poll());
//        System.out.println(stringQueue.peek());
//        System.out.println(stringQueue.size());
//
//        Deque<String> stringDeque = new ArrayDeque<>();

        Iterator<String> stringIterator = stringQueue.iterator();
        while (stringIterator.hasNext()){
            System.out.println(stringIterator.next());
            stringQueue.add("Offer23");
        }

    }
}
