package com.practice.interalink;

import java.util.*;
import java.util.stream.Collectors;

// list 1 to 10 numbers
// lambda to seggregate even odd list
public class DeadLockDemo {
    public static void main(String[] args){
        solve(10.25, 17, 5);
    }

    public static void solve(double meal_cost, int tip_percent, int tax_percent) {
        // Write your code here
        double tip = (meal_cost * tip_percent)/100;
        double tax = (meal_cost * tax_percent)/100;
        System.out.println(meal_cost+tip+tax);
        System.out.println((int)Math.ceil(meal_cost+tip+tax));
    }
}




