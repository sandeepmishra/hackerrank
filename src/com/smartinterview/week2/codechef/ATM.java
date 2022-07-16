package com.smartinterview.week2.codechef;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * https://www.codechef.com/problems/HS08TEST?tab=statement
 */
public class ATM {
    public static void main(String[] args) throws Exception{
        InputStreamReader i = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(i);
        String input = bf.readLine();
        if(null != input){

            String[] in = input.split(" ");
            float wam = Float.parseFloat(in[0]);
            float amount = Float.parseFloat(in[1]);

            if((wam%5==0) && amount >=(wam+0.5f)){
                System.out.println(amount-wam-0.5f);
            }else{
                System.out.println(amount);
            }
        }


    }
}
