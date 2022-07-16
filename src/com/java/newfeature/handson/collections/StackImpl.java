package com.java.newfeature.handson.collections;

import java.util.NoSuchElementException;

public class StackImpl {
    public static void main(String[] args) {
        StackImp<String> stringStackImp = new StackImp<>();

        stringStackImp.push("first element");
        stringStackImp.push("second element");
        stringStackImp.push("third element");
        System.out.println(stringStackImp.pop());
        System.out.println(stringStackImp.pop());
        System.out.println(stringStackImp.pop());
        System.out.println(stringStackImp.pop()); // should throw exception
    }
}


class StackImp<E>{
    Node<E> root;

    public void push(E e){
        if(root == null){
            root = new Node(e);
        }else{
            Node<E> node = new Node<>(e);
            Node temp = root;
            node.next = temp;
            root = node;
        }
    }

    public E pop(){
        E returnVal = null;
        if(root == null){
            throw new NoSuchElementException("Element not found.");
        }else{
            returnVal = root.data;
            root = root.next;
        }
        return returnVal;
    }

    class Node<E>{
        private Node<E> next;
        private E data;

        Node(E data){
            this.next = null;
            this.data = data;
        }
    }
}