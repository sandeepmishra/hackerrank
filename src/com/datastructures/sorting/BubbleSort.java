package com.datastructures.sorting;

public class BubbleSort implements SortArray{
    public static void main(String[] args) {
        int []array=new int[]{8, 5, 1, 4, 2};
        new BubbleSort().sortarray(array);
        for (int val:array) {
            System.out.print(val+" ");
        }
    }

    @Override
    public int [] sortarray(int [] array){
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array.length-i-1;j++){
                if(array[j]>array[j+1]){
                    int temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }
        return array;
    }

}
