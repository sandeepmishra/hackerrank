package com.smartinterview.spoj.week2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * https://www.spoj.com/problems/ADDREV/
 */
public class AddingReverseNumber {

    public static void main(String[] args)throws Exception {
        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for(int i=0;i<t;i++){
            String [] arr = br.readLine().split(" ");

            int num1 = reversed(Integer.parseInt(arr[0]));
            int num2 = reversed(Integer.parseInt(arr[1]));
            System.out.println(reversed(num1+num2));
        }
    }

    static int reversed(int n){
        int result = 0;
        while(n>0){
            result=(result*10)+(n%10);
            n/=10;
        }
        return result;
    }
}
