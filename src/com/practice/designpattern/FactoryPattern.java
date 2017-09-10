package com.practice.designpattern;

import java.util.ArrayList;
import java.util.List;

public class FactoryPattern {

	public static void main(String[] args) {
		String [] words = {"a", "b", "ba", "bca", "bda", "bdca"};
		int count = longestChain(words);
		System.out.println(count);
	}
	
	static int longestChain(String[] words) {
		String s;
		boolean isPresent = false;
		List<String> stringList = new ArrayList<String>();
		int wordcount =0;
		for(int i=0;i<words.length;i++){
			stringList.add(words[i]);
			s = words[i];
			isPresent = isWordPresent(s, stringList);
			if(isPresent){
				wordcount+=1;
			}
		}

		return wordcount;
    }
	
	static boolean isWordPresent(String word, List<String> stringList){
		StringBuilder temp = new StringBuilder();
		stringList.remove(stringList.size()-1);
		for(int i= stringList.size()-1;i>=0;i--){
			if(null != stringList.get(i) && !"".equals(stringList.get(i).trim())){
				temp = temp.append(stringList.get(i));
			}
		}
		if(word.contains(temp.toString().trim())){
			stringList.add(word);
			return true;
		}else{
			for(int i=0;i<temp.length();i++){
				if(!word.contains(String.valueOf(temp.charAt(i)))){
					word.replace(String.valueOf(temp.charAt(i)), "").trim();
				}
			}
			if(word.contains(temp)){
				stringList.add(word);
				return true;
			}
			
		}
		return false;
	}
}
