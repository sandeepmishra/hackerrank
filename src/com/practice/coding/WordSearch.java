package com.practice.coding;

import java.util.Arrays;
import java.util.stream.Stream;

public class WordSearch {
    public static void main(String[] args) {
        int arr[]= {1,2,1,3,2,5};
        System.out.println(singleNumber(arr));
    }

    public static int[] singleNumber(int[] nums) {
        int result[]= new int[2];
        int indexcount=0;
        for(int i=0;i<nums.length; i++){
            int count=0;
            for(int j=0;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    count++;
                }
            }

            if(count==1){
                result[indexcount]=nums[i];
                indexcount++;
            }
        }
        return result;
    }
}
