package com.smartinterview.week1;

import java.util.Scanner;

public class CountSetBitInNumber {

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//        int i=2;
//        int count=0;
//        System.out.println((num&1<<i) !=0);
//        System.out.println(count);

        int arr[] = {4, 5, 8, 3};int ans = 0;
        for(int i=0;i<arr.length;i++){
            //for(int j=0;j<arr.length;j++){
                ans = ans + (arr[i]^arr[i]);
            //}
        }
        String str = "100 9";
        double M= (10e9+7);
        //int M = 10e9+7;
        int a = Integer.parseInt(str.split(" ")[0]);
        int b = Integer.parseInt(str.split(" ")[1]);
        ans = 1;
        for(int i=1;i<=b;i++){
            ans=((ans*a));
            System.out.println(ans);
        }
        //System.out.println(ans);
    }
}
