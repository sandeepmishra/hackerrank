package com.smartinterview.interviewbit.week9;


import com.smartinterview.hackerrank.week9.RemoveDuplicateFromSorted;

public class MergeTwoSortedList {
    public static void main(String[] args) {
        MergeTwoSortedList mergeTwoSortedList =new MergeTwoSortedList();
        MergeTwoSortedList.ListNode li = mergeTwoSortedList.new ListNode(1);
        li.next = mergeTwoSortedList.new ListNode(2);
        //li.next.next=mergeTwoSortedList.new ListNode(3);
        li.next.next=mergeTwoSortedList.new ListNode(4);
        li.next.next.next=mergeTwoSortedList.new ListNode(5);

        MergeTwoSortedList.ListNode li1 = mergeTwoSortedList.new ListNode(1);
        li1.next = mergeTwoSortedList.new ListNode(3);
        li1.next.next = mergeTwoSortedList.new ListNode(4);
        li1.next.next.next = mergeTwoSortedList.new ListNode(5);

        li = mergeTwoSortedList.mergeTwoLists(li, li1);
        //li=reverseList(li);
        while(li!=null){
            System.out.print(li.val+" ");
            li = li.next;
        }
    }

    public ListNode mergeTwoLists(ListNode head1, ListNode head2) {
        ListNode result=null, head=null;
        if(head1==null && head2!=null){
            return head2;
        }else if(head1!=null && head2==null){
            return head1;
        }
        while(head1!=null || head2!=null){
            if(head1==null && head2!=null){
                result.next = head2;
                head2 = null;
            }
            else if(head2==null && head1!=null){
                result.next = head1;
                head1 = null;
            }
            if(head1!= null && head2 != null && head1.val<=head2.val){
                if(head==null){
                    result = head1;
                    head=result;
                }else{
                    result.next=head1;
                    result=result.next;
                }
                head1= head1.next;

            }
            else if(head1!= null && head2 != null && head2.val<head1.val){
                if(head==null){
                    result = head2;
                    head=result;
                }else{
                    result.next=head2;
                    result=result.next;
                }
                head2 = head2.next;

            }

        }
        return head;
    }

    class ListNode {
        public int val;
        public ListNode next;
        ListNode(int x) { val = x; next = null; }
    }
}
