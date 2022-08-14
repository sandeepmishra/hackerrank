package com.smartinterview.hackerrank.week3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 * 1 <= T <= 300
 * 1 <= N <= 104
 * 1 <= A[i] <= 109
 */
public class TripalTrouble {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for(int i=0;i<t;i++){
            int n = Integer.parseInt(br.readLine());
            String input[] = br.readLine().split(" ");
            Map<String, Integer> map = new HashMap<>();
            for(int j=0;j<n;j++){
                Integer val = map.get(input[j]);
                int count=1;
                if(val!=null){
                    count+=val;
                }
                map.put(input[j], count);
            }

            for(String key: map.keySet()){
                if(map.get(key)<3){
                    System.out.println(key);
                }
            }
        }
    }
}
