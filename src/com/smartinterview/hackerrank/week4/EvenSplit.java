package com.smartinterview.hackerrank.week4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EvenSplit {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long t = Integer.parseInt(br.readLine());

        for(int i=0;i<t;i++) {
            long input = Long.parseLong(br.readLine());
            if(input==1){
                System.out.println("No");
            }else{
                boolean isEvenSplit = false;
                while(input>0){
                    input=input/2;
                    if((input%2)==0 && input!=0){
                        isEvenSplit = true;
                        break;
                    }
                }
                System.out.println(isEvenSplit?"Yes":"No");
            }

        }
    }
}
