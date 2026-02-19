package com.array;

public class ContainerWithMostStorage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,8,6,2,5,4,8,6,7};
		
		int left = 0;
		int right = arr.length-1;
		
		int max = 0;
		
		while(left<right) {
			int h1 = arr[left];
			int h2 = arr[right];
			
			int width = right-left;
			
			int area = Math.min(h1, h2) * width;
			
			if(area > max) {
				max= area;
			}
			
			if(h1 < h2) {
				left++;
			} else {
				right--;
			}
		}
		
		System.out.println("Max container size is : " + max);
		

	}

}
