package com.smartinterview.hackerrank.week10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ContinuousHeightofTree {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-->0){
            int n = Integer.parseInt(br.readLine());
            String arr[] = br.readLine().split(" ");
            insertIntoBST(arr);
            //System.out.print(root.height+" ");
            System.out.println();
        }

    }

    static void insertIntoBST(String arr[]){
        Node root = null;
        int maxHeight =0;

        for(int i=0;i<arr.length;i++){
            int key = Integer.parseInt(arr[i]);
            Node curr = root;
            Node parent = null;
            if (root == null) {
                root = new Node(key);
                root.height = 0;
            }else{
                while (curr != null)
                {
                    parent = curr;
                    if (key < curr.val) {
                        curr = curr.left;
                    }
                    else {
                        curr = curr.right;
                    }
                }
                if (key < parent.val) {
                    parent.left = new Node(key);
                    parent.left.height = parent.height+1;
                    maxHeight = Math.max(maxHeight, parent.left.height);
                }
                else {
                    parent.right = new Node(key);
                    parent.right.height = parent.height+1;
                    maxHeight = Math.max(maxHeight, parent.right.height);
                }
            }

            System.out.print(maxHeight+" ");
        }
    }

    static class Node {
        int val;
        Node left;
        Node right;
        int height;
        Node(int val) {
            this.val = val;
            this.height =0;
        }
    }
}
