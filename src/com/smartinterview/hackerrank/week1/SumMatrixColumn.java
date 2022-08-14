package com.smartinterview.hackerrank.week1;

import java.util.Scanner;

public class SumMatrixColumn {
    public static void main(String[] args) throws Exception {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String size[] = br.readLine().split(" ");
//        int row = Integer.parseInt(size[0]);
//        int col = Integer.parseInt(size[1]);
//        BigInteger input1[][] = new BigInteger [row][col];
//        BigInteger input2[][] = new BigInteger [row][col];
//        // input matrix 1
//        for(int i=0;i<row;i++){
//            String rowarr[] = br.readLine().split(" ");
//            for(int j=0;j<col;j++){
//                input1[i][j] = new BigInteger(rowarr[j]);
//            }
//        }
//        // input matrix 1
//        for(int i=0;i<row;i++){
//            BigInteger sum = BigInteger.ZERO;
//            String rowarr[] = br.readLine().split(" ");
//            for(int j=0;j<col;j++){
//                sum = sum.add(new BigInteger(rowarr[j]));
//                sum = sum.add(input1[i][j]);
//
//                System.out.print(sum+" ");
//                sum = BigInteger.ZERO;
//            }
//            System.out.println();
//        }

        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        while(input!=42){
            System.out.println(input);
            input = sc.nextInt();
        }
    }
}
