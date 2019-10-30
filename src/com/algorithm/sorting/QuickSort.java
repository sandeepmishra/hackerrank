package com.algorithm.sorting;

/**
 * 
 * @author sandeep
 * Quick sort works on divide and conquer rule. This algorithm divides array in three
 * main parts
 * 1. elements less than pivot element
 * 2. elements greater pivot element
 * 3. pivot element
 *
 */
public class QuickSort {

	public static void main(String[] args) {
		int arr[] = {10, 80, 30, 90, 40, 50, 70};
		new QuickSort().quicksort(arr, 10, 70);
	}
	
	public void quicksort(int arr[], int l, int r) {
		if(l<r) {
			int partition = partition(arr, l, r);
			quicksort(arr, l, partition);
			quicksort(arr, partition+1, r);
		}
	}
	
	public int partition(int arr[], int l, int r) {
		int pivot = arr[l];
		
		for(int i= l;i<=r;i++) {
			
		}
		return 0;
	}
}
