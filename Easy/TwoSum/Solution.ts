
// LeetCode Problem 1: Two Sum

// Accepted with 33ms runtime and 56.24MB memory usage
function twoSum(nums: number[], target: number): number[] {
    
    for (let i = 0; i < nums.length; i++) {
        for (let j = i + 1; j < nums.length; j++) {
            
            if (nums[i] + nums[j] === target) {
                return [i, j]
            }
        }
    }
    return [-1, -1]
};