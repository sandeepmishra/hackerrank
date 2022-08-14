package com.smartinterview.hackerrank.week2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CalculatePower {
    public static void main (String[] args) throws java.lang.Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        long m=1000000007;
        while(t>0){
            long a=Long.parseLong(br.readLine());
            long b=Long.parseLong(br.readLine());
            long res=1;
            while(b!=0){
                if(checkBit(b,0)==true){
                    res=(res*a)%m;
                }
                a=(a*a)%m;
                b=b>>1;
            }
            System.out.println(res%m);
            t--;
        }
    }
    public static boolean checkBit(long a,int i){
        if((a>>i)%2==1){
            return true;
        } else{
            return false;
        }
    }
}
