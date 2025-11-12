class Solution:
    def twoSum(self, nums: list[int], target: int) -> list[int]:
        for i in range(0, len(nums)):
            for j in range(i + 1, len(nums)):
                sum = nums[i] + nums[j]
                if sum == target:
                    return [i, j]
        

nums = [3, 2, 4, 9, 8, 105, 42, 57, 12]
target = 114

my_solution = Solution
res = my_solution.twoSum(my_solution, nums, target)

print(res)