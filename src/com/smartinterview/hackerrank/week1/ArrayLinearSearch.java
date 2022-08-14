package com.smartinterview.hackerrank.week1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ArrayLinearSearch {
    public static void main(String[] args)throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String arr[] = br.readLine().split(" ");
        int N = Integer.parseInt(str.split(" ")[0]);
        int key = Integer.parseInt(str.split(" ")[1]);
        int index=0;
        for(int i=0;i<N/2;i++){
            if(Integer.parseInt(arr[i])==key){
                index=i;
            }
            if(Integer.parseInt(arr[arr.length-i-1])==key){
                index= arr.length-i-1;
            }
        }
        System.out.println(index);
    }
}
