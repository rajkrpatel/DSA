package com.array;

public class IsSubsequence {

	public static void main(String[] args) {
		String s = "abc";
		String t = "agdcbsdh";
		
		int pointer1=0, pointer2 = 0;
		
		while(s.length()>pointer1 && t.length()> pointer2) {
			
			if(s.charAt(pointer1) == t.charAt(pointer2)) {
				pointer1++;
				pointer2++;
			} else {
				pointer2++;
			}
		}
		
		if(pointer1 == s.length()) {
			System.out.println(s + " is subsequence of " + t);
		} else {
			System.out.println(s + " is not subsequence of " + t);
		}

	}

}
