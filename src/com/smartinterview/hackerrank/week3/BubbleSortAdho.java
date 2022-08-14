package com.smartinterview.hackerrank.week3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BubbleSortAdho {
    public static void main(String[] args)throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t  = Integer.parseInt(br.readLine());
        for(int i=0;i<t;i++){
            int n  = Integer.parseInt(br.readLine());
            String [] in = br.readLine().split(" ");
            int arr[] = new int[n];


            for( int j=0;j<n;j++){
                arr[j]=Integer.parseInt(in[j]);
            }
            int count=0;
            for( int j=0;j<n;j++){
                for(int k=0;k<n-j-1;k++){
                    if(arr[k]>arr[k+1]){
                        int temp = arr[k];
                        arr[k]=arr[k+1];
                        arr[k+1]=temp;
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
    }
}
