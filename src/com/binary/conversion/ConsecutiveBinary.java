package com.binary.conversion;

import java.math.BigInteger;

public class ConsecutiveBinary {

    public int power(int n, int p)throws Exception{
        int power = 0;
        if(n>0 && p>0){
            power = (int)Math.pow(n, p);
        }if(n<0 || p<0){
            throw new Exception("n and p should be non-negative");
        }
        return power;
    }
    public static void main(String[] args) {

        //System.out.println((int)Math.pow(-1,4));
        int n=1, p=0;
        try {
            int ans = new ConsecutiveBinary().power(n, p);
            System.out.println(ans);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }

        //System.out.println(concatenatedBinary(12));
    }

    public static int concatenatedBinary(int n) {
        StringBuilder sb = new StringBuilder();
        for(int i=1;i<= n;i++){
            sb.append(getBinary(i));
        }
        BigInteger bigInteger = BigInteger.ZERO;
        int count=0;
        int length = sb.toString().length();
        for(int i=length-1;i>=0;i--){
            if(sb.charAt(i)!='0') {
                bigInteger = bigInteger.add(new BigInteger("2").pow(count).multiply(new BigInteger(String.valueOf(sb.charAt(i)))));
            }
            count++;
        }
        return bigInteger.mod(new BigInteger("1000000007")).intValue();
    }

    public static String getBinary(int n){
        StringBuilder sb = new StringBuilder();
        while(n>0){
            sb.insert(0, n%2);
            n=n/2;
        }
        return sb.toString();
    }
}
