package com.smartinterview.week2.codeforces;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * https://codeforces.com/problemset/problem/71/A
 */
public class WayTooLongWords {
    public static void main(String[] args)throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for(int i=0;i<t;i++){
            String input = br.readLine();
            if(input.length()>10){
                input = String.valueOf(input.charAt(0))+(input.length()-2)+input.charAt(input.length()-1);
            }
            System.out.println(input);
        }
    }
}
