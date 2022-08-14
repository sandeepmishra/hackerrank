package com.smartinterview.hackerrank.week3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class FindingFrequency {
    public static void main(String[] args)throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String [] arr = br.readLine().split(" ");
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            int val=Integer.parseInt(arr[i]);
            if(map.get(val)==null){
                map.put(val, 1);
            }else{
                int count = map.get(val);
                map.put(val, count+1);
            }
        }
        int q = Integer.parseInt(br.readLine());

        for(int i=0;i<q;i++){
            int k = Integer.parseInt(br.readLine());
            System.out.println(map.get(k));
        }
    }
}
