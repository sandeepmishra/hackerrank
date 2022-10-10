package com.smartinterview.hackerrank.week14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * https://www.hackerrank.com/contests/smart-interviews/challenges/si-number-of-dice-rolls-for-given-sum
 */
public class NumberofDiceRollsforgivensum {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        int mod = 1000000007;
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            int dp[]=new int[n+1];
            dp[0]=1;
            for(int j=1;j<=n;j++){
                int sum = 0;
                for(int k=1;k<=6;k++){
                    if(j-k>=0){
                        sum=(sum%mod+dp[j-k]%mod)%mod;
                    }
                }
                dp[j]=sum;
            }
            System.out.println(dp[n]);
        }
    }
}
