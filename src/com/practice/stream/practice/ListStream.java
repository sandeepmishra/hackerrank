package com.practice.stream.practice;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class ListStream {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<String, String> map = new HashMap<>();
        int n = Integer.parseInt(br.readLine());
        for(int i = 0; i < n; i++){
            String key[] = br.readLine().split(" ");
            String value = null;
            if(key.length>1){
                value = key[1];
            }
            map.put(key[0], value);
        }
        for(int i=0;i<n;i++){
            String name= br.readLine().trim();
            System.out.println(map.get(name)==null? "Not found":(name+"="+map.get(name)));
        }
        br.close();
    }
}
