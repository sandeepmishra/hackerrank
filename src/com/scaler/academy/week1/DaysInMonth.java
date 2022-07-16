package com.scaler.academy.week1;

import java.util.Scanner;

public class DaysInMonth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        switch (month){
            case 1, 3, 5, 7, 8, 10, 12 -> System.out.println(31);
            case 2 -> System.out.println(28);
            case 4, 6, 9, 11 -> System.out.println(30);
            default -> throw new IndexOutOfBoundsException("Invalid month number..");
        }
    }
}
