package com.array;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "race car";
		s = s.replaceAll("[^a-zA-Z0-9]", "");
		
		int left=0;
		int right=s.length()-1;
		Boolean isPalindrome = Boolean.TRUE;
		while(left<right) {
			if(s.charAt(left) == s.charAt(right)) {
				left++;
				right--;
			} else {
				isPalindrome = Boolean.FALSE;
				break;
			}
		}
		
		System.out.println("String is Plaindrome :" + isPalindrome);
		

		
	}

}
