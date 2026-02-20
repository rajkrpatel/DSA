package slidingwindow;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithOutRepeatation {

	public static void main(String[] args) {
		String s = "pwwkew";
		
		int left=0;
		int right=0;
		int max=0;
		Set<Character> set = new HashSet<>();
		
		while(right<s.length()) {
			int current_max = 0;
			if(!set.contains(s.charAt(right))) {
				set.add(s.charAt(right));
				current_max = right - left + 1;
				max = Math.max(current_max, max);
				right++;
			} else {
				set.remove(s.charAt(left));
				left++;
			}
		}
		
		System.out.println("MAX length : " + max);

	}

}
