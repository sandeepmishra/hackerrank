package com.java.newfeature.v8;

public class CheckCustomFunctionalInterface {
    public static final int VAL = 10;
    int i=12;
    public static void main(String[] args) {
        CustomFunctionalInterface calculateSquare = (i)-> i*i;
        CustomFunctionalInterface calculateSum = (i)-> i+i;

        System.out.println(calculateSquare.doCalculation(5));
        System.out.println(calculateSum.doCalculation(100));





        for(int j=0;j<5;j++){
            PrintInstance printInstance = (message -> System.out.println(message));
            printInstance.print(printInstance.toString()+"  " +VAL);
        }
        System.out.println("******************************************************************");
        new CheckCustomFunctionalInterface().printFromFunctionalInterface();

    }

    public void printFromFunctionalInterface(){
        for(int j=0;j<5;j++){
            PrintInstance printInstance = (message -> System.out.println(message));
            printInstance.print(printInstance.toString()+"  " +i);
        }
    }
}

@FunctionalInterface
interface CustomFunctionalInterface{
    double doCalculation(int x);
}

@FunctionalInterface
interface PrintInstance{
    void print(String message);
}
