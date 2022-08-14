package com.smartinterview.codechef.week1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * https://www.codechef.com/LTIME110D/problems/TFPAPER
 */
public class TrueAndFalsePaper {
    public static void main(String[] args)throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for(int i=0;i<t;i++){
            String input[] = br.readLine().split(" ");
            int N = Integer.parseInt(input[0]);
            int K = Integer.parseInt(input[1]);
            System.out.println(K+" "+(N-K));
        }
    }
}
