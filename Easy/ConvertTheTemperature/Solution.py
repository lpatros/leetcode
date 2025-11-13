
# LeetCode Problem 2469: Convert the Temperature

# Accepted with 0ms runtime and 17.77MB memory usage
class Solution:
    def convertTemperature(self, celsius: float) -> list[float]:
        return [celsius + 273.15, celsius * 1.80 + 32.00]

celsius = 36.50

solution = Solution()
res = solution.convertTemperature(celsius)

print(res)