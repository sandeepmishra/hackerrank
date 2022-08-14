package com.smartinterview.hackerrank.week5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class RabinKarpStringMatchingAlgorithm {
//    public static void main(String[] args) throws Exception {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int t= Integer.parseInt(br.readLine());
//
//        for(int i=0;i<t;i++){
//            String [] str = br.readLine().split(" ");
//            int prime=101;
//            String a = str[0];
//            String b = str[1];
//            int n = a.length();
//            int m = b.length();
//            int K = 1000000007;
//
//            int resultCount=0;
//            // compute power
//            long power[] = new long [m+1];
//            long primePower = prime;
//
//            long ha=0, hb=0;
//            for(int j=0;j<n;j++){
//                ha = ((ha)%K + ((a.charAt(j)%K) * primePower % K)%K)%K;
//                hb = ((hb)%K + ((b.charAt(j)%K) * (primePower % K))%K)%K;
//                primePower = ((primePower)%K * (prime%K))%K;
//            }
//
//            if(ha==hb){
//                resultCount++;
//            }
//
//            for(int j=n;j<m;j++){
//                //hb = (((( (hb%K) + ((b.charAt(j)%K) * (primePower%K))  % K)%K ) - ((b.charAt(j-n) * power[j+1-n]) % K) + K ) %K;
//                hb = (((hb%K) + ((b.charAt(j)%K) * (primePower%K))%K) %K - ((b.charAt(j-n))%K * primePower%K) %K + K)%K;
//                ha = ((ha%K) * (primePower%K)) %K;
//                if(ha==hb){
//                    resultCount++;
//                }
//                primePower=((primePower%K)*(prime%K))%K;
//            }
//
//            System.out.println(resultCount);
//        }
//
//    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t= Integer.parseInt(br.readLine());

        for(int i=0;i<t;i++){
            String [] str = br.readLine().split(" ");
            int prime=101;
            String a = str[0];
            String b = str[1];
            int n = a.length();
            int m = b.length();
            int K = 1000000007;

            int resultCount=0;
            // compute power
            long power[] = new long [m+1];
            computePower(power, m, K, prime);

            long ha=0, hb=0;
            for(int j=0;j<n;j++){
                ha = ((ha%K) + (a.charAt(j)%K) * (power[j+1])%K) % K;
                hb = ((hb%K) + (b.charAt(j)%K) * (power[j+1])%K) % K;
            }

            if(ha==hb){
                resultCount++;
            }

            for(int j=n;j<m;j++){
                hb = ((((hb%K) + (b.charAt(j)%K) * (power[j+1])%K)  % K)%K - (((b.charAt(j-n)%K) * (power[j+1-n])%K) % K)%K + K ) %K;
                ha = ((ha%K) * (prime%K)) %K;

                if(ha==hb){
                    resultCount++;
                }
            }

            System.out.println(resultCount);
        }

    }

    public static void computePower(long power[],int m,int K,int prime){
        power[0] = 1;
        for(int j=1;j<=m;j++){
            power[j]= (((power[j-1])%K) * (prime%K) )%K;
        }
    }
}
