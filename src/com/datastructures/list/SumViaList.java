package com.datastructures.list;

import java.util.List;

public class SumViaList {

    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(0);
        //listNode1.next = new ListNode(4);
        //listNode1.next.next = new ListNode(3);

        ListNode listNode2 = new ListNode(0);
        //listNode2.next = new ListNode(6);
        //listNode2.next.next = new ListNode(4);

        ListNode result = addTwoNumbers(listNode1, listNode2);
        System.out.println(result.val);


    }


    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        if(l1==null){
            return l2;
        }
        if(l2==null){
            return l1;
        }
        ListNode head=null;
        ListNode result=null;


        int tenDigit = 0;

        while(l1 != null || l2!= null){
            int sum = 0;
            System.out.println(tenDigit);
            sum = sum+tenDigit;
            if(l1.val!= 0){
                sum=sum+l1.val;
                l1 = l1.next;
            }
            if(l2.val != 0){
                sum=sum+l2.val;
                l2 = l2.next;
            }
            tenDigit=sum/10;
            sum=sum%10;

            if(head == null){
                head = new ListNode(sum);
                result = head;
            }else{
                head.next = new ListNode(sum);
                head = head.next;
            }
        }
        if(tenDigit>0){
            head.next=new ListNode(tenDigit);
        }
        return result;
    }


    public static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
}
