package com.hackerrank.demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayStream {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputarrsize = br.readLine();
        int n1 = Integer.parseInt(inputarrsize.split(" ")[0].trim());

        int n2 = Integer.parseInt(inputarrsize.split(" ")[1].trim());

        int n3 = Integer.parseInt(inputarrsize.split(" ")[2].trim());

        String s1 = br.readLine();
        String s2 = br.readLine();
        String s3 = br.readLine();
        int [] h1=new int[n1];
        int [] h2 = new int[n2];
        int [] h3 = new int[n3];
        System.out.println("input done...");
        for(int i=0;i<n1;i++){
            h1[i]=Integer.parseInt(s1.split(" ")[i].trim());
        }
        System.out.println("array1 done..");
        for(int i=0;i<n2;i++){
            h2[i]=Integer.parseInt(s2.split(" ")[i].trim());
        }
        System.out.println("array 2 done..");
        for(int i=0;i<n3;i++){
            h3[i]=Integer.parseInt(s3.split(" ")[i].trim());
        }
        System.out.println("array processing done....");
        System.out.println(equalStacks(h1, h2, h3));
    }

    static int equalStacks(int[] h1, int[] h2, int[] h3) {
        System.out.println("started equalstack method: ");
        Deque<Integer> stack1 = new ArrayDeque<>();
        Deque<Integer> stack2 = new ArrayDeque<>();
        Deque<Integer> stack3 = new ArrayDeque<>();
        int h1sum=0, h2sum=0,h3sum=0;
        for(int i=h1.length-1;i>=0;i--){
            stack1.push(h1[i]);
            h1sum=h1sum+h1[i];
        }
        for(int i=h2.length-1;i>=0;i--){
            stack2.push(h2[i]);
            h2sum=h2sum+h2[i];
        }
        for(int i=h3.length-1;i>=0;i--){
            stack3.push(h3[i]);
            h3sum=h3sum+h3[i];
        }

        while(h1sum!=h2sum && h1sum!=h3sum && h2sum !=h3sum){
            if(h1sum>=h2sum && h1sum>=h2sum){
                h1sum -=stack1.pop();
            }else if(h2sum>=h1sum && h2sum>=h3sum){
                // h2 is greater
                h2sum-=stack2.pop();
            }else{
                // h3 is greater
                h3sum-=stack3.pop();
            }
        }
        System.out.println("ended equalstack method: ");
        return h1sum;
    }

}
