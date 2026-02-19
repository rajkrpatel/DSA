package com.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ThreeSum {
	public static void main(String[] args) {
	
		int[] nums = {-1,0,1,2,-1,4};
		int target = 0;
		//output [[-1,0,1], [-1,-1,2]]
		
		Set<List<Integer>> result = findThreeSum(target,nums);
		System.out.println(result);
	}

	private static Set<List<Integer>> findThreeSum(int target, int[] nums) {
		// TODO Auto-generated method stub
		Arrays.sort(nums);
		Set<List<Integer>> result = new HashSet<>();
		for(int i=0; i<nums.length-2; i++) {
			int first = nums[i];
			
			int left = i+1;
			int right = nums.length - 1;
			
			while(left<right) {
				if(first + nums[left] + nums[right] == target) {
					result.add(Arrays.asList(first,nums[left],nums[right]));
					left++;
					right--;
				} else if(first + nums[left] + nums[right] > target) {
					right--;
				} else {
					left++;
				}				
			}
		}
		
		return result;
	}
	
	

}
