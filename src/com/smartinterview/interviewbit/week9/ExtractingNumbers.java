package com.smartinterview.interviewbit.week9;

public class ExtractingNumbers {
    public static void main(String[] args) {
        String A = "s17w53pa71lt1c91n55i11b17";
        long sum=0;
        long currentVal =0;
        for(int i=0;i<A.length();i++){
            if(A.charAt(i)>= 48 && A.charAt(i)<=57){
                currentVal = (currentVal*10)+Long.parseLong(String.valueOf(A.charAt(i)));
            }else if(currentVal!=0){
                sum+=currentVal;
                currentVal=0;
            }
        }
        System.out.println(currentVal>0?sum+currentVal:sum);
    }
}
