package com.smartinterview.hackerrank.week1;

import java.util.Scanner;

public class CheckNthBitSet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        long num = Long.parseLong(input.split(" ")[0]);
        long val = Long.parseLong(input.split(" ")[1]);
        long binaryOne = 1;
        for(int i=0;i<val;i++){
            binaryOne=binaryOne<<1;
        }
        System.out.println(binaryOne);
        System.out.println((binaryOne&num)==binaryOne);
    }
}
