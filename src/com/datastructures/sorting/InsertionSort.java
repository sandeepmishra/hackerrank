package com.datastructures.sorting;

public class InsertionSort implements SortArray{

    public static void main(String[] args) {
        int []array=new int[]{5, 2, 4, 6, 1, 3};
        new InsertionSort().sortarray(array);
        for (int val:array) {
            System.out.print(val+" ");
        }
    }

    @Override
    public int[] sortarray(int[] array) {
        for(int i=0;i<array.length-1;i++){
            for(int j=i+1;j>0;j--){
                if(array[j]<array[j-1]){
                    int temp=array[j];
                    array[j]=array[j-1];
                    array[j-1]=temp;
                }
            }
        }

        return array;
    }
}
