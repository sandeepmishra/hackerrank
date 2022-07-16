package com.scaler.academy.week1;

import java.util.Scanner;

public class GcdOfGivenInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(calculateGcd(a, b));
    }

//    static int calculateGcd(int a, int b){
//        if(b==0){
//            return a;
//        }
//        return calculateGcd(b, a%b);
//    }

    static int calculateGcd(int a,int b){
        int gcd = 1, counter=1;
        if(a==0){
            return b;
        }else if(b==0){
            return a;
        }else{
            while(counter <=a && counter <=b){
                if(a%counter==0 && b%counter==0){
                    gcd = counter;
                }
                counter++;
            }
            return gcd;
        }
    }
}
