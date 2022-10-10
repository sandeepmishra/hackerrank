package com.algorithm.dynamicprograming;

public class RecursionArrayIndexSum {
    public static void main(String[] args) {
        int arr1[] = {1,2,3,4,5,6,};
        int arr2[] = {1,2,3,4,5,6,};
//        sumAllPreviousElementsFromZero(arr1, 0);
//        for (int i : arr1) {
//            System.out.print(i+" ");
//        }

        sumAllPreviousElementsFromZeroFromLast(arr2, 5);
        for (int i : arr2) {
            System.out.print(i+" ");
        }
    }

    /**
     * This method starts from front to last
     * @param arr
     * @param n
     * @return
     */
    static int[] sumAllPreviousElementsFromZero(int []arr, int n){
        if(n==arr.length-1){
            return arr;
        }else{
            arr[n+1] = arr[n]+arr[n+1];
            return sumAllPreviousElementsFromZero(arr, n+1);
        }
    }

    static int sumAllPreviousElementsFromZeroFromLast(int []arr, int n){
        if(n==0){
            return arr[0];
        }else{
            return arr[n] = arr[n]+sumAllPreviousElementsFromZeroFromLast(arr, n-1);
        }
    }
}
