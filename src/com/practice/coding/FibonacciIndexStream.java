package com.practice.coding;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class FibonacciIndexStream {

    public static void main(String[] args) {
        String [] strArr = {"Zero","One", "Two", "Three", "Four", "Five","Six","Seven","Eight", "Nine","Ten",
        "Eleven", "Twelve","Thirteen","Fourteen","Fifteen","Sixteen", "Seventeen","Eighteen","Nineteen", "Twenty","TwentyOne","TwentyTwo"};

        AtomicInteger previous = new AtomicInteger();
        AtomicInteger current = new AtomicInteger(1);

        List<String> strings = Arrays.stream(strArr).takeWhile(n->(current.get()+previous.get())<=strArr.length).map(str->{
            int temp = current.get();
            current.set(previous.get()+temp);
            previous.set(temp);
            return   String.format("%d -> %s", current.get(), strArr[current.get()]);
        }).collect(Collectors.toList());

        System.out.println(strings);
    }
}
