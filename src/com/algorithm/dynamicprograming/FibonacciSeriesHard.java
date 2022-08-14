package com.algorithm.dynamicprograming;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class FibonacciSeriesHard {
    public static void main(String[] args)throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //int t  = Integer.parseInt(br.readLine());
        long val = 1000000000000000000L;
        int s1 =   2000000000;
        int s2 =   2000000000;
        System.out.println(Integer.MAX_VALUE);
        //int s2 = (int)(val-val/2);
        System.out.println(s1);
//        for(int i=0;i<t;i++){
//            long input = Integer.parseInt(br.readLine());
//            long current=0;long prev =0;
//            long n =0;
//            for(int j=0;j<=input;j++){
//                if(j==0){
//                    prev=1;
//                    n=1;
//                }else if(j==1){
//                    current=1;
//                    n=1;
//                }else{
//                    n = (current+prev);
//                    prev = current;
//                    current=n;
//                }
//            }
//            System.out.println(n%1000000007);
//        }
    }
}
