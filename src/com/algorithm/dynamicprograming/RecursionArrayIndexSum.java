package com.algorithm.dynamicprograming;

public class RecursionArrayIndexSum {
    public static void main(String[] args) {
        int arr1[] = {1,2,3,4,5,6,};
        int arr2[] = {1,2,3,4,5,6,};
        sumAllPreviousElementsFromZero(arr1, 0);
        for (int i : arr1) {
            System.out.print(i+" ");
        }
    }

    static int[] sumAllPreviousElementsFromZero(int []arr, int n){
        if(n==arr.length-1){
            return arr;
        }else{
            arr[n+1] = arr[n]+arr[n+1];
            return sumAllPreviousElementsFromZero(arr, n+1);
        }
    }
}
