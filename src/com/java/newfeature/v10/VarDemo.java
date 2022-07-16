package com.java.newfeature.v10;

import java.util.ArrayList;
import java.util.function.Predicate;

//java flight recorder
//java missio control
//java profiling
public class VarDemo {
    public static void main(String[] args) {
        //System.out.println(null instanceof String);
        ImplementorInterface implementorInterfaceA = new ImplementorA();
        System.out.println(implementorInterfaceA instanceof  ImplementorA);
        ImplementorInterface implementorInterfaceB = new ImplementorB();
        System.out.println(implementorInterfaceB instanceof  ImplementorB);
    }
}

interface ImplementorInterface{
    void implementMethod();
}

class ImplementorA implements ImplementorInterface{

    @Override
    public void implementMethod() {
        System.out.println("ImplementorInterfaceB");
    }
}

class ImplementorB implements ImplementorInterface{

    @Override
    public void implementMethod() {
        System.out.println("ImplementorInterfaceB");
    }
}