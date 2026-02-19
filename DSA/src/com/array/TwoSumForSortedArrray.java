package com.array;

public class TwoSumForSortedArrray {

	public static void main(String[] args) throws Exception {
		int[] nums = {1,2,3,5,8,13,15};
		int target = 11;
		
		
		int[] findIndices = findIndices(nums, target);
		for (int i = 0; i < findIndices.length; i++) {
			System.out.println(findIndices[i]);
		}
		
	

	}

	private static int[] findIndices(int[] nums, int target) throws Exception {
		// TODO Auto-generated method stub
		int left = 0;
		int right = nums.length-1;
		
		while(left<right) {
			int sum = nums[left] + nums[right];
			if(sum == target) {
				return new int[] {left,right};
			} else if(sum > target) {
				right--;
			} else {
				left++;
			}
		}
		
		throw new Exception("number not found");
		
	}

}
