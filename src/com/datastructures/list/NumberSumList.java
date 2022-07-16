package com.datastructures.list;

/**
 * Input: (3 -> 1 -> 5) + (5 -> 9 -> 2)
 * Output: 8 -> 0 -> 8
 */
public class NumberSumList {

    Node root=null;

    public static void main(String[] args) {

        NumberSumList l1 = new NumberSumList();
        l1.add(3, l1.root);
        l1.add(1, l1.root);
        l1.add(5, l1.root);

        NumberSumList l2 = new NumberSumList();
        l2.add(5, l2.root);
        l2.add(9, l2.root);
        l2.add(2, l2.root);

        System.out.println(l1.root);
        System.out.println(l2.root);
        System.out.println(l2.listSum(l1.root, l2.root));
    }


    Node listSum(Node l1, Node l2){
        int carryOver =0;
        Node sum = null;
        Node sumNode = null;
        while(l1 != null && l2 != null){
            if(sum==null){
                sum = new Node(l1.data+l2.data);
                sumNode = sum;
            }else{
                var sumval = l1.data +l2.data+carryOver;
                carryOver = sumval /10;
                sumval = sumval%10;
                sumNode.next = new Node(sumval);
                sumNode = sumNode.next;
            }
            l1 = l1.next;
            l2 = l2.next;
        }
        return sum;
    }

    void add(int data,  Node root){
        if(root == null){
            this.root = new Node(data);
        }else{
            Node node = root;
            while(node.next != null){
                node = node.next;
            }
            node.next = new Node(data);
        }
    }

    static class Node{
        int data;
        Node next;

        Node(int data){
            this.next = null;
            this.data = data;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "data=" + data +
                    ", next=" + next +
                    '}';
        }
    }
}
