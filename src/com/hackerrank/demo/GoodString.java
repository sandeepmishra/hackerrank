package com.hackerrank.demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GoodString {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String inputStr = br.readLine().trim();
		int N = Integer.parseInt(inputStr.split(" ")[0]);
		int M = Integer.parseInt(inputStr.split(" ")[1]);
		String monkStr = br.readLine().trim();
		String notMonkStr = br.readLine().trim();
		int monkFxArr[] = new int[N];
		int notMonkFxArr[] = new int[M];
		int monkGxArr[] = new int[N];
		int notMonkGxArr[] = new int[M];
		int monkScore = 0;
		int notMonkScore = 0;
		
		for (int i = 0; i < N; i++) {
			for(int j=0;j<M;j++){
				if(Integer.parseInt(monkStr.split(" ")[i])>Integer.parseInt(notMonkStr.split(" ")[j])){
					monkFxArr[i]=monkFxArr[i]+1;
				}else{
					monkGxArr[i]=monkGxArr[i]+1;
				}
				if(Integer.parseInt(notMonkStr.split(" ")[i])>Integer.parseInt(monkStr.split(" ")[j])){
					notMonkFxArr[i]=notMonkFxArr[i]+1;
				}else{
					notMonkGxArr[i]=notMonkGxArr[i]+1;
				}
			}
			monkScore = monkScore + monkFxArr[i]*monkGxArr[i];
			notMonkScore = notMonkScore + notMonkFxArr[i]*notMonkGxArr[i];
		}
		
		if(monkScore>notMonkScore){
			System.out.println("Monk "+ (monkScore-notMonkScore));
		}else if(monkScore<notMonkScore){
			System.out.println("!Monk "+(notMonkScore-monkScore));
		}else if(monkScore==notMonkScore){
			System.out.println("Tie");
		}

	}
}
