package com.smartinterview.interviewbit.week7;

import java.util.ArrayList;

/**
 * https://www.interviewbit.com/problems/minimize-the-absolute-difference/
 *
 * Given three sorted arrays A, B  and Cof not necessarily same sizes.
 *
 * Calculate the minimum absolute difference between the maximum and minimum number from the triplet a, b, c such that a, b, c belongs arrays A, B, C respectively.
 *
 * i.e. minimize | max(a,b,c) - min(a,b,c) |.
 *
 * Example :
 *
 * Input:
 *
 * A : [ 1, 4, 5, 8, 10 ]
 * B : [ 6, 9, 15 ]
 * C : [ 2, 3, 6, 6 ]
 *
 *
 */
public class MinimizeAbsoluteDifference {
    public static void main(String[] args) {

    }

    public int solve(ArrayList<Integer> A, ArrayList<Integer> B, ArrayList<Integer> C) {
        int p1 = 0;
        int p2 = 0;
        int p3 = 0;

        int ans = Integer.MAX_VALUE;
        while(p1<A.size() && p2<B.size() && p3<C.size()){

            int a = Math.min(A.get(p1), Math.min(B.get(p2),C.get(p3))); //min of a,b,c
            int b = Math.max(A.get(p1), Math.max(B.get(p2),C.get(p3))); //max of a, b, c

            ans = Math.min(ans, b-a);

            if(a==A.get(p1)){
                p1++;
            }
            if(a==B.get(p2)){
                p2++;
            }
            if(a==C.get(p3)){
                p3++;
            }
        }
        return ans;
    }
}
