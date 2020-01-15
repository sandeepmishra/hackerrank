package com.datastructures.sorting;

public class SelectionSort implements SortArray{

    public static void main(String[] args) {
        int []array=new int[]{8, 5, 1, 4, 2};
        new SelectionSort().sortarray(array);
        for (int val:array) {
            System.out.print(val+" ");
        }
    }

    @Override
    public int[] sortarray(int[] array) {

        for(int i=0;i<array.length;i++){
            int min_index=i;
            for(int j=i+1;j<array.length;j++){
                if(array[j]<=array[min_index]){
                    min_index=j;
                }
            }

            String b="abc".repeat(3);
            int temp=array[i];
            array[i]=array[min_index];
            array[min_index]=temp;
        }
        return array;
    }
}
