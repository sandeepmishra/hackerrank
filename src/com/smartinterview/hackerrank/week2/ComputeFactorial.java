package com.smartinterview.hackerrank.week2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class ComputeFactorial {
    public static void main(String[] args)throws Exception{
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter log = new BufferedWriter(new OutputStreamWriter(System.out));
        long [] factorial = computeFactorial();
        int t = Integer.parseInt(br.readLine());
        for(int i=0;i<t;i++){
            int input = Integer.parseInt(br.readLine());
            log.write(factorial[input-1]+"\n");
        }
        log.flush();

    }

    static long [] computeFactorial(){
        long arr[] = new long [1000000+1];
        arr[0]=1;
        for(int j=1;j<=1000000;j++){
            long b = ((j+1)%1000000007)*((arr[j-1])%1000000007);

            arr[j]=(b)%1000000007;
        }
        return arr;
    }
}
