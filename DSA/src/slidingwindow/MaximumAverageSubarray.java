package slidingwindow;

public class MaximumAverageSubarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  int[] nums = {1,12,-5,-6,50,3}; int k =4;
			/*
			 * 
			 * int[] nums = {6}; int k =1;
			 */
		
		int n = nums.length;
		int left = 0;
		int right = k-1;
		int sum = 0;
		int max_sum = 0;
		int result_starting_index = 0;
		
		for(int i=0; i<k; i++) {
			sum =sum + nums[i];
		}
		
		while(right<n-1) {
		   sum = sum - nums[left] + nums[right+1];
		   if(sum > max_sum) {
			   max_sum = sum;
			   result_starting_index = left +1;
		   }
		   left++;
		   right++;		   
		}
		
	    for(int i = result_starting_index; i<result_starting_index + k; i++) {
	    	System.out.println(nums[i]);
	    }

	}

}
