package slidingwindow;

import java.util.HashMap;
import java.util.Map;

public class MinimumWindowSubstring {

	public static void main(String[] args) {
		
		String s = "ADOBECODEBANCFABC";
		String t = "ABC";
		
		Map<Character, Integer> wmap = new HashMap<>();
		Map<Character, Integer> tmap = new HashMap<>();
		
		int have = 0;
		int need = t.length();
		int left=0;
		int right=0;
		int min_length = s.length();
		
		for(char c: t.toCharArray()) {
			tmap.put(c,tmap.getOrDefault(c, 0)+1);
		}
		
		while(right<s.length()) {
			
			char c = s.charAt(right);
			wmap.put(c,wmap.getOrDefault(c, 0)+1);
			
			if(tmap.containsKey(c) && tmap.get(c) == wmap.get(c)) {
				have++;
			}
			
			while(left<= right && have == need) {
				char startChar = s.charAt(left);
				int current_length = right - left  +1;
				if(current_length < min_length) {
					min_length= current_length;
					
					System.out.println("Possible strings are : " + s.substring(left, right+1 ));
				}
				
				
			    //shrink the window
				wmap.put(startChar,wmap.get(startChar)-1);
				if(tmap.containsKey(startChar) && wmap.get(startChar) < tmap.get(startChar)) {
					have--;
				}	

				left++;
				
			}		
			
			right++;
			
		}
		
		System.out.println("Minimum window substring is length is : " + min_length);
		

	}

}
