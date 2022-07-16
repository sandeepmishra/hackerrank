package com.practice.coding;

import java.math.BigInteger;

public class PlusOne {
    public static void main(String[] args) {
        int [] arr = {1, 2, 3};//{9,8,7,6,5,4,3,2,1,0};
//        arr = plusOne(arr);
//        for(int val: arr){
//            System.out.print(val+" ");
//        }

        String s = "10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011";
        System.out.println(Long.parseLong(s, 2));
    }


    public static int[] plusOne(int[] digits) {
        BigInteger big = BigInteger.ZERO;

        for(int i=0;i<digits.length;i++){
            big = big.multiply(new BigInteger("10")).add(new BigInteger(String.valueOf(digits[i])));
        }

        big=big.add(new BigInteger("1"));
        int digitcount = big.toString().length();
        int array[] = new int[digitcount];

        int index = 0;
        while(big.toString().length()>0 && !big.equals(BigInteger.ZERO)){
            array[array.length-1-index] = big.mod(BigInteger.TEN).intValue();
            big=big.divide(BigInteger.TEN);
            index++;
        }
        return array;
    }
}
