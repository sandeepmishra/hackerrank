package com.smartinterview.hackerrank.week10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BSTOperations {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        int count=1;
        while(t-->0){
            int q = Integer.parseInt(br.readLine());
            Node root = null;
            System.out.println("Case #"+(count++)+":");
            while(q-->0){
                String arr[] = br.readLine().split(" ");
                int a = Integer.parseInt(arr[0]);

                if(a==1){
                    root = insertIntoBST(root, Integer.parseInt(arr[1]));
                }
                if(a==2){
                    deleteNode(root, Integer.parseInt(arr[1]));
                }
                if(a==3){
                    int key = Integer.parseInt(arr[1]);
                    if(search(root, key)){
                        System.out.println("Yes");
                    }else{
                        System.out.println("No");
                    }
                }
                if(a==4){
                    printPreOrder(root);
                    System.out.println();
                }
            }
        }
    }

    static boolean search(Node root, int key){
        if (root == null) {
            return false;
        }
        if(root.val==key){
            return true;
        }
        if(root.val<key)
            return search(root.right, key);

        return search(root.left,key);
    }

    static Node deleteNode(Node root, int key){
        if(root==null)
            return null;
        if(key <root.val ) {
            root.left = deleteNode(root.left, key);
        } else if(key>root.val) {
            root.right = deleteNode(root.right, key);
        }
        else{
            if(root.left==null && root.right==null){
                return null;
            }
            else if(root.left==null) {
                return root.right;
            }
            else if(root.right==null) {
                return root.left;
            }
            else{
                root.val = findMin(root.right);
                root.right = deleteNode(root.right, root.val);
            }
        }
        return root;
    }

    static int findMin(Node root) {
        int min = root.val;
        while (root.left != null) {
            min = root.left.val;
            root = root.left;
        }
        return min;
    }

    static void printPreOrder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.val+" ");
        printPreOrder(root.left);
        printPreOrder(root.right);
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
