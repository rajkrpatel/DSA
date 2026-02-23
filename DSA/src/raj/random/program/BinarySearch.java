package raj.random.program;

public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = {0,1,2,4,5,6,7,8,9};
        int target = 8;

         int target_index = binarysearch(nums, target);

        System.out.println( target +" is at index : " + (target_index));

    }

    private static int binarysearch(int[] nums, int target) {
        int start = 0;
        int end = nums.length -1;

        while(start<=end){
            int mid = start + (end-start)/2;

            if(nums[mid] == target){
                return mid;
            } else if(nums[mid] > target){
                end = mid-1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
