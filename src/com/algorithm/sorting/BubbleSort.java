package com.algorithm.sorting;

public class BubbleSort {

	public static void main(String[] args) {
		int arr[] = {5, 1, 6, 2, 4, 3};
		boolean isDone = true;
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					isDone = false;
				}
			}
			if(isDone) {
				break;
			}
		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
