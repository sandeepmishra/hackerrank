package com.smartinterview.hackerrank.week10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HeightofTree {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-->0){
            int n = Integer.parseInt(br.readLine());
            String arr[] = br.readLine().split(" ");
            Node root = null;
            for(int i=0;i<n;i++){
                root = insertIntoBST(root, Integer.parseInt(arr[i]));
            }

            System.out.println(heightOfBST(root));
        }
    }

    private static int heightOfBST(Node root) {
        if(root == null){
            return -1;
        }

        return 1 + Math.max(heightOfBST(root.left), heightOfBST(root.right));
    }

    static Node insertIntoBST(Node root, int val){
        if(root == null){
            root = new Node(val);
            return root;
        }
        else if(val < root.val){
            root.left = insertIntoBST(root.left, val);
        }else if( val> root.val){
            root.right = insertIntoBST(root.right, val);
        }

        return root;
    }

    static class Node {
        int val;
        Node left;
        Node right;
        Node(int val) { this.val = val; }
    }
}
