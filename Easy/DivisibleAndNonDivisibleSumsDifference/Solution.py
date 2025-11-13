
# LeetCode Problem 2894: Divisible and Non-divisible Sums Difference

# Accepted with 7ms runtime and 17.98MB memory usage
class Solution:
    def differenceOfSums(self, n: int, m: int) -> int:
        sum1: int = 0
        sum2: int = 0

        for i in range(1, n + 1):

            if i % m != 0:
                sum1 += i

            if i % m == 0:
                sum2 += i
        
        return sum1 - sum2
    

n = 10
m = 3

solution = Solution()
res = solution.differenceOfSums(n, m)

print(res)