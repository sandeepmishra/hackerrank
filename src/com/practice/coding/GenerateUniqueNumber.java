package com.practice.coding;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.SimpleDateFormat;
import java.util.*;

public class GenerateUniqueNumber {


    public static void main(String[] args) {
        //System.out.println(getTimeYearMonthDay("yyyyMMddHHmmss"));
        //getTimeYearMonthDay();
        //System.out.println(getTimeInMillis());
        //System.out.println(getRandom());
        List<String> list = new ArrayList<>();
        String value = getMillPrimaryKey();
        BigInteger bigInteger = BigInteger.ZERO;
        while(!list.contains(value)) {
            value = value.substring(value.length()-6);
            list.add(value);
            //System.out.println(value);
            System.out.println(value);
            value = getMillPrimaryKey();
            bigInteger.add(BigInteger.ONE);
        }
        System.out.println(bigInteger.toString());
        //System.out.println(getDatePrimaryKey());
    }


    public static String getMillPrimaryKey() {
        return getTimeInMillis()+getRandom();
    }


    public static String getRandom() {
        Random random = new Random();
        int nextInt = random.nextInt(Integer.MAX_VALUE);
        String str=String.valueOf(nextInt);
        return str;
    }

    public static String getTimeInMillis() {
        long timeInMillis = Calendar.getInstance().getTimeInMillis();
        return timeInMillis+"";
    }


}
