package com.algorithm.dynamicprograming;

import java.util.Scanner;

public class RecursiveFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        long startpoint = System.currentTimeMillis();
        for(int i=1;i<=num;i++){
            System.out.print(printFibonacci(i)+" ");
        }
        System.out.println();
        System.out.println("Total time take for execution without memorization for "+num+" terms is "+ ((System.currentTimeMillis()-startpoint))+" ms.");
    }

    static long printFibonacci(int num){
        if(num==1 || num == 2){
            return 1;
        }
        return printFibonacci(num-1)+printFibonacci(num-2);
    }

}
