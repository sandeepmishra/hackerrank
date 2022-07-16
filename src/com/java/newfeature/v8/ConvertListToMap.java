package com.java.newfeature.v8;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ConvertListToMap {
    public static void main(String[] args) {
        List<String> list = List.of("a", "b", "C", "d", "e", "f");
        list=list.stream().map(s-> s.toUpperCase()).collect(Collectors.toList());
        System.out.println(list);
       Map<String, String> map = list.stream().collect(Collectors.toMap(s1 -> s1, s2-> s2));
       map.forEach((k, v )-> System.out.println(k+" "+v));

    }
}
