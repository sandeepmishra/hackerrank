package com.smartinterview.hackerrank.week3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SmallerElements {
    public static void main(String[] args)throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for(int i=0;i<t;i++){
            int n = Integer.parseInt(br.readLine());
            String [] arr = br.readLine().split(" ");
            System.out.println(getSmallCount(arr, 0, n, 0));
        }
    }

    private static int getSmallCount(String[] inta, int i, int n,int count) {
        if(i==n){
            return count;
        }

        for(int j=i;j<n;j++){
            if(Integer.parseInt(inta[j])<Integer.parseInt(inta[i])){
                count++;
            }
        }
        return count+getSmallCount(inta, i+1, n, count);
    }
}
