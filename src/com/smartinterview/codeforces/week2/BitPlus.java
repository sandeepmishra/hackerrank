package com.smartinterview.codeforces.week2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * https://codeforces.com/problemset/problem/282/A
 */
public class BitPlus {
    public static void main(String[] args)throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        int count=0;

        for(int i=0;i<t;i++){
            String input = br.readLine();

            if(input.charAt(1)=='+'){
                count++;
            }else{
                count--;
            }
        }

        System.out.println(count);
    }
}
