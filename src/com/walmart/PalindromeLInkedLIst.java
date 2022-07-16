package com.walmart;


//Determine whether a linked list is a palindrome?
//For example, 1 -> 4 -> 3 -> 4 -> 1 returns True while 1 -> 4 returns False

public class PalindromeLInkedLIst {

    public static void main(String[] args) {
        Node<Integer> node1 = new Node<>(1);
        //Node<Integer> node2 = new Node<>(4);
        Node<Integer> node3 = new Node<>(4);
        Node<Integer> node4 = new Node<>(4);
        Node<Integer> node5 = new Node<>(1);
        //node1.next=node2;
        node1.next=node3;
        node3.next=node4;
        node4.next=node5;
        Node<Integer> fastNode = node1;
        Node<Integer> result = null;
        boolean isPalindrome = true;
        while(node1 != null && fastNode!=null){
            if(result==null){
                result = new Node<>(node1.data);
            }else{
                Node<Integer> node = new Node<>(node1.data);
                node.next=result;
                result=node;
            }

            fastNode = fastNode.next;
            if(null != fastNode){
                fastNode = fastNode.next;
                node1 = node1.next;
            }
        }

        System.out.println(result);
        System.out.println(node1);
        while(node1!= null && result!= null){
            if(node1.data != result.data){
                isPalindrome = false;
            }
            node1= node1.next;
            result = result.next;
        }

        System.out.println(isPalindrome);

    }
    static class Node<E>{
        Node<E> next;
        E data;
        Node(E data){
            this.next=null;
            this.data=data;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "next=" + next +
                    ", data=" + data +
                    '}';
        }
    }
}
