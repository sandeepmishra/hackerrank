package com.smartinterview.week2.spoj;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * https://www.spoj.com/problems/ACPC10A/
 */
public class APGPWhatsNext {
    public static void main(String[] args)throws Exception {

        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));

        while(true){
            String l1 [] = br.readLine().split(" ");
            int a = Integer.parseInt(l1[0]);
            int b=  Integer.parseInt(l1[1]);
            int c = Integer.parseInt(l1[2]);

            if(a==0 && b==0 && c==0){
                break;
            }

            if(b-a == c-b){
                System.out.println("AP "+(c+c-b));
            }else{
                System.out.println("GP "+((c*c)/b));
            }
        }
    }
}
