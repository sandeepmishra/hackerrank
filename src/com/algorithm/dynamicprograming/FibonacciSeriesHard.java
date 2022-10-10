package com.algorithm.dynamicprograming;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class FibonacciSeriesHard {
    static long val = 1000000000000000000L;
    static int f[] = new int[0];
    public static void main(String[] args)throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t  = Integer.parseInt(br.readLine());


    }

    public static int fib(int n)
    {
        // Base cases
        if (n == 0)
            return 0;

        if (n == 1 || n == 2)
            return (f[n] = 1);

        // If fib(n) is already computed
        if (f[n] != 0)
            return f[n];

        int k = (n & 1) == 1? (n + 1) / 2
                : n / 2;

        // Applying above formula [Note value
        // n&1 is 1 if n is odd, else 0.
        f[n] = (n & 1) == 1? (fib(k) * fib(k) +
                fib(k - 1) * fib(k - 1))
                : (2 * fib(k - 1) + fib(k))
                * fib(k);

        return f[n];
    }
}
