package com.smartinterview.hackerrank.week3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class RepeatedNumbers {
    public static void main(String[] args)throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for(int i=0;i<t;i++){
            int n = Integer.parseInt(br.readLine());
            String input[]= br.readLine().split(" ");
            int intarr[]=new int[n];
            int result[]=new int[2];

            for(int j=0;j<n;j++){
                intarr[j] = Integer.parseInt(input[j]);
            }
            Arrays.sort(intarr);
            int countArr[] = new int[n];
            int idx=0;
            for(int j=0;j<n;j++){
                countArr[intarr[j]-1]++;
            }

            for(int j=0;j<n;j++){
                if(countArr[j]>1){
                    result[idx]=j+1;
                    idx++;
                }
            }
            System.out.println(result[0]+" "+result[1]);
        }
    }
}
