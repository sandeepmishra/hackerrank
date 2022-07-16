package com.datastructures.queue;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * An unbounded priority queue based on a priority heap. The elements of the priority queue are ordered according to their natural ordering, or by a Comparator provided at queue construction time, depending on which constructor is used.
 * Non comparator instance insertion will cause class cast exception
 *
 * boolean
 * offer(E e)
 * Inserts the specified element into this priority queue.
 * E
 * peek()
 * Retrieves, but does not remove, the head of this queue, or returns null if this queue is empty.
 * E
 * poll()
 * Retrieves and removes the head of this queue, or returns null if this queue is empty.
 *
 */
public class PriorityQueueCheck {

    public static void main(String[] args) {
//        AbstractQueue<Integer> integerPriorityQueue = new PriorityQueue<>();
//        integerPriorityQueue.offer(54);
//        integerPriorityQueue.offer(34);
//        integerPriorityQueue.offer(24);
//        integerPriorityQueue.offer(31);
//        integerPriorityQueue.offer(13);
//        integerPriorityQueue.offer(14);
//        integerPriorityQueue.offer(7);
//
//        Predicate<Integer> p = (x) -> (x < 15);
//        //integerPriorityQueue.removeIf(p);
//        //System.out.println(integerList);
//        System.out.println(integerPriorityQueue);
//
//        Iterator<Integer> iterator = integerPriorityQueue.iterator();
//        for(Integer val: integerPriorityQueue){
//            //int val = iterator.next();
//            if(val==7 || val == 14 || val == 24){
//                //iterator.remove();
//                integerPriorityQueue.remove();
//            }
//        }
//
//        System.out.println(integerPriorityQueue);
//
//        List<Integer> numbers = Stream.iterate(1, n -> n + 1)
//                .limit(10)
//                .collect(Collectors.toList());
//        System.out.println(numbers);
        boolean val = true;
        Optional.ofNullable(val).filter(Boolean::booleanValue).ifPresent(System.out::println);

    }
}
