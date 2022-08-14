package com.smartinterview.hackerrank.week5;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * https://www.hackerrank.com/contests/smart-interviews/challenges/si-largest-palindromic-substring-hard
 */
public class LargestPalindromicSubstringHard {

//    static int getAns(long a[], long b[], long power[], int n, String str){
//        int ans = 0, loe = 0;
//
//        for(int i=1;i<n-1;i++){
//            for(int j=loe+1;j<=Math.min(i, n-i-1);j++){
//                if(isValid(a,b,power, i-loe, i+j, n)){
//                    loe=j;
//                }else{
//                    break;
//                }
//            }
//        }
//        ans = 2*(loe+1);
//
//        //loe=0;
//        for(int i=0;i<n-1;i++){
//            if(str.charAt(i)==str.charAt(i+1)){
//                for(int j=loe+1;j<=Math.min(i, n-i-2);j++){
//                    if(isValid(a,b,power, i-j, i+loe+1, n)){
//                        loe=j;
//                    }else{
//                        break;
//                    }
//                    ans = Math.max(2*(loe+2), ans);
//                }
//            }
//        }
//        return ans;
//    }


    public static void main(String[] args)throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for(int i=0;i<t;i++){
            int n = Integer.parseInt(br.readLine());
            String str = br.readLine();
            int K = 1000000007;
            int prime = 101;

            long power[] = new long [n+1];
            computePower(power, n, K, prime);
            long a[] = new long[n];
            long b[] = new long[n];

            a[0]=str.charAt(0)*prime;
            b[n-1]=str.charAt(n-1)*prime;
            //pfyafafd
            for(int j=1;j<n;j++){
                a[j]=((a[j-1]%K)+((str.charAt(j)%K) * (power[j+1]%K)))%K;
                b[n-j-1]=((b[n-j]%K)+((str.charAt(n-j-1)%K) * (power[j+1]%K)))%K;
            }

            int ans = 1;
            //for odd length
            for(int j=1;j<n-1;j++){
                ans = Math.max(ans, BS(a, b, power, j, j, n));
            }
            // for even length
            for(int j=1;j<n-1;j++){
                if(str.charAt(j) == str.charAt(j+1)){
                    ans = Math.max(ans, BS(a, b, power, j, j+1, n));
                }
            }

            System.out.println(ans);
            //System.out.println(getAns(a, b, power, n, str));
        }
    }


    static int BS(long a[], long b[], long power[], int c1, int c2, int n){
        int ans = 0, mid, low=0;
        int high = Math.min(c1, n-c2-1);
        while(low<=high){
            mid = (low+high)/2;
            if(isValid(a,b, power, c1-mid, c2+mid, n)){
                ans = (2*mid)+1+(c2-c1);
                low = mid+1;
            }else{
                high = mid-1;
            }
        }

        return ans;
    }

    private static boolean isValid(long[] a, long[] b, long[] power, int i, int j, int n) {
        int K = 1000000007;
        long fh = (a[j] - (i==0?0:a[i-1]) +K)%K;
        long bh = (b[i] - (j==n-1?0:b[j+1])+K)%K;
        int sppfh = i+1;
        int sppbh = n-j;
        int d = Math.abs(sppfh-sppbh);
        if(sppfh<sppbh){
            fh = ((fh%K)* (power[d]%K))%K;
        }else{
            bh = ((bh%K)*(power[d]%K))%K;
        }
        return fh == bh;
    }

    public static void computePower(long power[],int m,int K,int prime){
        power[0] = 1;
        for(int j=1;j<=m;j++){
            power[j]= (((power[j-1])%K) * (prime%K) )%K;
        }
    }
}
