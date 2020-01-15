package com.practice.designpattern;

import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;

public class CharToUtfEncoding {
    public static void main(String args[]) throws Exception {
        String regex = "^[0-9a-zA-Z]+$";
        String email = "sandeep_mishra*-@abc.com";
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<email.length();i++){
            if(!String.valueOf(email.charAt(i)).matches(regex)){
                byte arr[] = String.valueOf(email.charAt(i)).getBytes("UTF-8");
                for (byte x: arr) {
                    sb.append("%"+String.format("%02X", x));
                }
            }else{
                sb.append(email.charAt(i));
            }
        }
        System.out.println(sb.toString());
    }
}
