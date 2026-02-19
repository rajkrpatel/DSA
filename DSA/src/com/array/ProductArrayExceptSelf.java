package com.array;

import java.util.Arrays;

public class ProductArrayExceptSelf {
	public static void main(String[] ars) {
		int[] nums = {1, 2, 3, 4};
		// output should be {24, 12, 8, 6}
		
		int n = nums.length;

		int[] left = new int[n];
		int[] right = new int[n];
		
		
		// fill all the prefix
		
		left[0] = 1;
		for(int i=1; i<n; i++) {
			left[i] = left[i-1] * nums[i-1];
			
		}
		
		right[n-1] = 1;
		for(int i=n-2; i>=0; i--) {
			right[i] = right[i+1] * nums[i+1];
		}
		
		int[] result = new int[n];
		for(int i=0; i<n; i++) {
			result[i] = left[i] * right[i];
			System.out.println(result[i]);
		}
	}

}
