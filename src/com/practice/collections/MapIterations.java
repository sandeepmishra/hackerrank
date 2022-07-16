package com.practice.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class MapIterations {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0;i<10;i++){
            Random random = new Random();
            map.put(i+1, i+ random.nextInt(300));
        }

        int sum = 0;
        map.forEach( (key, value) -> {
            System.out.println(key+" "+ value);
        });

        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }

        Set<Integer> keySet = map.keySet();
        for(Integer key: keySet){
            System.out.println(key+" "+ map.get(key));
        }
    }


}
