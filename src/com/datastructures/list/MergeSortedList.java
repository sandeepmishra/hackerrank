package com.datastructures.list;


public class MergeSortedList<E> {
    Node<E> head = null;
    private int size;

    public static void main(String[] args) {
        new MergeSortedList<Integer>().mergeLists();
    }


     Node mergeLists() {
         Node<Integer> head1 = new Node<>(4);
         Node<Integer> n2 = new Node<>(5);
         Node<Integer> n3 = new Node<>(6);
         head1.next = n2;
         n2.next=n3;

         Node<Integer> head2 = new Node<>(1);
         Node<Integer> hn2 = new Node<>(2);
         head2.next=hn2;
         Node<Integer> hn3 = new Node<>(10);
         hn2.next=hn3;
        Node<Integer> result=null;
        Node<Integer> temp=null;
        while(head1!=null || head2!=null){
            if(head1==null && head2!=null && result == null){
                return head2;
            }else if(head1!=null && head2==null && result == null){
                return head1;
            }else{
                if(head1==null && head2!=null){
                    temp.next = head2;
                    head2 = head2.next;
                }
                if(head2==null && head1!=null){
                    temp.next = head1;
                    head1 = head1.next;
                }
                if(head1!= null && head2 != null && head1.data<=head2.data){
                    if(temp==null){
                        temp = head1;
                        result = temp;
                    }else{
                        temp.next=head1;
                        temp=temp.next;
                    }
                    head1= head1.next;
                }
                if(head1!= null && head2 != null && head2.data<=head1.data){
                    if(temp==null){
                        temp = head2;
                        result = temp;
                    }else{
                        temp.next = head2;
                        temp = temp.next;
                    }
                    head2 = head2.next;
                }
            }
        }
         System.out.println(result.toString());
        return result;
    }



    public void add(E e){
        Node<E> node = new Node<E>(e);
        if(head==null){
            head = node;
        }else{
            Node<E> current = head;
            while(null != current.next){
                current = current.next;
            }
            current.next=node;
        }
        size++;
    }

    class Node<E>{
        Node<E> next;
        E data;

        public Node(E data) {
            this.data = data;
            this.next=null;
        }


        @Override
        public String toString() {
            return "data=" + data+" node"+next;
        }
    }
}
