package com.smartinterview.week2.hackerrank;

import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int p = 0; p < t; p++) {
            int n1 = sc.nextInt();
            int m1 = sc.nextInt();
            int[][] mat1 = new int[n1][m1];
            for (int i = 0; i < n1; i++) {
                for (int j = 0; j < m1; j++) {
                    mat1[i][j] = sc.nextInt();
                }
            }
            int n2 = sc.nextInt();
            int m2 = sc.nextInt();
            int[][] mat2 = new int[n2][m2];
            for (int i = 0; i < n2; i++) {
                for (int j = 0; j < m2; j++) {
                    mat2[i][j] = sc.nextInt();
                }
            }
            int[][] c = new int[n1][m2];
            for (int i = 0; i < n1; i++) {
                for (int j = 0; j < m2; j++) {
                    c[i][j] = 0;
                    for (int k = 0; k < n2; k++) {
                        c[i][j] += mat1[i][k] * mat2[k][j];
                    }
                    System.out.print(c[i][j] + " ");
                }
                System.out.println();
            }

        }
    }
}
