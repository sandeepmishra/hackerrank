package com.smartinterview.hackerrank.week14;

import java.io.*;

public class ComputenCr {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());

        int dp[][] = new int[2001][2001];
        int mod = 1000000007;
        for(int k=0;k<2000;k++){
            dp[0][k]=0;
        }
        for(int k=0;k<2000;k++){
            dp[k][0]=1;
        }
        for(int j=1;j<=2000;j++){
            for(int k=1;k<=2000;k++){
                dp[j][k] = ((dp[j-1][k-1])+(dp[j-1][k]))%mod;
            }
        }

        for (int i = 0; i < t; i++) {
            String in = br.readLine();
            int n = Integer.parseInt(in.split(" ")[0]);
            int r = Integer.parseInt(in.split(" ")[1]);
            output.write(dp[n][r]+"\n");
        }
        output.flush();
    }
}
