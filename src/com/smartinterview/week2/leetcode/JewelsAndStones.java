package com.smartinterview.week2.leetcode;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/jewels-and-stones/
 */
public class JewelsAndStones {
    public static void main(String[] args)throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String jewel = br.readLine();
        String stones = br.readLine();
        new JewelsAndStones().numJewelsInStones(jewel, stones);
    }

    public int numJewelsInStones(String jewels, String stones) {
        Map<Character,Character> map = new HashMap<>();

        for(int i=0;i<jewels.length();i++){
            map.put(jewels.charAt(i), jewels.charAt(i));
        }
        int count=0;
        for(int i=0;i<stones.length();i++){
           if(null != map.get(stones.charAt(i))){
               count++;
           }
        }
        return count;
    }
}
