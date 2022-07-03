import java.util.*;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] answer = new int[2];
        
        for(int i = 0; i < nums.length; i++){
            for(int j = i+1; j < nums.length; j++){
                if(nums[i] + nums[j] == target){
                    answer[0] = i;
                    answer[1] = j;
                }
            }
        }
        return answer;
    }

	public static void main(String[] args) {
		Solution solution = new Solution();

		int[] input = {2, 7, 11, 15};
		int target = 9;
		System.out.println( Arrays.toString(solution.twoSum(input, target)) );

		int[] input2 = {3,2,4};
		int target2 = 6;
		System.out.println( Arrays.toString(solution.twoSum(input2, target2)) );
	}
}