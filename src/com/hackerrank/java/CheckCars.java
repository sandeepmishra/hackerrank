package com.hackerrank.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CheckCars {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int count = 0;
        List<Character> list = Stream.of('a','e','i','o','u').collect(Collectors.toList());
        for(int i=0;i<input.length();i++){
            char current = input.charAt(i);
            if(list.contains(current) && (input.length()-1)>=(i+2) && list.contains(input.charAt(i+2))){
                count++;
                i++;
            }
        }
        System.out.println(count);
    }
}
