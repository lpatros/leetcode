
# LeetCode Problem 1929: Concatenation of Array

# Accepted with 2ms runtime and 18.04MB memory usage

class Solution:
    def getConcatenation(self, nums: list[int]) -> list[int]:
        ans: list[int] = []

        for i in range(0, 2 * len(nums)):
            ans.append(nums[i % len(nums)])
        
        return ans

nums = [1,2,1]

solution = Solution()
res = solution.getConcatenation(nums)

print(res)