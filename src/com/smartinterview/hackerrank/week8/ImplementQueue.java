package com.smartinterview.hackerrank.week8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ImplementQueue {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        String arr[] = new String[t];
        int head=0, current=0;
        while(t-->0){
            String input = br.readLine();
            if(input.startsWith("Enqueue")){
                arr[current++]=input.split(" ")[1];
            }else if(head<current && input.equals("Dequeue")){
                System.out.println(arr[head++]);
            }else{
                System.out.println("Empty");
            }
        }
    }
}
