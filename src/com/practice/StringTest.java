package com.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringTest {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());
        String arr[] = new String[input];
        for(int i=0;i<input;i++){
            arr[i] = br.readLine();
        }
        for (int i=0;i<input;i++) {
            System.out.println(hackerrankInString(arr[i]));
        }
    }

    public static String hackerrankInString(String s) {
        String hacker = "hackerrank";
        int pointer =0;

        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == hacker.charAt(pointer)){
                pointer++;
            }
        }

        return pointer == hacker.length()?"YES":"NO";

    }
}
