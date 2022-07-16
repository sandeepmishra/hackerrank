package com.practice.coding;

public class LongestSubSequence {

    public static boolean isSubsequence(String s, String t) {
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<t.length();i++){
            if(s.contains(String.valueOf(t.charAt(i)))){
                sb = sb.append(t.charAt(i));
            }
        }
        if(sb.toString().equals(s)){
            return true;
        }else if(s.length()>sb.length()){
            return false;
        }else{
            StringBuilder ssb = new StringBuilder();
            for(int i=0;i<s.length();i++){
                if(!ssb.toString().contains(String.valueOf(s.charAt(i)))){
                    ssb = ssb.append(s.charAt(i));
                }
            }
            StringBuilder tsb = new StringBuilder();
            for(int i=0;i<sb.length();i++){
                if(!tsb.toString().contains(String.valueOf(sb.charAt(i)))){
                    tsb = tsb.append(sb.charAt(i));
                }
            }
            return ssb.toString().equals(tsb.toString());
        }
    }
}
