package com.smartinterview.hackerrank.week5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;

public class DistinctElementsWindow {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        BufferedWriter output = new BufferedWriter(
                new OutputStreamWriter(System.out));
        for(int i=0;i<t;i++){
            String nk[] = br.readLine().split(" ");
            String input[]  = br.readLine().split(" ");

            int n=Integer.parseInt(nk[0]);
            int k=Integer.parseInt(nk[1]);
            Map<String, Integer> map = new HashMap<>();

            for(int j=0;j<n;j++){
                if(j<k-1){
                    if(map.containsKey(input[j])){
                        int val = map.get(input[j]);
                        map.put(input[j], val+1);
                    }else{
                        map.put(input[j], 1);
                    }
                }else{
                    if(map.containsKey(input[j])){
                        int val = map.get(input[j]);
                        map.put(input[j], val+1);
                    }else{
                        map.put(input[j], 1);
                    }
                    output.write(map.size()+" ");
                    if(j>=k-1){
                        int val = map.get(input[j-k+1]);
                        if(val>1){
                            map.put(input[j-k+1], val-1);
                        }else{
                            map.remove(input[j-k+1]);
                        }
                    }
                }
            }
            output.write('\n');
        }
        output.flush();
    }
}
