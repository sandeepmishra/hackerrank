package com.java.newfeature.v8;


// set of string word dictionary
// Hello, Hell, Hello


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class JpMC {


    public static void main(String[] args) throws IOException {
        Set<String> wordSet = new HashSet<>();
        wordSet.add("Hello");
        wordSet.add("Hell");
        wordSet.add("He");
        wordSet.add("lol");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input  = br.readLine();
        List<String> result = new ArrayList<>();
        // Hell
        for(int i=0;i<input.length();i++){
            StringBuilder sb = new StringBuilder();
            for(int j=i;j<input.length();j++){
                sb = sb.append(input.charAt(j));
                if(wordSet.contains(sb.toString()) && !result.contains(sb.toString())) {
                    result.add(sb.toString());
                }
            }
            //System.out.println( sb.toString());

        }
        System.out.println(result);
    }
}


// String s = {} //balanced

// String a = }{ // not balanced
// {{}, {}}
// {}{} , {{}},


// stack.push({);


// HYS (high yeild saving ) // balance
// MMA, CDA