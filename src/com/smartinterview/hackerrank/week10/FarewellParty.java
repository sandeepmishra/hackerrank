package com.smartinterview.hackerrank.week10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FarewellParty {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-->0){
            int n = Integer.parseInt(br.readLine());
            int arr[]= new int[10001];
            int maxCount=0;
            for(int i=0;i<n;i++){
                String input = br.readLine();
                int count = getMaxCount(arr, input);
                if(maxCount<count){
                    maxCount=count;
                }

            }
            System.out.println(maxCount);
        }
    }

    private static int getMaxCount(int[] arr, String input) {
        int from = Integer.parseInt(input.split(" ")[0]);
        int to = Integer.parseInt(input.split(" ")[1]);
        int maxCount =0;
        for(int i=from;i<=to;i++){
            arr[i]=arr[i]+1;
            if(maxCount<arr[i]){
                maxCount = arr[i];
            }
        }
        return maxCount;
    }
}
