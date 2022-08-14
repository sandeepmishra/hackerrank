package com.smartinterview.hackerrank.week5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Hollowrectanglepattern {

    private static Scanner sc;

    public static void main(String[] args) {
        sc = new Scanner(System.in);

        int t = sc.nextInt();
        int i, j, k;

        for (int n=1;n<=t;n++){
            int rows = sc.nextInt();

            System.out.println("Case #"+n+":");
            for (i = 1 ; i <= rows; i++ )
            {
                for (j = 1 ; j <= rows - i; j++ )
                {
                    System.out.print(" ");
                }
                for (k = 1 ; k <= i * 2 - 1; k++ )
                {
                    if (k == 1 || k == i * 2 - 1) {
                        System.out.print("*");
                    }
                    else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }

            for (i = rows - 1 ; i > 0; i-- )
            {
                for (j = 1 ; j <= rows - i; j++ )
                {
                    System.out.print(" ");
                }
                for (k = 1 ; k <= i * 2 - 1; k++ )
                {
                    if (k == 1 || k == i * 2 - 1) {
                        System.out.print("*");
                    }
                    else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }

    }

}
