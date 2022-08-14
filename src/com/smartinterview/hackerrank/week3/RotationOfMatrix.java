package com.smartinterview.hackerrank.week3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class RotationOfMatrix {
    public static void main(String[] args)throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i=0;i<t;i++){
            int n = Integer.parseInt(br.readLine());
            int input [][] = new  int[n][n];
            for(int j=0;j<n;j++){
                String line[] = br.readLine().split(" ");
                for(int k=0;k<line.length;k++){
                    input[j][k] = Integer.parseInt(line[k]);
                }
            }

            System.out.println("Test Case #"+i+1+":");
            for(int j=0;j<n;j++){
                for(int k=n-1;k>=0;k--){
                    System.out.print(input[k][j]+" ");
                }
                System.out.println();
            }

        }
    }
}
