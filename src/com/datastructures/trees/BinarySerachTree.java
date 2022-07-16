package com.datastructures.trees;

public class BinarySerachTree<T extends Comparable<T>> {


    private TreeNode<T> root;


    public static void main(String[] args) {
        BinarySerachTree<Integer> tree = new BinarySerachTree<>();
        tree.insert(25);
        tree.insert(20);
        tree.insert(15);
        tree.insert(27);
        tree.insert(30);
        tree.insert(29);
        tree.insert(26);
        tree.insert(22);
        tree.insert(32);


        tree.traverseInOrder();


    }


    public void traverseInOrder(){
        if(root != null){
            root.traverseInOrder();
        }
    }

    public void insert(T data){
        if(root==null){
            root = new TreeNode<>(data);
        }else{
            root.insert(data);
        }
    }

    class TreeNode<T extends Comparable<T>> {
        TreeNode<T> left, right;
        T data;


        TreeNode(T data) {
            this.data = data;
        }

        public void insert(T data) {
            if (this.data.compareTo(data) == 0) {
                return;
            }
            // to insert in left child
            if (this.data.compareTo(data) > 0) {
                if (left == null) {
                    left = new TreeNode<>(data);
                } else {
                    left.insert(data);
                }
            }

            // insert to right child
            if (this.data.compareTo(data) < 0) {
                if (right == null) {
                    right = new TreeNode<>(data);
                } else {
                    right.insert(data);
                }
            }
        }


        public void traverseInOrder(){
            if(left != null){
                left.traverseInOrder();
            }

            System.out.println(String.format("Data = %s", data));

            if(right != null){
                right.traverseInOrder();
            }

        }
    }
}
