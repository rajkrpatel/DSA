package com.array;

import java.util.HashMap;

public class AnagramGroup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
		

	}
	
	static String findFrequency(String s) {
		HashMap<Character, Integer> charCount= new HashMap<Character, Integer>();
		for(char c: s.toCharArray()) {
			charCount.put(c, charCount.getOrDefault(c, 0) + 1);
		}
		
		charCount.forEach();
		
		return s;
	}

}
