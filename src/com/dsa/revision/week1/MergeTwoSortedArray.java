package com.dsa.revision.week1;

/**
 * https://leetcode.com/problems/merge-sorted-array/
 */
public class MergeTwoSortedArray {
    public static void main(String[] args) {
        int nums1[], nums2[],m,n;
        nums1 = new int[]{1, 2, 3, 0, 0, 0};
        m = 3;
        nums2 = new int[]{2,5,6};
        n = 3;
        merge(nums1, m, nums2, n);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int j=nums1.length-1;
        n=n-1;m=m-1;
        while(m>=0 && n>=0){
            if(nums1[m]>nums2[n]){
                nums1[j--]=nums1[m--];
            }else{
                nums1[j--]=nums2[n--];
            }
        }

        while(n>=0){
            nums1[j--]=nums2[n--];
        }
    }
}
