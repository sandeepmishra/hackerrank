package com.smartinterview.hackerrank.week4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class FindingCubeRoot {
    public static void main(String[] args)throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for(int i=0;i<t;i++){
            long num = Long.parseLong(br.readLine());
            long low = 1, high = num;
            if(num<0){
                low = num; high=-1;
            }
            System.out.println(binarySearch(num, low, high));
        }


    }

    static long binarySearch(long num, long low,long high){
        long mid  = (low+high)/2;
        BigInteger bigNum = new BigInteger(String.valueOf(num));
        while(low<=high){
            BigInteger b= new BigInteger(String.valueOf(mid));
            BigInteger midCube = b.multiply(b).multiply(b);
            if(bigNum.compareTo(midCube) == 0){
                return mid;
            }else if (midCube.compareTo(bigNum)==1){
                return binarySearch(num, low, mid-1);
            }else{
                return binarySearch(num, mid+1, high);
            }
        }
        return 0;
    }
}
