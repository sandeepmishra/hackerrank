package com.practice.coding;

import java.util.HashMap;
import java.util.Map;

public class FindOneArray {
    public static void main(String[] args) {
        int nums [] = {43,16,45,89,45,-2147483648,45,2147483646,-2147483647,-2147483648,43,2147483647,-2147483646,-2147483648,89,-2147483646,89,-2147483646,-2147483647,2147483646,-2147483647,16,16,2147483646,43};

        Map<Integer, Integer> map = new HashMap<>();
        int numOne = 0;
        for(int num: nums){
            if(map.containsKey(num)){
                map.put(num, map.get(num)+1);
            }else{
                map.put(num, 1);
                numOne = num;
            }
        }
        for(int k : map.keySet()){
            if(map.get(k)==1){
                System.out.println(k);
            }
        }
    }
}
