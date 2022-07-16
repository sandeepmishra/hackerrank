package com.datastructures.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class DynamicArray {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String nqStr = br.readLine();
        List<List<Integer>> queries = new ArrayList<>();
        for(int i=0;i<Integer.parseInt(nqStr.split(" ")[1]);i++){
            String input = br.readLine();
            List<Integer> query = new ArrayList<>();
            query.add(0,Integer.parseInt(input.split(" ")[0]));
            query.add(1,Integer.parseInt(input.split(" ")[1]));
            query.add(2,Integer.parseInt(input.split(" ")[2]));
            queries.add(query);
        }
        System.out.println(dynamicArray(Integer.parseInt(nqStr.split(" ")[0]), queries));

    }

    public static List<Integer> dynamicArray(int n, List<List<Integer>> queries) {
        // Write your code here
        List<Integer> results = new ArrayList<>();
        List<List<Integer>> sqs = new ArrayList<>(n);
        int lastAnswer = 0;
        for(int i=0;i<n;i++){
            List<Integer> list = new ArrayList<>();
            sqs.add(list);
        }
        for(List<Integer> query: queries){
            if(query.get(0)==1){
                sqs.get((query.get(1)^lastAnswer)%n).add(query.get(2));
            }
            if(query.get(0)==2){
                List<Integer> sqList = sqs.get((query.get(1)^lastAnswer)%n);
                lastAnswer = sqList.get(query.get(2)%sqList.size());
                results.add(lastAnswer);
            }
        }

        return results;
    }




}
