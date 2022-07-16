package com.algorithm.dynamicprograming;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class SumAllPrevArrElements {
    public static void main(String[] args) {
//        int arr[] = {1,2,3,4,5,6};
//        sumAllPreviousElements(arr, 0);
//        StringBuilder sb=new StringBuilder();
//        for (int val:arr) {
//            System.out.println(val);
//        }
//
//
//        Predicate<String> stringPredicate = (s) -> s.equals("5");
//        System.out.println(stringPredicate.test("5"));
//        DefaultA defaultA = new Implementor();
//        defaultA.printAble();
        String multilineString = """
                Hi There this is multi line
                String 
                """;
        Math.sqrt(100D);
        System.out.println(multilineString);
//        Implementor implementor = new Implementor();
//        implementor.printAbleImplementor();

    }

    static int[] sumAllPreviousElements(int []arr, int n){
        if(n==arr.length-1){
            return arr;
        }else{
            arr[n+1] = arr[n]+arr[n+1];
            return sumAllPreviousElements(arr, n+1);
        }
    }

}


interface  DefaultA{
    default void printAble(){
        System.out.println("Default pritableA");
    }
    default void printAble1(){
        System.out.println("Default pritableA");
    }
    default void printAble2(){
        System.out.println("Default pritableA");
    }
    static void printAbleB(){
        System.out.println("Default pritableB");
    }
    static void printAbleB1(){
        System.out.println("Default pritableB");
    }
    static void printAbleB2(){
        System.out.println("Default pritableB");
    }

}

interface  DefaultB{
    static void printAbleB(){
        System.out.println("Default pritableB");
    }
}

class Implementor implements DefaultA {

    public void printAbleImplementor(){
        //DefaultB.printAbleB();
        List<String> strings= List.of("A", "B");
        //strings.add("C");  // will throw unsupported operation exception
        System.out.println(strings);
        printAble();
        System.out.println("Implementor have their own printable.");
    }


    public void printAble(){

        System.out.println("Hello from printable A of implementor");
    }

}