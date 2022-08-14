package com.smartinterview.hackerrank.week3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class FindingFrequencyUsingSortingAndSearching {
    public static void main(String[] args)throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String [] arr = br.readLine().split(" ");
        int [] input = new int[n];
        for(int i=0;i<n;i++){
            input[i]=Integer.parseInt(arr[i]);
        }
        Arrays.sort(input);
        int q = Integer.parseInt(br.readLine());
        for(int i=0;i<q;i++){
            int k = Integer.parseInt(br.readLine());
            int p1 = bstP1Index(input, n, k);
            int p2 = bstP2Index(input, n, k);
            System.out.println(p1 ==0 && p2 ==0 ? 0 : (p2-p1+1));
        }
    }

    static int bstP1Index(int [] arr, int n, int k){
        int low=0, high = n-1, mid, p1=0;
        while(low<=high){
            mid = (low+high)/2;
            if(arr[mid]==(k)){
                p1=mid;
                high=mid-1;
            }else if(arr[mid]<k){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return p1;
    }

    static int bstP2Index(int [] arr, int n, int k){
        int low=0, high = n-1, mid, p2=0;
        while(low<=high){
            mid = (low+high)/2;
            if(arr[mid]==(k)){
                p2=mid;
                low=mid+1;
            }else if(arr[mid]<k){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return p2;
    }
}
