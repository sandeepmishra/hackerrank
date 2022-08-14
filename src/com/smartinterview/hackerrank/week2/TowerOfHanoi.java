package com.smartinterview.hackerrank.week2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TowerOfHanoi {
    public static void main(String[] args)throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for(int i=0;i<t;i++){
            int disc = Integer.parseInt(br.readLine());
            System.out.println((int)((Math.pow(2,disc))-1));
            towerOfHanoi(disc, 'A', 'B', 'C');
        }
    }

    static void towerOfHanoi(int N, char src, char temp, char dest){
        if(N==1){
            System.out.println("Move "+N+" from "+ src +" to "+dest);
            return;
        }
        towerOfHanoi(N-1, src, dest, temp);
        System.out.println("Move "+N+" from "+ src +" to "+dest);
        towerOfHanoi(N-1, temp, src, dest);
    }
}
