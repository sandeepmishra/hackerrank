package com.java.newfeature.v8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

public class JpmcCodingTest {
    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
        BufferedReader in = new BufferedReader(reader);
        String line;
        Map<String, Integer> map = new HashMap<>();
        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 3);
        map.put("d", 4);
        map.put("e", 5);
        map.put("f", 6);
        map.put("g", 7);
        map.put("h", 8);
        while ((line = in.readLine()) != null) {
            if(line.length()>2){
                System.out.println("Error");
            }
            String colStr =  line.split("")[0];
            int rowVal =  Integer.parseInt(line.split("")[1]);
            Integer colVal = map.get(colStr);
            if(rowVal <1 || rowVal > 8 || colVal == null ){
                System.out.println("Error");
            }else{
                if((rowVal+colVal) % 2 == 0){
                    System.out.println("Black");
                }else{
                    System.out.println("White");
                }
            }
        }
    }
}
