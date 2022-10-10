package com.smartinterview.hackerrank.week12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class ImplementMinHeap {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        MinHeap minHeap = new MinHeap(t);
        while(t-->0){
            String in[] = br.readLine().split(" ");

            if(in[0].equals("insert")){
                minHeap.insert(Integer.parseInt(in[1]));
            }

            if(in[0].equals("getMin")){
                if(minHeap.size()>0){
                    System.out.println(minHeap.getMin());
                }else {
                    System.out.println("Empty");
                }
            }

            if(in[0].equals("delMin")){
                if(minHeap.size()>0){
                    minHeap.deleteMin();
                }
            }
        }
    }

    static class MinHeap{
        Integer arr[] ;
        int size;
        int curIdx;
        MinHeap(int n){
            arr = new Integer [n];
            size = 0;
            curIdx=0;
        }

        int size(){
            return size;
        }

        void insert(int x){
            arr[curIdx++] = x;
            size++;
            int idx = size()-1;
            while(idx !=0 && arr[idx]<arr[(idx-1)/2]){
                int temp = arr[idx];
                arr[idx] = arr[(idx-1)/2];
                arr[(idx-1)/2]=  temp;
                idx = (idx-1)/2;
            }
        }

        void deleteMin(){
            if(size()-1==0){
                arr[0]=null;
                curIdx--;
                size--;
            }else{
                arr[0] = arr[size()-1];
                arr[size()-1] = null;
                curIdx--;
                size--;

                int idx=0;
                while(idx <= size()-1){
                    if( arr[(idx)] > arr[(2*idx+1)]){
                        int temp = arr[(idx)];
                        arr[idx]=  arr[(2*idx+1)];
                        arr[(2*idx+1)] = temp;
                        idx = 2*idx+1;
                    }
                    else if( arr[(idx)] > arr[(2*idx+2)]){
                        int temp = arr[(idx)];
                        arr[idx] = arr[2*idx+2];
                        arr[2*idx+2] = temp;
                        idx = 2*idx+2;
                    }

                }

            }
        }

        int getMin(){
            return arr[0];
        }
    }
}
