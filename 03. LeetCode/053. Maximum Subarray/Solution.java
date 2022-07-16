class Solution {
    public int maxSubArray(int[] nums) {
        int max = nums[0];
        int currentValue = nums[0];
        for(int i = 1; i < nums.length; i++){
            currentValue = Math.max(currentValue + nums[i], nums[i]);
            max = Math.max(max, currentValue);
        }
        return max;
    }
}