package com.datastructures.list;

import java.util.stream.Stream;

public class CircularLinkedList {

	
	public static void main(String[] args) {
		Stream.of(1000, 2000, 3000, 4000).filter(e->e>2000).peek(System.out::print);//.findFirst().orElse(null);
	}
}
