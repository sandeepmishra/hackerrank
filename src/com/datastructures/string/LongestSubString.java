package com.datastructures.string;

import java.util.Scanner;

public class LongestSubString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(lengthOfLongestSubstring(input));
    }

    public static int lengthOfLongestSubstring(String s) {
        StringBuilder sb = new StringBuilder();
        String result = new String();
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                if(!sb.toString().contains(String.valueOf(s.charAt(j)))){
                    sb = sb.append(s.charAt(j));
                }else{
                    if(result.length()<sb.toString().length()){
                        result = sb.toString();
                    }
                    sb = new StringBuilder();
                }
            }
            if(result.length()<sb.toString().length()){
                result = sb.toString();
            }
            sb = new StringBuilder();
        }
        return result.length();
    }
}
