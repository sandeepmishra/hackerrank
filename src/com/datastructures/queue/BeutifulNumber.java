package com.datastructures.queue;

public class BeutifulNumber {
    public static void main(String[] args) {
        long sum = solve(41, 18467);
        System.out.println(sum);
    }

    static long solve(int l, int r){
        long result = 0, sum =0;
        for(int i=l;i<=r;i++){
            result = isBeutiful(i);
            if(result==1){
                sum+=i;
            }
            while(result!=1 && result>0){
                result = isBeutiful(result);
                if(result==1){
                    sum+= i;
                }else if(result==4){
                    break;
                }
            }
            System.out.println(i+" "+sum);
        }

        return sum;
    }

    static long isBeutiful(long num){
        long rem=0, sum =0;
        while(num>0){
            rem = num%10;
            sum = sum+(rem*rem);
            num = num/10;
        }
        return sum;
    }
}
