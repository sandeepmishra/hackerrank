package com.online.test.samples;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HandsOn {
    public static void main(String[] args) {
        Map<String, String> stringMap =new HashMap<>();
        stringMap.put("A", "A");
        stringMap.put("B", "B");
        stringMap.put("C", "C");
        stringMap.put("D", "D");
        stringMap.put("E", "E");

        System.out.println(stringMap.containsKey("AJ"));
    }
}
