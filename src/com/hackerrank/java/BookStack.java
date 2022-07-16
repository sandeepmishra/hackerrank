package com.hackerrank.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BookStack {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String input = br.readLine();
        int inputArr[]=new int[N];
        String arr[]=input.split(" ");
        for(int i=0;i<N;i++){
            inputArr[i]=Integer.parseInt(arr[i]);
        }
        System.out.println(getStackCount(N, inputArr));

    }

    public static int getStackCount(int N, int inputArr[]) {
        int stackCount=0;
        for(int i=0;i<N-1;i++){
            if(i==0){
                stackCount=getGcd(inputArr[i], inputArr[i+1]);
            }else{
                stackCount=getGcd(stackCount,inputArr[i+1]);
            }
        }
        return stackCount;
    }

    public static int getGcd(int a, int b){
        if(a==0){
            return b;
        }
        return getGcd(b%a, a);
    }
}
