package com.datastructures.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BalancedString {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer inputCount = Integer.parseInt(br.readLine());
        String arr[] = new String[inputCount];
        for(int i=0;i<inputCount;i++){
            arr[i] = br.readLine();
        }

        for(int i=0;i<arr.length;i++){
            Shape shape = ShapeFactory.getShape(arr[i]);
            if(shape==null){
                System.out.println("Drawing "+arr[i]+" is not supported");
            }else{
                shape.drwaShape();
            }
        }


    }
}

abstract class Shape{
    public abstract void drwaShape();
}

class Square extends Shape{

    @Override
    public void drwaShape() {
        System.out.println("Now drawing a Square");
    }
}

class Circle extends Shape{

    @Override
    public void drwaShape() {
        System.out.println("Now drawing a Circle");
    }
}

class Rectangle extends Shape{

    @Override
    public void drwaShape() {
        System.out.println("Now drawing a Rectangle");
    }
}

class ShapeFactory{

    static {
        System.out.println("Drawing a Circle");
        System.out.println("Drawing a Square");
        System.out.println("Drawing a Rectangle");
        System.out.println();
    }
    public static Shape getShape(String shape){
        if("Rectangle".equals(shape)){
            return new Rectangle();
        }
        if("Circle".equals(shape)){
            return new Circle();
        }
        if("Square".equals(shape)){
            return new Square();
        }
        return null;
    }
}
