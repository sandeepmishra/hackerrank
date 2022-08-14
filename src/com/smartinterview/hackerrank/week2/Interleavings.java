package com.smartinterview.hackerrank.week2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.TreeSet;

public class Interleavings {

    public static void main(String[] args) throws Exception{
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for(int i=0;i<t;i++){
            String input[] = br.readLine().split(" ");
            System.out.println("Case #"+(i+1));
            Set<String> strings = new TreeSet<>();
            printInterLeaving(input[0], 0, input[1], 0, "", strings);
            strings.stream().forEach(System.out::println);
        }
    }


    static void printInterLeaving(String s1, int i, String s2, int j, String asf, Set<String> set)
    {
        if (i == s1.length() && j == s2.length()) {
            set.add(asf);
        }

        if (j < s2.length()){
            printInterLeaving(s1, i, s2, j + 1, asf + s2.charAt(j), set);
        }
        if ( i < s1.length()){
            printInterLeaving(s1, i + 1, s2, j, asf + s1.charAt(i), set);
        }

    }
}
