package com.smartinterview.hackerrank.week7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * https://www.hackerrank.com/contests/smart-interviews/challenges/si-first-missing-positive-integer
 */
public class FirstMissingPositiveInteger {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for(int i=0;i<t;i++){
            int n = Integer.parseInt(br.readLine());
            String arr[] = br.readLine().split(" ");

            int input[]  = new int[n];
            for(int j=0;j<n;j++){
                input[j]= Integer.parseInt(arr[j]);
            }
            Arrays.sort(input);
            System.out.println(missingNumber(input, n));

//            for(int j=1;i<=n;j++){
//                if(!BS(input, n, j)){
//                    System.out.println(j);
//                    break;
//                }
//            }
        }
    }

    static int missingNumber(int input[], int n){
        int i=0;
        while(input[i]<1 && i<n){
            i++;
        }
        int missingNumber =1;
        for(int j=i;j<n;j++){
            if(missingNumber == input[j]){
                missingNumber++;
            }else if(input[j]>missingNumber){
                return missingNumber;
            }
        }
        return missingNumber;
    }
    private static boolean BS(long[] arr, int n, int key) {
        int l=0, r = n-1;
        while(l<=r){
            int m = (l+r)/2;

            if(arr[m]==key){
                return true;
            }
            if(arr[m]<key){
                l = m+1;
            }else{
                r = m-1;
            }
        }
        return false;
    }
}
