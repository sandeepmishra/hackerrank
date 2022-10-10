package com.smartinterview.hackerrank.week13;

import java.util.LinkedList;
import java.util.List;

public class TrieContacts {
    public static void main(String[] args) {

    }

    public static List<Integer> contacts(List<List<String>> queries) {
        Node root = new Node();
        List<Integer> li = new LinkedList<>();
        for(List<String> strings: queries){
            String q = strings.get(0);
            String str = strings.get(1);

            if("add".equals(q)){
                insert(root, str);
            }else if("find".equals(q)){
                int cnt = search(root, str);
                li.add(cnt);
            }
        }

        return li;
    }

    static class Node{
        Node c[] = new Node[26];
        int cnt;

        Node(){
            for (int i=0;i<26;i++){
                c[i]=null;
            }
            cnt = 0;
        }
    }

    static void insert(Node root, String str){
        for(int i=0;i<str.length();i++){
            int idx = str.charAt(i)-'a';
            if(root.c[idx]==null){
                root.c[idx] = new Node();
            }
            root = root.c[idx];
            root.cnt++;
        }
    }

    static int search(Node root, String str){
        int i=0;
        while(i<str.length() && root!=null){
            int idx = str.charAt(i)-'a';
            root = root.c[idx];
            i++;
        }

        if(root != null){
            return root.cnt;
        }
        return 0;
    }
}
