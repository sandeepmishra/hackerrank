package com.smartinterview.hackerrank.week7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * https://www.hackerrank.com/contests/smart-interviews/challenges/si-diagonal-traversal-of-matrix
 */
public class DiagonalTraversalMatrix {
    public static void main(String[] args) throws IOException {
        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for(int i=0;i<t;i++) {
            int n = Integer.parseInt(br.readLine());
            String [][] input = new String[n][n];
            for(int j=0;j<n;j++){
                input[j] = br.readLine().split(" ");
            }


            for(int j=n-1;j>=0;j--){
                int sum =0;
                int ct =0;
                for(int k=j;k<=n-1;k++){
                    sum+=Integer.parseInt(input[ct][k]);
                    ct++;
                }
                System.out.print(sum+ " ");
            }

            for(int j=1;j<n;j++){
                int sum =0;
                int ct =0;
                for(int k=j;k<=n-1;k++){
                    sum+=Integer.parseInt(input[k][ct]);
                    ct++;
                }
                System.out.print(sum+" ");
            }

            System.out.println();
        }
    }
}
