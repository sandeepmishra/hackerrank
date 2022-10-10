package com.smartinterview.hackerrank.week9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class ImplementLRUCache {
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        int test = Integer.parseInt(br.readLine());
        while(test-->0){
            String [] nk = br.readLine().split(" ");
            int n = Integer.parseInt(nk[0]);
            int k = Integer.parseInt(nk[1]);
            String [] input =  br.readLine().split(" ");
            Map<Integer, ListNode> map = new HashMap<>(k);
            ListNode h = new ListNode(-1), t = h;
            // 3 8 2 8 1
            for(int i=0;i<n;i++){
                int x = Integer.parseInt(input[i]);
                // 2. present
                if(map.containsKey(x)){
                    ListNode nd = map.get(x);
                    if(t.data == nd.data)
                        continue;
                    nd.next.prev = nd.prev;
                    nd.prev.next = nd.next;
                    t.next = nd;
                    nd.prev = t;
                    nd.next =  null;
                    t = nd;
                }else{
                    // 1. Not present and not full
                    if(map.size()!=k){
                        t.next = new ListNode(x);
                        t.next.prev=t;
                        t = t.next;
                    }
                    // 3. not present but full
                    else if(map.size()==k){
                        //ListNode idxNode = map.get(h.next.data);
                        map.remove(h.next.data);

                        if(k==1){
                            h.next = h.next.prev;
                        }else{
                            h.next = h.next.next;
                        }
                        h.next.prev = h;
                        t.next = new ListNode(x);
                        t.next.prev = t;
                        t = t.next;

                    }
                    map.put(x, t);
                }
            }

            if(h!=null && h.next!=null){
                h = h.next;
            }
            while(h!=null){
                System.out.print(h.data+" ");
                h=h.next;
            }
            System.out.println();
        }
    }

    static class ListNode{
        int data;
        ListNode next;
        ListNode prev;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
}
