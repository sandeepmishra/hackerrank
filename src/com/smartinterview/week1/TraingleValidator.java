package com.smartinterview.week1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TraingleValidator {
    public static void main(String[] args)throws Exception  {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        long a = Long.parseLong(str.split(" ")[0]);
        long b = Long.parseLong(str.split(" ")[1]);
        long c = Long.parseLong(str.split(" ")[2]);

        boolean aIsBigger = a>b && a>c;
        boolean bIsBigger = b>a && b>c;
        boolean cIsBigger = c>a && c>b;

        if(aIsBigger && ((a*a)==((b*b)+(c*c)))){
            System.out.println("Yes");
            System.exit(0);
        }
        if(bIsBigger && ((b*b)==((a*a)+(c*c)))){
            System.out.println("Yes");
            System.exit(0);
        }
        if(cIsBigger && ((c*c)==((b*b)+(a*a)))){
            System.out.println("Yes");
            System.exit(0);
        }
        System.out.println("No");
    }
}
