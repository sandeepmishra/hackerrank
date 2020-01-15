package com.practice.thread;

public class ThreadEvenOdd {

	public static void main(String[] args) {

		int[][] arr = new int[2][];

		for(int i=0;i<2;i++){
			arr[i] = new int[2];
			for(int j=0;j<2;j++){
				arr[i][j] = i+j;
				System.out.println(arr[i][j]);
			}
		}


	}
}
