package com.java.newfeature.v8;

public class GsCombination {

    public static void main(String[] args) {
        String val = "2123";
        StringBuilder sb = new StringBuilder();

        for(Character c: val.toCharArray()){
            sb.append((char)(96+Integer.parseInt(String.valueOf(c))));
            //sb= new StringBuilder(sb.toString() +((char)(96+Integer.parseInt(String.valueOf(c)))));
        }

        System.out.println(sb.toString());
    }
}
