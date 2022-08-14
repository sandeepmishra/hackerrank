package com.smartinterview.hackerrank.week3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BinarySearch {

    public static void main(String[] args)throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String in [] = br.readLine().split(" ");
        String arr[] = br.readLine().split(" ");
        int n = Integer.parseInt(in[0]);
        int k = Integer.parseInt(in[1]);
        int input[]= new int[n];
        for(int i=0;i<n;i++){
            input[i]=Integer.parseInt(arr[i]);
        }
        System.out.println(binarySearch(input, k, 0, n-1));
    }

    static boolean binarySearch(int arr[], int k,int low,int high){
        if(low>high){
            return false;
        }else{
            int mid = (low+high)/2;
            if(k==arr[mid]){
                return true;
            }else if (k>arr[mid]){
                return binarySearch(arr, k, mid+1, high);
            }else{
                return binarySearch(arr, k, low, mid-1);
            }
        }
    }
}
