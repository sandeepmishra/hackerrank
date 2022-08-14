package com.smartinterview.codechef.week1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 * https://www.codechef.com/LTIME110D/problems/MAKEPALAGAIN
 */
public class PalindromeMakingProblemm {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for(int i=0;i<t;i++) {
            int n = Integer.parseInt(br.readLine());
            char charArr[] = new char[26];
            String input = br.readLine();
            for(int j=0;j<n;j++){
                charArr[input.charAt(j)-'a']++;
            }

            boolean isPalindrome = true;
            for (int j=0;j<26;j++){
                if(charArr[j]%2!=0){
                    isPalindrome=false;
                }
            }

            if(isPalindrome){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }

//    public static void main(String[] args) throws Exception{
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int t = Integer.parseInt(br.readLine());
//        for(int i=0;i<t;i++) {
//            int n = Integer.parseInt(br.readLine());
//            Map<Character, Integer> map = new HashMap<>();
//            String input = br.readLine();
//            for(int j=0;j<n;j++){
//                char c = input.charAt(j);
//                if(map.get(c)!=null){
//                    int val = map.get(c);
//                    map.put(c, val+1);
//                }else{
//                    map.put(c, 1);
//                }
//            }
//
//            boolean isPalindrome = true;
//
//            for(Map.Entry<Character, Integer> pair : map.entrySet()){
//                if(pair.getValue()%2!=0){
//                    isPalindrome=false;
//                    break;
//                }
//            }
//
//            if(isPalindrome){
//                System.out.println("YES");
//            }else{
//                System.out.println("NO");
//            }
//        }
//    }
}
