package com.smartinterview.hackerrank.week3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * https://www.hackerrank.com/contests/smart-interviews/challenges/si-cabinets-partitioning
 *
 */
public class CabinetsPartitioning {
    private static int globalAns=Integer.MAX_VALUE;
    public static void main(String[] args)throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for(int i=0;i<t;i++){
            String [] arr = br.readLine().split(" ");
            int N = Integer.parseInt(arr[0]);
            int k = Integer.parseInt(arr[1]);
            arr = br.readLine().split(" ");
            //int [] input = new int[N];
//            for(int j=0;j<N;j++){
//                input[j]=Integer.parseInt(arr[j]);
//            }
            globalAns=Integer.MAX_VALUE;
            solve(arr, N, k, 0, 0);
            System.out.println(globalAns);
        }
    }

    private static void solve(String[] input, int n, int k, int idx, int cans) {
        if(k==1){
            int sum = sumOffArray(input, idx, n-1);
            cans = sum>cans?sum:cans;
            globalAns=globalAns>cans?cans:globalAns;
            return;
        }
        int sumval = 0;
        for(int i=idx;i<n-1;i++){
            sumval+=Integer.parseInt(input[i]);
            cans = cans>sumval?cans:sumval;
            solve(input, n, k-1, i+1, cans);
        }
    }

    private static int sumOffArray(String [] input, int idx, int n) {
        int sum = 0;
        for(int i=idx;i<=n;i++){
            sum+=Integer.parseInt(input[i]);
        }
        return sum;
    }

}
