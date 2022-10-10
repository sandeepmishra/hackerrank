package com.smartinterview.hackerrank.week10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class DepthOfTreeNode {
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

            updateDepth(root, 0);
            printPreOrder(root);
            //levelOrderTraversal(root);
            System.out.println();
        }
    }

    static void printPreOrder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.depth+" ");
        printPreOrder(root.left);
        printPreOrder(root.right);
    }

    static void levelOrderTraversal(Node root, Map<Integer, Integer> map){
        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        map.put(root.val, root.depth);
        while(!q.isEmpty()){
            Node n = q.poll();

            //System.out.print(n.depth+" ");
            if(n.left != null){
                q.offer(n.left);
                map.put(n.left.val, n.left.depth);
            }
            if(n.right != null){
                map.put(n.right.val, n.right.depth);
            }

        }
    }

    static void updateDepth(Node node, int depth){
        if(node!=null){
            node.depth=depth;
            updateDepth(node.left, depth+1);
            updateDepth(node.right, depth+1);
        }
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
        int depth;
        Node left;
        Node right;
        Node(int val) { this.val = val; }
    }
}
