package com.dsa.revision.week1;

/**
 * (1) Create a low pointer at the beginning of the array and a high pointer at the end of the array.
 * (2) Create a mid pointer that starts at the beginning of the array and iterates through each element.
 * (3) If the element at arr[mid] is a 2, then swap arr[mid] and arr[high] and decrease the high pointer by 1.
 * (4) If the element at arr[mid] is a 0, then swap arr[mid] and arr[low] and increase the low and mid pointers by 1.
 * (5) If the element at arr[mid] is a 1, don't swap anything and just increase the mid pointer by 1.
 */
public class DutchNationnalFlagSumSortedArray {
    public static void main(String[] args) {

        int a[]  = {0,0};// {1,1};, {0}, {1}, {1,0,0}
        sortArrayUsingDutchNationalFlagAlgorithm(a);
        for(int i:a){
            System.out.print(i+" ");
        }
    }

    public static int [] sortArrayUsingDutchNationalFlagAlgorithm(int a[]){
        int low=0,mid=0,high=a.length-1;

        while(mid<=high && high>0){
            if(a[mid]==2){
                int ahigh=a[high];
                a[high--]=a[mid];
                a[mid]=ahigh;
            }
            if(a[mid]==0){
                int alow=a[low];
                a[low++]=a[mid];
                a[mid++]=alow;
            }
            if(mid<=high && a[mid]==1){
                mid++;
            }
        }

        return a;
    }
}
