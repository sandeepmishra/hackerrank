package com.algorithm.dynamicprograming;

import java.math.BigInteger;
import java.util.Scanner;

public class RecursiveFibonacciWithMemory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        BigInteger mem[] = new BigInteger[num];
        int mem1[] = new int[num];
        long startpoint = System.currentTimeMillis();
        for(int i=1;i<=num;i++){
            //fibWithMemory(i, mem);
            System.out.print(fibWithMemory1(i, mem1)+" ");
        }
//        for(int i=0;i<mem.length;i++){
//            System.out.print(mem[i]+" ");
//        }
        System.out.println();
        System.out.println("Total time take for execution without memorization for "+num+" terms is "+ ((System.currentTimeMillis()-startpoint))+" ms.");
    }

    static int fibWithMemory(int num, BigInteger mem[]){
        if(num<=0){
            return 0;
        }
        if(num == 1 || num == 2){
            mem[num-1]=BigInteger.ONE;
        }else{
            mem[num-1] = mem[num-2].add(mem[num-3]);
        }
        return fibWithMemory(num-1, mem);
    }

    static int fibWithMemory1(int num, int mem[]){
        if(num<=0){
            return 0;
        }
        if(num == 1 || num == 2){
            mem[num-1]=1;
        }
        if(mem[num-1]!=0){
            return mem[num-1] ;
        }
        return mem[num-1] =fibWithMemory1(num-1, mem) + fibWithMemory1(num-2, mem);
    }
}
