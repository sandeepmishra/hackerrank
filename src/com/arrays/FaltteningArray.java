package com.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FaltteningArray {
    public static void main(String[] args) {
        int arr[][] = {{16,18,49}};
        int newArr[]={49, 18, 16};
        System.out.println(canFormArray(newArr, arr));
    }


    public static boolean canFormArray(int[] arr, int[][] pieces) {

        IntStream piecesStream = Stream.of(pieces)
                .flatMapToInt(Arrays::stream);
        List<Integer> arrayList = piecesStream.mapToObj(i->i).collect(Collectors.toList());
        List<Integer> arrList = Arrays.stream(arr).mapToObj(i->i).collect(Collectors.toList());
        boolean canForm = true;
        for(Integer val: arrList){
            if(!arrayList.contains(val)){
                canForm = false;
                break;
            }
        }
        return canForm;
    }
}
