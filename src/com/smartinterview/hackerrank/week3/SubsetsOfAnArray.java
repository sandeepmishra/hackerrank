package com.smartinterview.hackerrank.week3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubsetsOfAnArray {
    public static void main(String[] args)throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for(int i=0;i<t;i++){
            int n = Integer.parseInt(br.readLine());
            String [] arr = br.readLine().split(" ");
            int inta[]=new int[n];
            for(int j=0;j<n;j++){
                inta[j]=Integer.parseInt(arr[j]);
            }
            Arrays.sort(inta);
            printSubset(inta, 0, n);
        }
    }

    private static void printSubset(int[] inta, int i, int n) {

    }
}