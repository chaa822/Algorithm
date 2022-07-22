var containsDuplicate = function(nums) {
	nums.sort();
	for(let i = 1; i < nums.length; i++){
		if( nums[i - 1] == nums[i] )
			return true;
	}
	return false;
};

console.log( containsDuplicate([1,2,3,1]) );
console.log( containsDuplicate([1,2,3,4]) );
console.log( containsDuplicate([1,1,1,3,3,4,3,2,4,2]) );