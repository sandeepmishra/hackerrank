package com.smartinterview.hackerrank.week12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class SmartString {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        while(t-->0){
            String input = br.readLine();
            Set<Character>  set = new HashSet<>();
            for(int i=0;i<input.length();i++){
                set.add(input.charAt(i));
                if(set.size()==26){
                    break;
                }
            }
            System.out.println(set.size()==26?"True":"False");
        }
    }
}
