package com.algorithm.dynamicprograming;


public class TowerOfHannoi {
    public static void main(String[] args) {
        System.out.println(5D);
        //towerOfhanoi(4, 'A',  'B', 'C');
    }

    static void towerOfhanoi(int n, char from, char to, char aux_char){
        if(n==1){
            System.out.println("Move disk 1 from rod " +  from + " to rod " + to);
        }
        towerOfhanoi(n-1, from, aux_char, to);
        System.out.println("Move disk " + n + " from rod " +  from + " to rod " + to);
        towerOfhanoi(n-1, aux_char, to , from);
    }
}
