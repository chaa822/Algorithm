var maxSubArray = function(nums) {
    let max = nums[0];
    let currentValue = nums[0];
    for(let i = 1; i < nums.length; i++){
        currentValue = Math.max(currentValue + nums[i], nums[i]);
        max = Math.max(max, currentValue);
    }
    return max;
};