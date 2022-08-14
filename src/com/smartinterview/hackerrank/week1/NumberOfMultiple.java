package com.smartinterview.hackerrank.week1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class NumberOfMultiple {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long input = Long.parseLong(br.readLine());
        int count=0;
        for(int i=3;i<=(input/2);i++){
            if(i%3==0 || i%5==0){
                count++;
                if(i%3==0  && (i+3)<=input){
                    count++;
                }
                if(i%5==0  && (i+5)<=input){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
