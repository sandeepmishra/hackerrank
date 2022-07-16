package com.scaler.academy.week1;

import java.util.Scanner;

/**
Given an integer A denoting the amount of units of electricity consumed, you have to calculate the electricity bill (in Rs.) with the help of the below charge conditions:

        For first 50 units Rs. 0.50/unit
        For next 100 units Rs. 0.75/unit
        For next 100 units Rs. 1.20/unit
        For unit above 250 Rs. 1.50/unit
        An additional surcharge of 20% is added to the bill.

        NOTE: As the electricity bill can have any real value (floating point), you have to tell the floor value of the bill.

        Floor value of a floating point is the closest integer less than or equal to that value. For eg, Floor value of 2.91 is 2.
**/
public class BillCalculator {
    public static void main(String[] args) {
        int inputUnit = new Scanner(System.in).nextInt();
        int billSum = 0;
        //For first 50 units Rs. 0.50/unit
        if(inputUnit>=50){
            billSum+=(50*.5);

        }else if(inputUnit>0){
            billSum+=(inputUnit*.5);

        }
        inputUnit-=50;
        //For next 100 units Rs. 0.75/unit
        if(inputUnit>=100){
            billSum+=(100*.75);
            inputUnit-=100;
        }else if(inputUnit>0){
            billSum+=(inputUnit*.75);
        }

        //For unit above 250 Rs. 1.50/unit
        if(inputUnit>0){
            billSum+=(inputUnit*1.5);
            inputUnit=00;
        }

        billSum+= billSum*0.2;

        System.out.println(billSum);
    }
}
