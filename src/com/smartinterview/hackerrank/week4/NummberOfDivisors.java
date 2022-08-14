package com.smartinterview.hackerrank.week4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class NummberOfDivisors {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long t = Integer.parseInt(br.readLine());

        for(int i=0;i<t;i++){
            long input = Long.parseLong(br.readLine());
            int loop = (int)Math.sqrt(input);
            int count = 0;
            for(int j=1;j<=loop;j++){
                if(input%j==0 && j != input/j){
                    count+=2;
                }else if(input%j==0 && j==input/j){
                    count+=1;
                }
            }
            System.out.println(count);
        }
    }
}
