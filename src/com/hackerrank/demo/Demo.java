package com.hackerrank.demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Demo {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String inputStr = br.readLine();
		BigDecimal input =new BigDecimal(inputStr.split(" ")[0]);
		int k = Integer.parseInt(inputStr.split(" ")[1]);
		BigDecimal reverse =BigDecimal.ZERO;
		StringBuffer sb = new StringBuffer(String.valueOf(input));
		sb = sb.reverse();
		BigDecimal temp = new BigDecimal(sb.toString());
		while(input.compareTo(BigDecimal.ZERO)>=0 && !temp.equals(reverse)){
			reverse = reverse.multiply(BigDecimal.TEN).add(input.remainder(BigDecimal.TEN));
			input = input.divide(BigDecimal.TEN).setScale(0, RoundingMode.FLOOR);
		}
		sb = new StringBuffer(String.valueOf(reverse));
		sb = sb.reverse();
		temp = new BigDecimal(sb.toString());
		while(reverse.compareTo(BigDecimal.ZERO)>=0 && temp.equals(input)){
			if(reverse.remainder(BigDecimal.TEN).compareTo(new BigDecimal("9"))<0 && k>0){
				input = input.multiply(BigDecimal.TEN).add(new BigDecimal("9"));
				k--;
			}else{
				input = input.multiply(BigDecimal.TEN).add(reverse.remainder(BigDecimal.TEN));
			}
			reverse = reverse.divide(BigDecimal.TEN).setScale(0, RoundingMode.FLOOR);
		}
		System.out.println(input);
	}
}
