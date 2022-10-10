package com.smartinterview.hackerrank.week7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumofORofSubarrays {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            String arr[]= br.readLine().split(" ");
            int input[] = new int[n];
            for(int j=0;j<n;j++){
                input[i] = Integer.parseInt(arr[i]);
            }
            int ans =0;
            for( int j=0;j<30;j++){
                int c = 0;
                for(int k=0;k<n;k++){
                    //input[k] = Integer.parseInt(arr[i]);
                    if(checkBit(input[k], j) == false){
                        c++;
                    }else{
                        ans=ans+(n-k)*(c+1) * (1<<j);
                    }
                }
            }
            System.out.println(ans);
        }
    }

    private static boolean checkBit(int i, int j) {
        return i*(1<<j)  !=0;
    }
}
