package com.smartinterview.hackerrank.week3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PairWithDifferenceK {

    public static void main(String[] args)throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for(int i=0;i<t;i++){
            String nval[] = br.readLine().split(" ");
            int n = Integer.parseInt(nval[0]);
            int k= Integer.parseInt(nval[1]);
            String inputStr[]  = br.readLine().split(" ");
            int arr[] = new int[inputStr.length];
            for(int j=0;j<inputStr.length;j++){
                arr[j] = Integer.parseInt(inputStr[j]);
            }
            mergeSort(arr, 0, arr.length-1);
//            System.out.println(solve(arr, n, k));

            boolean isFound = false;
            for(int j=0;j<arr.length;j++){
                int getVal = k+arr[j];
                if(binarySearch(arr, getVal, 0, arr.length-1)){
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

    static boolean binarySearch(int arr[], int k,int low,int high){
        if(low>high){
            return false;
        }else{
            int mid = (low+high)/2;
            if(k==arr[mid]){
                return true;
            }else if (k>arr[mid]){
                return binarySearch(arr, k, mid+1, high);
            }else{
                return binarySearch(arr, k, low, mid-1);
            }
        }
    }
}
