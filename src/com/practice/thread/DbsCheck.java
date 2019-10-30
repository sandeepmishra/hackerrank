package com.practice.thread;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class DbsCheck implements  Runnable{
    @Override
    public void run() {
        System.out.println("run");
        throw new RuntimeException();
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new DbsCheck());
        t1.start();
        System.out.println("end");
    }
}






