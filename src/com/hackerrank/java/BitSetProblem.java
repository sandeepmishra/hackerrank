package com.hackerrank.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.BitSet;

public class BitSetProblem {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String MNS = br.readLine();
        int n  =Integer.parseInt(MNS.split(" ")[0]);
        int m  =Integer.parseInt(MNS.split(" ")[1]);
        BitSet b1 = new BitSet(n);
        BitSet b2 = new BitSet(n);
        for(int i=0;i<m;i++){
            String input = br.readLine();
            boolean isB1 = Integer.parseInt(input.split(" ")[1])==1;
            if(input.split(" ")[0].equals("AND")){
                if(isB1){
                    b1.and(b2);
                }else{
                    b2.and(b1);
                }
            }
            if(input.split(" ")[0].equals("OR")){
                if(isB1){
                    b1.or(b2);
                }else{
                    b2.or(b1);
                }
            }
            if(input.split(" ")[0].equals("XOR")){
                if(isB1){
                    b1.xor(b2);
                }else{
                    b2.xor(b1);
                }
            }
            if(input.split(" ")[0].equals("FLIP")){
                int index = Integer.parseInt(input.split(" ")[2]);
                if(isB1){
                    b1.flip(index);
                }else{
                    b2.flip(index);
                }
            }
            if(input.split(" ")[0].equals("SET")){
                int index = Integer.parseInt(input.split(" ")[2]);
                if(isB1){
                    b1.set(index);
                }else{
                    b2.set(index);
                }
            }

            System.out.println("value of i is "+i+" : "+b1.stream().count()+" "+b2.stream().count());
        }
    }
}
