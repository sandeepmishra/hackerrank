package com.hackerrank.java;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RequiredSumArr {
    public static void main(String[] args) {
        int arr[] = {2, 3,4,8,5,9};
        System.out.println(isFound(arr, 1000));
        List<Integer> li= List.of(2, 3,4,8,5,9, 4, 5, 9);
        Set<Integer> set = li.stream().collect(Collectors.toSet());
        System.out.println( set);
    }

    static boolean isFound(int arr[], int required){
        boolean isFound = false;
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(sum==required){
                isFound=true;
            }
//            sum+=arr[i];
//            for(int j=i+1;j<arr.length;j++){
//                sum+=arr[j];
//                if(required==sum){
//                    isFound=true;
//                    break;
//                }
//            }
//            sum=0;
        }
        return isFound;
    }
}
