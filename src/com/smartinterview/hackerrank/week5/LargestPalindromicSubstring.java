package com.smartinterview.hackerrank.week5;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class LargestPalindromicSubstring {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            String str = br.readLine();
            int len = getLneghtOfPalindrome(str, n);
            System.out.println(len);
        }
    }

    private static int getLneghtOfPalindrome(String str, int n) {
        int ans = 1;
        for(int i=1;i<n;i++){
            int p1 = i-1, p2 = i+1;

            while(p1>=0 && p2 <n && str.charAt(p1)==str.charAt(p2)){
                p2++;
                p1--;
            }

            ans = Math.max(ans, p2-p1-1);
            p1 = i; p2 = i+1;
            while(p1>=0 && p2 <n && str.charAt(p1)==str.charAt(p2)){
                p2++;
                p1--;
            }

            ans = Math.max(ans, p2-p1-1);
        }

        return ans;
    }
}
