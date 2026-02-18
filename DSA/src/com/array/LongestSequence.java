package com.array;

import java.util.HashMap;
import java.util.Map;

public class LongestSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {5,8,1,6,3,2,7};
		
		Map<Integer, Boolean> map = new HashMap<>();
				
		for(int n : arr) {
			map.put(n, Boolean.FALSE);
		}
		
		int longestLength = 0;
		for (int n : arr) {
			int currentLength = 1;
			
			int next_num = n+1;
			// move forward and calculate length
			while(map.get(next_num)!=null && !map.get(next_num)) {
				map.put(next_num, Boolean.FALSE);
				next_num++;
				currentLength++;
			}
			
			int prev_num = n-1;		
			//move backward and calculate lenght
			while(map.get(prev_num)!=null && !map.get(prev_num)) {
				map.put(prev_num, Boolean.TRUE);
			    prev_num--;
			    currentLength++;
			}
			
			if(currentLength> longestLength) {
				longestLength = currentLength;
			}
		}
		System.out.println("Longest sequence is : " + longestLength);		

	}

}
