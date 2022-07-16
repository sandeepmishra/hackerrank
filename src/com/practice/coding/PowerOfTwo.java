package com.practice.coding;

import java.math.BigDecimal;
import java.util.*;

public class PowerOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(numSquares(sc.nextInt()));
    }

    public static int hIndex(int[] citations) {
        if(citations.length==0){
            return 0;
        }
        if(citations.length==1){
            if(Arrays.stream(citations).sum()==0){
                return 0;
            }
            return 1;
        }
        if(citations.length>1){
            if(citations.length%2==0){
                return citations[(citations.length/2)-1];
            }else{
                return citations[(citations.length/2)];
            }
        }
        return 0;
    }

    public static int numSquares(int n) {
        if(n<=3){
            return n;
        }
        int dp[] = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 3;
        for (int i = 4; i <= n; i++) {
            dp[i] = i;
            for (int x = 1; x <= Math.ceil(Math.sqrt(i)); x++) {
                int temp = x * x;
                if (temp > i)
                    break;
                else
                    dp[i] = Math.min(dp[i], 1 + dp[i - temp]);
            }
        }

        return dp[n];
    }
}
