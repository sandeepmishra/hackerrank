//package com.java.newfeature.v14;
//
//import java.math.BigDecimal;
//
///**
// *  1. instanceof operator change
// *  2. switch case change
// */
//public class ChangeList {
//
//    public static void main(String[] args) {
//        ChangeList changeList = new ChangeList();
//        changeList.parentChildCheck();
//        changeList.switchCaseCheck("Value1");
//        changeList.recordCheck();
//    }
//
//    // Feature 1
//    public void parentChildCheck(){
//        Parent child = new Child();
////        if(child instanceof Child ch){
////            System.out.println("Java 14 way of using instanceof..");
////        }
//    }
//
//    // Feature 2
//    public void switchCaseCheck(String value){
//        switch (value){
//            case "Value1"->System.out.println("Return value1");
//            case "Value2" -> System.out.println("value 2");
//
//        }
//    }
//
//    //Feature 3 creating record type for when dont want to data to be altered..
////    public void recordCheck(){
////        RecordDemo recordDemo = new RecordDemo("Tata tea gold", new BigDecimal("50.98"), Quantity.GMS100);
////        System.out.println(recordDemo.toString());
////    }
//
//    // Feature 4 NPE(Null pointer exception)
//    public void nullPointerExceptionCheck(){
//
//    }
//    class Parent
//    {
//
//    }
//
//    class Child extends Parent{
//
//    }
//}
//
