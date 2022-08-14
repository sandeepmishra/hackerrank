package com.smartinterview.interviewbit.week5;

public class CountWord {
    public static void main(String[] args) {
        String val = "f rjv  r brynrstbitjztbxlmhexbnimcbjxmbud wtzg";
        String p[] = val.split(" ");
        int count=0;
        for(String s: p){
            if(!s.trim().equals("")){
                count++;
            }
        }
        System.out.println(count);
    }
}
