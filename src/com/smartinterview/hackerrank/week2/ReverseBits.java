package com.smartinterview.hackerrank.week2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ReverseBits {

    public static void main(String[] args)throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            int input = Integer.parseInt(br.readLine());
            int m = (int)10e9+7;
//            int pos = 32;
//            long reverse = 0;
//            while (pos > 0 && input != 0)
//            {
//                if ((input & 1) != 0) {
//                    reverse = reverse | (1 << pos);
//                }else{
//                    reverse = reverse<<1;
//                }
//
//                input >>= 1;
//                pos--;
//            }
//
//            System.out.println(reverse);
//        }
            System.out.println(reverseBits(input));
            //System.out.println(Long.toBinaryString(4026531840l));
        }
    }
        static long reverseBits(int n)
    {
        long pos = Integer.SIZE-1;
        long reverse = 0;
        while (pos > 0 && n != 0)
        {

            if ((n & 1) != 0) {
                long power = (long)Math.pow(2, pos);
                reverse = reverse | power;
            }
            n >>= 1;
            pos--;
        }
        return reverse;
    }
}
