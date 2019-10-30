package com.algorithm.sorting;

import java.util.Collections;
import java.util.List;

public class Sample {

	public static void main(String[] args) {

		//System.out.println(minNum(4, 5, 1));
	}

	static int maxProfit(int costPerCut, int salePrice, List<Integer> lengths) {
		Collections.sort(lengths);
    	int maxLength = lengths.get(lengths.size()-1);
    	int maxProfit = 0;
    	
    	for (int i = 1; i < maxLength; i++) {
    		
    		//int sumOfLengths = 0;
        	int sumOfCutCounts = 0;
    		int totalUniformRods =0;
    		int salelength = i;
    		
    		for (int length : lengths) {
    			// calculate number of cuts
        		if (length % i == 0 && length > i) {
        			sumOfCutCounts += (length/i - 1);
        		} else if(length > i){
        			sumOfCutCounts += (length/i);
        		}
        		// calculate totaluniform rods
        		if(length>=salelength) {
        			totalUniformRods = totalUniformRods + (length/salelength);
        		}
        	}
    		
    		int profit = (totalUniformRods*salelength*salePrice)-(sumOfCutCounts*costPerCut);
    		
    		if (profit > maxProfit) {
    			maxProfit  = profit;
    		}
    	}
    	
    	return maxProfit;
    }

}
