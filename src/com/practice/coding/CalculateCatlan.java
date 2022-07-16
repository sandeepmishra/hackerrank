package com.practice.coding;

import java.math.BigDecimal;

public class CalculateCatlan {

    public static void main(String[] args) {
        System.out.println(new CalculateCatlan().numTrees(7));
    }
    public int numTrees(int n) {
        if(n==0 || n== 1){
            return 1;
        }

        return getCatlan(n);
    }


    public int getCatlan(int n){
        BigDecimal tF = getFactorial(2*n);
        BigDecimal nPF = getFactorial(n+1);
        BigDecimal nF = nPF.divide(new BigDecimal(n+1));
        return tF.divide(nPF.multiply(nF)).intValue();
    }

    public BigDecimal getFactorial(int n){
        if (n == 0)
            return new BigDecimal(1);

        return new BigDecimal(n).multiply(getFactorial(n - 1));
    }
}
