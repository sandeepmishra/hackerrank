package com.datastructures.trees;

public class BanryTreeImpl<E extends Comparable<E>> {

    private BinaryTreeNode root;
    private int size;
    public BanryTreeImpl() {
        this.root = null ;
        this.size=0;
    }

    public int size(){
        return size;
    }

    public void add(E e){
        BinaryTreeNode node = new BinaryTreeNode(e);
        if(root==null){
            this.root = node;
            size++;
        }else{
            insert(this.root, node );
        }
    }

    private void insert(BinaryTreeNode parent, BinaryTreeNode child){
        // if child is greater than parent it goes to right
        if(child.data.compareTo(parent.data)>0){
            if(parent.right==null){
                parent.right=child;
                size++;
            }else{
                insert(parent.right, child);
            }
            parent.right=child;
        }
        // if child is less than parent it goes to left
        else if(child.data.compareTo(parent.data)<0){
            if(parent.left==null){
                parent.left=child;
                size++;
            }else{
                insert(parent.left, child);
            }
        }

        // if parent and child both same we dont store it again
        // data in binary tree is assumed to be unique and the value already exists in tree
    }


    public boolean contains(E data){
        if(null != getNode(data)){
            return true;
        }
        return false;
    }

    public BinaryTreeNode getNode(E data){
        BinaryTreeNode currentNode=this.root;

        while(null != currentNode){
            int var = currentNode.data.compareTo(data);
            if(var==0){
                return currentNode;
            }
            else if(currentNode.data.compareTo(data)>0){
                currentNode=currentNode.left;
            }else if(currentNode.data.compareTo(data)<0){
                currentNode=currentNode.right;
            }
        }
        return null;
    }
    private class BinaryTreeNode<E extends Comparable<E>>{
        BinaryTreeNode left, right;
        E data;

        public BinaryTreeNode(E data) {
            this.left = null;
            this.right = null;
            this.data = data;
        }
    }
}
