package com.smartinterview.hackerrank.week5;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ReverseSentence {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            String arr[] = br.readLine().split(" ");

            for(int j=arr.length-1;j>=0;j--){
                System.out.print(arr[j]+" ");
            }
            System.out.println();
        }
    }
}
