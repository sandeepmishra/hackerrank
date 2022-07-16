package com.scaler.academy.week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class CheckPrime {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //int number = Integer.parseInt(br.readLine());

        int t = Integer.parseInt(br.readLine());
        for(int i=0;i<t;i++){
            int size = Integer.parseInt(br.readLine());
            String input[] = br.readLine().split(" ");
            int arr[] = new int[size];
            for(int j=0;j<size;j++){
                arr[j] = Integer.parseInt(input[j]);
            }

            if(arr[0]==1 && arr[size-1]==size){
                System.out.println(0);
            }else{
                int swapCount =0;
                swapCount= merge(arr, 0, (arr.length-1)/2,arr.length-1, swapCount);

                System.out.println(swapCount);
            }
        }

        Set<String> set = new HashSet<>();

//        long a = 999999999999999999l;
//        System.out.println(isPrimeNumber(number));
    }

    static boolean isPrimeNumber(int number){
        boolean isPrime = true;
        int n = (int)Math.sqrt(number);
        for(int i=2;i<=n;i++){
            if(number % i==0){
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }

    static int merge(int[] array, int left, int mid, int right, int swapCount) {
        // calculating lengths
        int lengthLeft = mid - left + 1;
        int lengthRight = right - mid;

        // creating temporary subarrays
        int leftArray[] = new int [lengthLeft];
        int rightArray[] = new int [lengthRight];

        // copying our sorted subarrays into temporaries
        for (int i = 0; i < lengthLeft; i++)
            leftArray[i] = array[left+i];
        for (int i = 0; i < lengthRight; i++)
            rightArray[i] = array[mid+i+1];

        // iterators containing current index of temp subarrays
        int leftIndex = 0;
        int rightIndex = 0;

        // copying from leftArray and rightArray back into array
        for (int i = left; i < right + 1; i++) {
            // if there are still uncopied elements in R and L, copy minimum of the two
            if (leftIndex < lengthLeft && rightIndex < lengthRight) {
                if (leftArray[leftIndex] < rightArray[rightIndex]) {
                    array[i] = leftArray[leftIndex];
                    swapCount++;
                    leftIndex++;
                }
                else {
                    array[i] = rightArray[rightIndex];
                    swapCount++;
                    rightIndex++;
                }
            }
            // if all the elements have been copied from rightArray, copy the rest of leftArray
            else if (leftIndex < lengthLeft) {
                array[i] = leftArray[leftIndex];
                leftIndex++;
            }
            // if all the elements have been copied from leftArray, copy the rest of rightArray
            else if (rightIndex < lengthRight) {
                array[i] = rightArray[rightIndex];
                rightIndex++;
            }
        }
        return swapCount;
    }
}
