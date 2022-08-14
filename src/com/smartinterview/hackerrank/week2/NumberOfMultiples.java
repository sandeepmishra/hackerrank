package com.smartinterview.hackerrank.week2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * https://www.hackerrank.com/contests/smart-interviews-basic/challenges/si-basic-number-of-multiples/problem
 */
public class NumberOfMultiples {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long input = Long.parseLong(br.readLine());
        long result = ((input/3)+(input/5)-(input/15));
        System.out.println(result);
    }
}
