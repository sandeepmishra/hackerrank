package com.smartinterview.hackerrank.week4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class FindingCeil {
    private static int globalAns=0;
    public static void main(String[] args)throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String [] arr = br.readLine().split(" ");
        int [] input = new int [n];
        for(int i=0;i<n;i++){
            input[i]=Integer.parseInt(arr[i]);
        }
        Arrays.sort(input);

        int q = Integer.parseInt(br.readLine());

        for(int i=0;i<q;i++){
            int k = Integer.parseInt(br.readLine());
            int result = BSCeil(input, k, 0, n-1, Integer.MAX_VALUE);
            globalAns = result==0 && globalAns == 0?Integer.MAX_VALUE:globalAns;
            System.out.println(result==0 && globalAns>0?globalAns:result);
        }
    }

    private static int BSCeil(int[] input, int k, int low, int high, int diff) {
        if(low>high){
            return 0;
        }else{
            int mid = (low+high)/2;
            if(k==input[mid]){
                return input[mid];
            }else if (k>input[mid]){
                if((input.length-1)>=(mid+1)){
                    int currentDiff = input[mid+1]-k;
                    if((input[mid+1]>k) && (currentDiff >0) ){
                        diff = diff>currentDiff?currentDiff:diff;
                        globalAns = input[mid+1];
                    }
                }
                return BSCeil(input, k, mid+1, high, diff);
            }else{
                if(input[mid]>k){
                    int currentDiff = input[mid]-k;
                    diff = diff>currentDiff?currentDiff:diff;
                    globalAns = input[mid];
                }
                if(mid-1>=0 && input[mid-1]>k){
                    int currentDiff = input[mid-1]-k;
                    diff = diff>currentDiff?currentDiff:diff;
                    globalAns = input[mid-1];
                }
                return BSCeil(input, k, low, mid-1, diff);
            }
        }
    }
}
