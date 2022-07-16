package com.scaler.academy.week1;

import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long binary = sc.nextLong();
        System.out.println(convertBinaryToDecimal(binary));
    }

    private static int convertBinaryToDecimal(long binary) {
        int result=0;
        int index=0;
        while(binary>0){
            result += (binary%10 ) * (Math.pow(2, index++));
            binary/=10;
        }
        return result;
    }
}
