package com.datastructures.trees;

public class PreOrderTraversal {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("");
        sb= new StringBuilder(sb.toString().trim());
        System.out.println(sb.toString());

        System.out.println(System.getProperty("java.version"));
    }


    private class BinaryTreeNode<T>{
        private BinaryTreeNode<T> left, right;
        T data;
        BinaryTreeNode(T data){
            this.data = data;
            left = right = null;
        }


    }
}
