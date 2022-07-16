package com.datastructures.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ArrayDoll {

	public static void main(String[] args) throws Exception {
		
		
		throw new Exception();
	}
	
	public static int soultion(int arr[]) {
		List<Integer> li = new ArrayList<>();
		for(int i=0;i<arr.length;i++) {
			if(li.size()==0) {
				li.add(arr[i]);
			}else {
				for(int j=0;j<li.size();j++) {
					boolean added = false;
					if(arr[i]>li.get(j)) {
						li.set(j, arr[i]);
					}else {
						li.add(arr[i]);
					}
					added = true;
					if(added)
						break;
				}
			}
			
		}
		return li.size();
	}
}
