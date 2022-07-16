package com.arrays;

import java.util.Arrays;

public class MergeSorted {
    public static void main(String[] args) {
        int nums1[] = {2,0}, m = 1, nums2[] = {1}, n = 0;
        merge(nums1, m, nums2, n);
        Arrays.stream(nums1).forEach(i-> System.out.println(i));
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        int num2Index = 0;
        for(int i=0;i<nums1.length;i++){
            if(nums1[i] !=  0 && nums1[i]>nums2[num2Index]){
                int temp = nums1[i];
                for(int j=i;j< nums1.length;j++){
                    int val = nums1[j];
                    nums1[j] = temp;
                    temp = val;
                }
                nums1[i] = nums2[num2Index];
                num2Index++;
                // insert
            }else if(nums2[num2Index]>nums1[i] && nums1[i]==0){
                nums1[i] = nums2[num2Index];
                num2Index++;
            }
        }
    }
}
