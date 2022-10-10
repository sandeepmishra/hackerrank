package com.smartinterview.hackerrank.week7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Equal0sand1s {
    public static void main(String[] args) throws IOException {
        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for(int i=0;i<t;i++) {
            int n = Integer.parseInt(br.readLine());
            String input[] = br.readLine().split(" ");
            int arr[] = new int[n];
            for(int j=0;j<n;j++){
                arr[j] = Integer.parseInt(input[j]);
                if(arr[j]==0){
                    arr[j] = -1;
                }
            }


            int sum=arr[0];
            for(int j=1;j<n;j++){
                sum+=arr[j];
                arr[j]=sum;
            }
            System.out.println("Prefix sum of array.");
            for(int j=0;j<n;j++){
                System.out.print(arr[j]+" ");
            }
            Map<Integer, Integer> map = new HashMap<>();
            int ans =0;
            for(int j=0;j<n;j++){
                if (map.get(arr[j])!= null){
                    int val = j-map.get(arr[j]);
                    ans = Math.max(ans, val);
                }else{
                    map.put(arr[j], j);
                }
            }
            System.out.println(ans);
        }

//        while(t-->0){
//            int n=Integer.parseInt(br.readLine());
//            int ans=0;
//            HashMap <Integer,Integer> hm=new HashMap();
//            int[] a=new int[n];
//            String line=br.readLine();
//            String[] strs=line.trim().split(" "); //taking input in java
//            for(int i=0;i<n;i++){
//                int temp=Integer.parseInt(strs[i]);
//                if(temp==0) //replacing 0s with -1
//                    a[i]=-1;
//            }
//
//            int[] prefix=new int[n];
//            prefix[0]=a[0]; //prefix array
//            for(int i=1;i<n;i++){
//                prefix[i]=prefix[i-1]+a[i];
//            }
//
//
//            for(int i=0;i<n;i++){
//                if(hm.containsKey(prefix[i]))
//                    ans=Math.max(ans,i-hm.get(prefix[i]));
//                else
//                    hm.put(prefix[i],i);
//
//            }
//            System.out.println(ans);
//        }
    }
}
