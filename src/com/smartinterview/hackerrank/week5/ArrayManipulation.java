package com.smartinterview.hackerrank.week5;

import java.util.ArrayList;
import java.util.List;

/**
 * https://www.hackerrank.com/challenges/crush/problem
 *
 */
public class ArrayManipulation {
    public static void main(String[] args) {

       int n = 5;
       List<List<Integer>> queries = new ArrayList<>();
       List<Integer> li = new ArrayList<>();
        li.add(1);
        li.add(2);
        li.add(100);
        queries.add(li);
        li = new ArrayList<>();
        li.add(2);
        li.add(5);
        li.add(100);
        queries.add(li);
        li = new ArrayList<>();
        li.add(3);
        li.add(4);
        li.add(100);
        queries.add(li);
        System.out.println(arrayManipulation(n, queries));
    }

    public static long arrayManipulation(int n, List<List<Integer>> queries) {
        long [] arr = new long[n];
        for(List<Integer> query:queries){
            int a = query.get(0);
            int b = query.get(1);
            int k = query.get(2);

            long val = arr[a-1];
            arr[a-1] = k+val;
            if(b<n){
                val = arr[b];
                arr[b] =  val-k;
            }
        }

        long max = Integer.MIN_VALUE;
        for(int i=1;i<n;i++){
            long val = arr[i]+arr[i-1];
            arr[i] = val;
            max = Math.max(max, val);
        }
        return max;
    }
}
