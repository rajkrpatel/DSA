package com.binarysearch;

public class FindMinimumInRototatedSortedList {
    static void main(String[] args) {
        System.out.println(findMin(new int[]{6,7,8,9,0,1,2,4}));
    }
    public static int findMin(int[] nums) {

        int left = 0;
        int right = nums.length-1;

        while(left<right){
            int mid = left + (right - left)/2;

            if(nums[mid] > nums[right]){
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return nums[right];
    }
}
