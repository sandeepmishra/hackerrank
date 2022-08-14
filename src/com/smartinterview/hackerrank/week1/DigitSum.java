package com.smartinterview.hackerrank.week1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class DigitSum {
    public static void main(String[] args)throws Exception  {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BigInteger number = new BigInteger(br.readLine());
        BigInteger sum = BigInteger.ZERO;
        BigInteger mod = BigInteger.TEN;
        while(number.compareTo(BigInteger.ZERO)>0){
            sum=sum.add(number.mod(mod));
            number = number.divide(mod);
        }
        System.out.println(sum);
    }
}
