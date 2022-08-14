package com.smartinterview.codechef.week1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * https://www.codechef.com/LTIME110D/problems/LASTLEVELS
 */
public class TheLastLevels {
    public static void main(String[] args)throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for(int i=0;i<t;i++){
            String input[] = br.readLine().split(" ");
            int X = Integer.parseInt(input[0]); // levels
            int Y = Integer.parseInt(input[1]); // minutes
            int Z = Integer.parseInt(input[2]); // break time

            int levelCunt = 0;
            int time = 0;
            while(X>0){
                time+=Y;
                levelCunt++;
                X--;
                if(X>0 && levelCunt%3==0){
                    time+=Z;
                }
            }
            System.out.println(time);
        }
    }
}
