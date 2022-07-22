import java.util.*;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i = 1; i < nums.length; i++){
            if( nums[i - 1] == nums[i] )
                return true;
        }
        return false;
    }

	public static void main(String[] args) {
		Solution solution = new Solution();
		
		int[] arr1 = {1,2,3,1};
		System.out.println( solution.containsDuplicate(arr1) );
		
		int[] arr2 = {1,2,3,4};
		System.out.println( solution.containsDuplicate(arr2) );

		int[] arr3 = {1,1,1,3,3,4,3,2,4,2};
		System.out.println( solution.containsDuplicate(arr3) );
	}
}