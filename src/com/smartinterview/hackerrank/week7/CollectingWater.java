package com.smartinterview.hackerrank.week7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * https://www.hackerrank.com/contests/smart-interviews/challenges/si-collecting-water
 */
public class CollectingWater {
    public static void main(String[] args) throws IOException {
        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for(int i=0;i<t;i++){
            int n = Integer.parseInt(br.readLine());
            String input[] = br.readLine().split(" ");
            int arr[] = new int[n];
            for(int j=0;j<n;j++){
                arr[j]= Integer.parseInt(input[j]);
            }

            int arR[] = new int [n];
            int arL[] = new int [n];
            arL[0] = arr[0];
            arR[n-1] = arr[n-1];
            for(int j=1;j<n;j++){
                arL[j] = Math.max(arr[j], arL[j-1]);
            }

            for(int j=n-2;j>=0;j--){
                arR[j]= Math.max(arr[j], arR[j+1]);
            }

            int ans = 0;
            for(int j=1;j<n-1;j++){
                ans = ans +  (Math.min(arL[j], arR[j]) - arr[j]);
            }

            System.out.println(ans);
        }
    }
}
