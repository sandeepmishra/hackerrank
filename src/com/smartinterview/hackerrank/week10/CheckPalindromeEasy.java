package com.smartinterview.hackerrank.week10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CheckPalindromeEasy {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-->0){
            int n = Integer.parseInt(br.readLine());
            String input = br.readLine();
            int mid = n/2;
            boolean isPalindrome = true;
            for(int i=0;i<mid;i++){
                if(input.charAt(i) !=  input.charAt(n-i-1)){
                    isPalindrome = false;
                    break;
                }
            }
            if(isPalindrome){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }
    }
}
