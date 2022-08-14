package com.smartinterview.codechef.week1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * https://www.codechef.com/LTIME110D/problems/INTRDSGN
 */
public class InteriorDesignContest {
    public static void main(String[] args)throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for(int i=0;i<t;i++){
            String input[] = br.readLine().split(" ");
            int firstStyle = Integer.parseInt(input[0])+Integer.parseInt(input[1]);
            int secStyle = Integer.parseInt(input[2])+Integer.parseInt(input[3]);
            if(firstStyle>secStyle){
                System.out.println(secStyle);
            }else {
                System.out.println(firstStyle);
            }
        }
    }
}
