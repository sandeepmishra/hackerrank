package com.hackerrank.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.Month;
import java.time.Period;
import java.time.YearMonth;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.util.stream.Stream;

interface A{
    void method1();
    static void method(){};
}

class Parent{

    Parent(){

    }
    protected void method(){

    }
}

public class StringChain extends Parent{

    StringChain(){

    }

    static Optional<String> a = null;
    public static void main(String[] args) throws IOException {
        System.out.println(Stream.of("green", "yellow", "blue").max((s1, s2)->s1.compareTo(s2)).filter(s->s.endsWith("n")).orElse("yellow"));

    }

    public int longestChain(int n, List<String> input){
        int count = 0;
        for(String str:input){
            int increament = 0;
            int tempcount = permute(str, 0, str.length()-1, input, increament);
            if(tempcount>count){
                count=tempcount;
            }
        }
        return count;
    }

    private int permute(String str, int l, int r, List<String> input,int increament)
    {
        if (l == r){
            if(input.contains(str)){
                increament++;
            }
        }
        else {
            for (int i = l; i <= r; i++) {
                str = swap(str, l, i);
                permute(str, l + 1, r, input, increament);
                str = swap(str, l, i);
            }
        }
        return increament;
    }

    public String swap(String a, int i, int j)
    {
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }

}


