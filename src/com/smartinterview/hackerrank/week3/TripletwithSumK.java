package com.smartinterview.hackerrank.week3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TripletwithSumK {
    public static void main(String[] args)throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for(int i=0;i<t;i++){
            String[] nval = br.readLine().split(" ");
            int n = Integer.parseInt(nval[0]);
            int k= Integer.parseInt(nval[1]);
            String inputStr[]  = br.readLine().split(" ");
            int arr[] = new int[inputStr.length];
            for(int j=0;j<inputStr.length;j++){
                arr[j] = Integer.parseInt(inputStr[j]);
            }
            mergeSort(arr, 0, arr.length-1);

            boolean isFound = false;
            for(int j=0;j<arr.length;j++){

                int sum = k-arr[j];

                if(solve(arr,j, n, sum)){
                    isFound = true;
                    break;
                }
            }
            System.out.println(isFound);

        }
    }

    static void mergeSort(int a[], int beg, int end)
    {
        if (beg < end)
        {
            int mid = (beg + end) / 2;
            mergeSort(a, beg, mid);
            mergeSort(a, mid + 1, end);
            merge(a, beg, mid, end);
        }
    }

    static void merge(int a[], int beg,int mid, int end){
        int i, j, k;
        int n1 = mid - beg + 1;
        int n2 = end - mid;

        int LeftArray[]=new int[n1];
        int RightArray[]=new int[n2]; //temporary arrays

        /* copy data to temp arrays */
        for (i = 0; i < n1; i++)
            LeftArray[i] = a[beg + i];
        for (j = 0; j < n2; j++)
            RightArray[j] = a[mid + 1 + j];

        i = 0; /* initial index of first sub-array */
        j = 0; /* initial index of second sub-array */
        k = beg;  /* initial index of merged sub-array */

        while (i < n1 && j < n2)
        {
            if(LeftArray[i] <= RightArray[j])
            {
                a[k] = LeftArray[i];
                i++;
            }
            else
            {
                a[k] = RightArray[j];
                j++;
            }
            k++;
        }
        while (i<n1)
        {
            a[k++] = LeftArray[i++];
        }

        while (j<n2)
        {
            a[k++] = RightArray[j++];
        }
    }

    static boolean solve(int ar[],int idx, int N, int K) {
        int p1=0, p2 = N-1;
        while(p1<p2) {
            int s = ar[p1] + ar[p2];
            if(s==K){
                return true;
            }else{
                if(s<K){
                    p1= (p1+1)==idx? p1+2:p1+1;
                }
                if(s>K){
                    p2= p1-1==idx?p2-2:p2-1;
                }
            }
        }
        return false;
    }
}
