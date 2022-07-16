package com.smartinterview.week2.hackerrank;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PalindromicTraingle {
    public static void main(String[] args)throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());

        for(int i=0;i<t;i++){
            char start = 'A';
            for(int j=0;j<=i;j++){
                System.out.print((start)+" ");
                start = (char)(start+1);
            }
            start = (char)(start-1);
            for(int k=0;k<i;k++){
                start = (char)(start-1);
                System.out.print((start)+" ");
            }

            System.out.println();
        }
    }
}
