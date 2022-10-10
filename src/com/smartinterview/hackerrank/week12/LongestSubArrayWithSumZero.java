package com.smartinterview.hackerrank.week12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LongestSubArrayWithSumZero {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            String arr[]= br.readLine().split(" ");
            int input[] = new int[n];
            // for(int j=0;j<n;j++){
            //     input[j] = Integer.parseInt(arr[j]);
            // }
            long ans = 0;
            for(int b=0;b<30;b++){
                int c = 0, sum=0;
                for(int j=0;j<n;j++){
                    //input[k] = Integer.parseInt(arr[i]);
                    input[j] = Integer.parseInt(arr[j]);
                    if(checkBit(j, b)){
                        sum += input[j];
                        c++;
                        if(sum==0){
                            ans = Math.max(ans, c);
                        }
                    }
                }

            }
            System.out.println(ans);
        }
    }

    private static boolean checkBit(int i, int j) {
        return (i&(1<<j))== 1 ;
    }
}
