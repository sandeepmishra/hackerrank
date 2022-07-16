package com.practice.interalink;


import java.util.ArrayList;
import java.util.List;

public class MainClass {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        for(int i=1;i<=101;i++){
            list.add(i);
        }

        List<List<Integer>> getChunkedList = getChunkedList(list, 5);
        getChunkedList.forEach(listVal -> System.out.println(listVal));
        System.out.println(getChunkedList.size());

    }

    public static List<List<Integer>> getChunkedList(List<Integer> list, int size){
        List<List<Integer>> devidedList = new ArrayList<>();
        int startPoint =0;
        while(startPoint<list.size()){
            if((startPoint+size)>list.size()){
                size = list.size()-startPoint;
            }
            List<Integer> devidedPart = list.subList(startPoint, startPoint+size);
            devidedList.add(devidedPart);
            startPoint = startPoint+size;
        }

        return devidedList;
    }
}
