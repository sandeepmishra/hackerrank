package com.smartinterview.week2.hackerrank;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PrintHallowDaimond {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n=7;

        for(int i=0;i<(7/2)+1;i++){
            for(int j=0;j<(7/2)-i;j++){
                System.out.print(" ");
            }
            System.out.println("*");
        }
        for(int i=0;i<(7/2);i++){
            for(int j=7/2;j>i;j--){
                System.out.print(" ");
            }
            System.out.println("*");
        }
    }
}
