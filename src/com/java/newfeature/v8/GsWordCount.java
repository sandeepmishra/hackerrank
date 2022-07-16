package com.java.newfeature.v8;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class GsWordCount {
    public static void main(String[] args) {
        String val = "GGGGrrrrrrrrrrrrrrt";

        Map<Character, Integer> map = new LinkedHashMap<>();
        
        boolean check = val.isEmpty();
        for (int i=0;i<val.length();i++){
            if(map.get(val.charAt(i)) != null){
                map.put(val.charAt(i), map.get(val.charAt(i))+1);
            }else{
                map.put(val.charAt(i), 1);
            }
        }
        //System.out.println(map.toString());
        StringBuilder sb = new StringBuilder();
        map.forEach((k,v)-> sb.append(v+""+k));
        //System.out.println(sb.toString());
    }
}
