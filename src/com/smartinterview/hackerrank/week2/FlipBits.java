package com.smartinterview.hackerrank.week2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * You are given two numbers A and B. Write a program to count the number of bits to be flipped to change the number A to the number B. Flipping a bit of a number means changing a bit from 1 to 0 or vice versa.
 *
 * Input Format
 *
 * First line of input contains T - number of test cases. Each of the next T lines contains 2 integer A and B, separated by space.
 *
 * Constraints
 *
 * 1 <= T <= 100000
 * 0 <= N <= 109
 */
public class FlipBits {
    public static void main(String[] args)throws Exception {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for(int i=0;i<t;i++){
            String input[]=  br.readLine().split(" ");

            int a= Integer.parseInt(input[0]);
            int b= Integer.parseInt(input[1]);
            int c = a^b;

            int flipCount =0;
            while(c>0){
                if((c&1)==1){
                    flipCount++;
                }
                c=c>>1;
            }

            System.out.println(flipCount);
        }
    }
}
