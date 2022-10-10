package com.smartinterview.hackerrank.week10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderofTree {
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
//            levelOrderTraversal(root);
//            System.out.println();
            updateDepth(root, 0);
            //printPreOrder(root);
            levelOrderTraversal(root);
            System.out.println();

        }
    }

    static Node deleteNode(Node root, int key){
        if(root==null)
            return null;
        if(key <root.val )
            root.left = deleteNode(root.left, key);
        else if(key>root.val)
            root.right = deleteNode(root.right, key);
        else
            if(root.left==null)
                return root.right;
            else if(root.right==null)
                return root.left;

            root.val = findMin(root.right);
            root.right = deleteNode(root.right, root.val);

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
        System.out.print(root.depth+" ");
        printPreOrder(root.left);
        printPreOrder(root.right);
    }
    static void updateDepth(Node node, int depth){
        if(node!=null){
            node.depth=depth;
            updateDepth(node.left, depth+1);
            updateDepth(node.right, depth+1);
        }
    }

    static void levelOrderTraversal(Node root){
        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            Node n = q.poll();
            System.out.print(n.depth+" ");
            if(n!=null && n.left != null){
                q.offer(n.left);
            }
            if(n!=null && n.right != null){
                q.offer(n.right);
            }
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
    static class Node {
        int val;
        int depth;
        Node left;
        Node right;
        Node(int val) { this.val = val; }
    }
}
