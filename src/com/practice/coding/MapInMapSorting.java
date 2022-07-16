package com.practice.coding;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class MapInMapSorting {

    public static void main(String[] args) {
        Map<String, Map<String, String>> map = new HashMap<>();

        Map<String, String> map1 = new HashMap<>();
        Map<String, String> map2 = new HashMap<>();
        Map<String, String> map3 = new HashMap<>();
        Map<String, String> map4 = new HashMap<>();

        map1.put("A","R");
        map1.put("B","A");
        map1.put("C","M");

        map2.put("D","S");
        map2.put("E","H");
        map2.put("F","Y");
        map2.put("G","A");
        map2.put("A","M");

        map3.put("A","S");
        map3.put("B","I");
        map3.put("C","T");
        map3.put("D","A");

        map4.put("D","G");
        map4.put("E","E");
        map4.put("F","E");
        map4.put("G","T");
        map4.put("A","A");

        map.put("map1", map1);
        map.put("map2", map2);
        map.put("map3", map3);
        map.put("map4", map4);

        map.forEach((k,v)->{
            map.put(k, v.entrySet().stream()
                    .sorted(Map.Entry.comparingByValue())
                    .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                            (oldValue, newValue) -> oldValue, LinkedHashMap::new)));
        });


      /*  Map<String, Map<String, String>> collect = new HashMap<>();
        map.entrySet()
                .forEach(stringMapEntry -> {
                    Map<String, String> stringStringLinkedHashMap = stringMapEntry.getValue()
                            .entrySet().stream()
                            .sorted(Map.Entry.comparingByValue())
                            .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e2, LinkedHashMap::new));
                    collect.put(stringMapEntry.getKey(), stringStringLinkedHashMap);
                });

         collect = map.entrySet()
                .stream()
                .map(stringMapEntry -> stringMapEntry.getValue()
                        .entrySet().stream()
                        .sorted(Map.Entry.comparingByValue())
                        .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e2, LinkedHashMap::new))
                ).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (v1, v2) -> v1, HashMap::new));
*/
        //System.out.println(collect);

    }
}
