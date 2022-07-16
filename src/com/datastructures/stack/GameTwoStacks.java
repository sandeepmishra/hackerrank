package com.datastructures.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GameTwoStacks {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int g = Integer.parseInt(br.readLine());
        for(int i=0;i<g;i++){
            String nmx = br.readLine();
            String a = br.readLine();
            String b = br.readLine();

            int n = Integer.parseInt(nmx.split(" ")[0]);
            int m = Integer.parseInt(nmx.split(" ")[1]);
            int x = Integer.parseInt(nmx.split(" ")[2]);
            int arra[] = new int[n];
            int arrb[] = new int[m];
            for(int j=0;j<n;j++){
                arra[j]=Integer.parseInt(a.split(" ")[j]);
            }
            for(int j=0;j<m;j++){
                arrb[j]=Integer.parseInt(b.split(" ")[j]);
            }
            System.out.println(twoStacks(x, arra, arrb));
        }
    }

    static int twoStacks(int x, int[] a, int[] b) {
        int elements = 0;
        int prevsum = 0;
        int index = 0;
        while((index<=a.length-1 || index<=b.length-1) && prevsum < x){
            if(index<=a.length-1 && prevsum+a[index]<=x){
                prevsum+=a[index];
                elements++;
            }
            if(index<=b.length-1 && prevsum+b[index]<=x){
                prevsum+=b[index];
                elements++;
            }
            if(prevsum==x){
                break;
            }
            index++;
        }
        return elements;
    }
}
