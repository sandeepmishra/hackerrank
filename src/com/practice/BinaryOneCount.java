package com.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BinaryOneCount {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());
        String binary = Integer.toBinaryString(n);
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<binary.length();i++){
            if(binary.contains(sb+"1")){
                sb.append("1");
            }
        }
        bufferedReader.close();
        System.out.println(sb.length());
    }
}
