package com.smartinterview.hackerrank.week3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;

public class FindFirstRepeatingCharacter {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i=0;i<t;i++){
            String input = br.readLine();
            Map<Character, Integer> map = new LinkedHashMap<>();
            for(int j=0;j<input.length();j++) {
                char key = input.charAt(j);
                int keyCount = 0;
                if (map.get(key) != null) {
                    keyCount = map.get(key);
                    map.put(key, keyCount + 1);
                } else {
                    map.put(key, 1);
                }
            }
            Character output = '.';
            for(Character character: map.keySet()){
                if(map.get(character)>1){
                    output = character;
                    break;
                }
            }

            System.out.println(output);
        }
    }
}
