package com.practice;

public class ClassLoaderImpl {
    public static void main(String[] args) {
        ClassLoader classLoader = ClassLoader.getSystemClassLoader();
        System.out.println(classLoader.getClass());
    }
}
