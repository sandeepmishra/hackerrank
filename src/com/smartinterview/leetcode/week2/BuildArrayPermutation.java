package com.smartinterview.leetcode.week2;

public class BuildArrayPermutation {

    public static void main(String[] args) {
        int[] nums = {0,2,1,5,3,4};
        int ans[] = new BuildArrayPermutation().buildArray(nums);
        System.out.print("{ ");
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
        System.out.print(" }");
    }

    public int[] buildArray(int[] nums) {
        int ans[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            ans[i]=nums[nums[i]];
        }
        return ans;
    }
}
