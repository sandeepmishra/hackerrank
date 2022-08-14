package com.smartinterview.hackerrank.week7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;


/**
 *
 * https://www.hackerrank.com/contests/smart-interviews/challenges/si-number-of-valid-subarrays/problem
 * https://www.geeksforgeeks.org/count-subarrays-equal-number-1s-0s/
 */
public class NumberOfValidSubarrays {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
//        int t = Integer.parseInt(br.readLine());
//
//        for(int i=0;i<t;i++) {
//            int n = Integer.parseInt(br.readLine());
//            String input[] = br.readLine().split(" ");
//            int ar[] = new int[n];
//            for(int j=0;j<n;j++){
//                ar[j] = Integer.parseInt(input[j]);
//                if(ar[j]==0){
//                    ar[j] = -1;
//                }
//                if(j>0){
//                    ar[j] = ar[j-1]+ar[j];
//                }
//            }
//
//            Map<Integer, Integer> map = new HashMap<>();
//            int ans =0;
//            for(int j=0;j<n;j++){
//                if(map.containsKey(ar[j])){
//                    ans =  Math.max(ans, j- map.get(ar[j]));
//                }else{
//                    map.put(ar[j], j);
//                }
//            }
//            System.out.println(ans);
//        }
//    }

    public static void main(String[] args) throws IOException {
        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for(int i=0;i<t;i++) {
            int n = Integer.parseInt(br.readLine());
            String input[] = br.readLine().split(" ");
            int arr[] = new int[n];
            int sum=0, count=0;
            Map<Integer, Integer> map = new HashMap<>();
            for(int j=0;j<n;j++){
                arr[j] = Integer.parseInt(input[j]);
                if(arr[j]==0){
                    arr[j] = -1;
                }
                sum+=arr[j];
                if(sum==0){
                    count++;
                }
                if (map.containsKey(sum))
                    count += map.get(sum);

                if (!map.containsKey(sum))
                    map.put(sum, 1);
                else
                    map.put(sum, map.get(sum) + 1);
            }

            System.out.println(count);
        }
    }

}
