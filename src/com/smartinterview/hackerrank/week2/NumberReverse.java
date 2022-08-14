package com.smartinterview.hackerrank.week2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class NumberReverse {
    public static void main(String[] args)throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long number = Long.parseLong(br.readLine());
        long result =0;
        boolean isNegative = false;
        if(number < 0){
            isNegative=true;
            number=number*(-1);
        }
        while(number>0){
            result = (result*10) + (number%10);
            //sb = sb.append(number%10);
            number/=10;
        }
        if(isNegative){
            System.out.println(-1*result);
        }else{
            System.out.println(result);
        }

    }
}
