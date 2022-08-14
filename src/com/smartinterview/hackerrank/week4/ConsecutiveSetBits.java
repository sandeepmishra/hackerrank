package com.smartinterview.hackerrank.week4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ConsecutiveSetBits {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long t = Integer.parseInt(br.readLine());

        for(int i=0;i<t;i++) {
            long input = Long.parseLong(br.readLine());
            int conCount=0, result=0;
            while(input>0){
                if((input&1)>0) {
                    conCount++;
                    result = result>conCount?result:conCount;
                }
                if((input&1)==0){
                    result = result>conCount?result:conCount;
                    conCount=0;
                }
                input=input>>1;

            }
            System.out.println(result);
        }
    }
}
