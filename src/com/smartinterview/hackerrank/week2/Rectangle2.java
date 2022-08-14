package com.smartinterview.hackerrank.week2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Rectangle2 {
    public static void main(String[] args)throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for(int i=0;i<N;i++){
            int start = i+1;
            int diff = N-1;
            for(int j=0;j<=i;j++){
                if(j==0){
                    System.out.print(start+" ");
                }else{
                    System.out.print((start+diff)+" ");
                    start = start+diff;
                    diff=diff-1;
                }
            }
            System.out.println();
        }
    }
}
