package com.scaler.academy.week1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

/**
 *  Input: {4, 2, -3, 1, 6}
 */
public class SubArrayZeroSum {
    public static void main(String[] args) {
        String arr[] = {"4", "2", "3", "1", "6"};
        //Arrays.stream(arr).forEach(i-> System.out.println(i));
        //printAllZeroSumSubArrays(arr);
        //checkIfSubArrayWithSumZeroExists(arr);
        Integer[] result = Stream.of(arr).mapToInt(Integer::parseInt).boxed().toArray(Integer[]::new);
        int value = Arrays.stream(result).reduce(0, (sum, val) -> {
            if(val%2!=0){
              return sum+val;
            }
            return sum;
        });
        System.out.println(value);
    }

    // brute-force
    public static void printAllZeroSumSubArrays(int arr[]){
        for(int i=0;i<arr.length;i++){
            int sum =0;
            for(int j=i;j<arr.length;j++){
                sum+=arr[j];
                if(sum==0){
                    System.out.println("Subarray [" + i + "…" + j + "]");
                }
            }
        }
    }

    // with hashing
    public static void printAllZeroSumSubArraysWithSingleLoop(int arr[]){

    }

    public static boolean checkIfSubArrayWithSumZeroExists(int arr[]){
        Set<Integer> integers = new HashSet<>();
        int sum=0;

        for(int i=0;i<arr.length;i++){
            sum+=arr[i];

            if(arr[i]==0 || sum==0 || integers.contains(sum)){
                System.out.println(true);
                return true;
            }
            integers.add(sum);
        }
        return false;
    }
}
