package slidingwindow;

public class BuyAndSellStock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] nums = {7,1,5,3,6,4};
		int[] nums = {7,6,4,3,1};
		
		
		int buy = nums[0];
		int left = 1;
		int right = nums.length-1;
		
		int profit = 0;
		
		while(left<right) {
			
			if(nums[left]<buy) {
				buy = nums[left];
				left++;
			} else {
				int current_profit = 0;
				current_profit = nums[left] - buy;
				profit = Math.max(profit, current_profit);
				left++;				
			}
		}
		
		System.out.println("Max profit is : " + profit);

	}

}
