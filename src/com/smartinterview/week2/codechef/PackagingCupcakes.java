package com.smartinterview.week2.codechef;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * https://www.codechef.com/problems/MUFFINS3?tab=statement
 */
public class PackagingCupcakes {
    public static void main(String[] args)throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());
        for(int i=0;i<t;i++){
            int N = Integer.parseInt(br.readLine());
            System.out.println((N/2)+1);
        }
    }
}
