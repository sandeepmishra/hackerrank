package com.hackerrank.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ArrayManipulation {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String val = br.readLine();
        int operation = Integer.parseInt(val.split(" ")[1]);
        int n = Integer.parseInt(val.split(" ")[0]);
        int [][]queries =new int[operation][3];
        for(int i=0;i<operation;i++){
            val = br.readLine();
            queries[i][0]=Integer.parseInt(val.split(" ")[0]);
            queries[i][1]=Integer.parseInt(val.split(" ")[1]);
            queries[i][2]=Integer.parseInt(val.split(" ")[2]);
        }
        System.out.println(arrayManipulation(n, queries));
    }

    static long arrayManipulation(int n, int [][]queries){
        long arr[]=new long[n];
        long max = Integer.MIN_VALUE;
        for(int i=0;i<queries.length;i++){
            int start = queries[i][0];
            int end = queries[i][1];
            int val = queries[i][2];
            for(int k=start-1;k<=end-1;k++){
                arr[k]=arr[k]+val;
                if(arr[k]>max){
                    max=arr[k];
                }
            }

        }
        return max;
    }
}
