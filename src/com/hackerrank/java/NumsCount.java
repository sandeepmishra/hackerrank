package com.hackerrank.java;

import java.util.ArrayList;
import java.util.List;

public class NumsCount {
    public static void main(String[] args) {
        int arr[]={3,1,3,4,3, 2, 3};

        System.out.println(maxOperations(arr, 6));
    }

    public static int maxOperations(int[] nums, int k) {
        int count = 0;
        boolean boolArr[]=new boolean[nums.length];
        for(int i=0;i<nums.length;i++){

            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==k && !boolArr[i] && !boolArr[j]){
                    count++;
                    boolArr[i]=true;
                    boolArr[j]=true;
                    break;
                }
            }
        }
        return count;
    }
}
