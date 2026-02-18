package com.array;

import java.util.HashMap;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "evil";
		String s2 = "livf";
        System.out.println(anagram(s1,s2));
		
	}
	
	public static Boolean anagram(String s, String t) {
		if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Integer> count = new HashMap<>();

        for (char c : s.toCharArray()) {
            count.put(c, count.getOrDefault(c, 0) + 1);
        }

        for (char c : t.toCharArray()) {
            if (!count.containsKey(c)) {
                return false;
            }
            count.put(c, count.get(c) - 1);
            if (count.get(c) < 0) {
                return false;
            }
        }

        return true;
	}

}
