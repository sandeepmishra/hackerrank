package com.smartinterview.week1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MissingNumber {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str[] = br.readLine().split(" ");
        //long val = 9000000000000000000l;
        int input[]= new int[100];
        for(int i=0;i<100;i++){
            int val = Integer.parseInt(str[i]);
            input[val-1]=val;
        }

        for(int i=0;i<100;i++){
            if(input[i]==0){
                System.out.println(i+1);
                break;
            }
        }
    }
}
