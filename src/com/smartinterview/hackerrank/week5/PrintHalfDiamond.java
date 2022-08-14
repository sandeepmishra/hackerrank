package com.smartinterview.hackerrank.week5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class PrintHalfDiamond {
    public static void main(String[] args)throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N= Integer.parseInt(br.readLine());
        BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i=1;i<=N;i++){
            for(int j=N-1;j>=1;j--){
                if(i-1>=j){
                    output.write("*");
                }else{
                    output.write(" ");
                }
            }
            for(int j=1;j<=i;j++){
                output.write("*");
            }
            output.write("\n");
        }
        output.flush();
    }
}
