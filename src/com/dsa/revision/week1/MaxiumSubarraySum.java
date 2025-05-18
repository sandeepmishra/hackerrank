package com.dsa.revision.week1;


import java.util.List;

/**
 * https://leetcode.com/problems/maximum-subarray/
 * https://www.hackerrank.com/challenges/maximum-subarray-sum/problem
 *
 * Given an array of integers, the task is to find the maximum subarray sum possible of all the non-empty subarrays.
 */
public class MaxiumSubarraySum {
    public static void main(String[] args) {

        //int a[] = {1, 3, 8, -2, 6, -8, 5};
        int a[] = {1, 3, 8, -2, 6, 0,-1, 2, -8, 5};
        System.out.println(maximumSubarraySum(a));

        int b[] = {1, 3, 8, -2, 6, 0,-1, 2, -8, 5};
        System.out.println(maximumSubarraySumUsaingKadannesAlgo(b));
    }

    /**
     * Brute force approach using two for loop
     */
    private static int maximumSubarraySum(int[] a) {
        int sum = Integer.MIN_VALUE;
        int currentSumm=0;
        for(int i=0;i<a.length;i++){
            for(int j=i;j<a.length;j++){
                currentSumm+=a[j];
                if(currentSumm>sum){
                    sum=currentSumm;
                }
            }
            currentSumm=0;
        }
        return sum;
    }





    /**
     * Kadane’s Algorithm
     *
     *Define two-variable currSum which stores maximum sum ending here and maxSum which stores maximum sum so far.
     * Initialize currSum with 0 and maxSum with INT_MIN.
     * Now, iterate over the array and add the value of the current element to currSum and check
     * If currSum is greater than maxSum, update maxSum equals to currSum.
     * If currSum is less than zero, make currSum equal to zero.
     * Finally, print the value of maxSum.
     *
     */
    private static int maximumSubarraySumUsaingKadannesAlgo(int[] a) {
        int currSum=0, maxSum=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++){
            currSum+=a[i];
            if(currSum>maxSum){
                maxSum=currSum;
            }
            if(currSum<0){
                currSum=0;
            }
        }


        return maxSum;
    }

}





