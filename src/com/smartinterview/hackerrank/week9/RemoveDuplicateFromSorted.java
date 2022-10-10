package com.smartinterview.hackerrank.week9;

public class RemoveDuplicateFromSorted {
    public static void main(String[] args) {
        ListNode li = new ListNode(3);
        li.next = new ListNode(5);
        //li.next.next=new ListNode(3);
        //li.next.next.next=new ListNode(4);
        //li.next.next.next.next=new ListNode(5);

        //li = rotateRight(li, 2);
        //li=reverseList(li);
        //li =swapPairs(li);
        li = reverseBetween(li, 1,2);
        while(li!=null){
            System.out.print(li.val+" ");
            li = li.next;
        }
    }

    public static ListNode reverseBetween(ListNode head, int left, int right) {
        if(head == null || head.next == null || left == right){
            return head;
        }

        ListNode temp=head;
        ListNode leftHead = temp, lefttail = null, centerhead=null, centertail=null, rightHead=null;
        int leftcount=0, rightcount=0;

        while( leftcount++<left-1){
            lefttail=temp;
            temp = temp.next;
            rightcount++;
        }
        centerhead = temp;

        while(rightcount++<right-1){
            temp=temp.next;
        }
        rightHead = temp.next;
        temp.next=null;

        centerhead = reverseList(centerhead);
        centertail= centerhead;
        while(centertail.next!=null){
            centertail = centertail.next;
        }
        if(lefttail!=null){
            lefttail.next=centerhead;
        }else{
            leftHead=centerhead;
        }

        centertail.next=rightHead;

        return leftHead;


    }

    public static  ListNode swapPairs(ListNode head) {

        if(head==null || head.next==null){
            return head;
        }
        ListNode cur = head, prev=null, result = null, tail=null;
        prev = cur;
        cur = cur.next;
        while(cur!=null){
            prev.next = cur.next;
            cur.next=prev;
            if(tail!=null){
                tail.next = cur;
            }
            tail=prev;
            if(result==null){
                result = cur;
            }
            prev = prev.next;
            if(prev!=null){
                cur=prev.next;
            }else{
                cur = null;
            }
        }
        return result;
    }

    public static ListNode reverseList(ListNode head){
        ListNode cur = head, prev=null;
        head=null;
        while(cur!=null){
            prev = cur;
            cur=cur.next;
            prev.next=head;
            head=prev;

        }
        return head;
    }
    public static  ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null){
            return head;
        }
        int size = 0;
        ListNode temp=head;
        while(temp!=null){
            temp=temp.next;
            size++;
        }
        int n = size-k%size-1;

        ListNode cur = head;
        temp=head;
        while(temp.next!=null && n>0){
            temp = temp.next;
            n--;
        }
        ListNode tail = temp.next;
        head=tail;
        temp.next = null;
        while(tail.next!=null){
            tail = tail.next;
        }
        tail.next=cur;
        return head;
    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null || (head.next== null && n==1)){
            return null;
        }
        ListNode temp = head;
        ListNode node = head;
        int count=n;
        while(count>0 && temp!= null){
            temp = temp.next;
            count--;
        }

        ListNode prev=null;
        while(temp!=null){
            temp=temp.next;
            prev=node;
            node=node.next;
        }
        if(prev.next!=null){
            prev.next = prev.next.next;
        }
        return head;
    }

    public static ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return null;
        }
        if(head.next==null){
            return head;
        }

        ListNode current = head.next, prev=head;

        // 1->1->null
        while(current!=null){
            if(prev.val==current.val){
                prev.next = current.next;
            }else{
                prev = current;
            }
            current = current.next;
        }
        return head;
    }

    static class ListNode {
      public int val;
      public ListNode next;
      ListNode(int x) { val = x; next = null; }
  }
}
