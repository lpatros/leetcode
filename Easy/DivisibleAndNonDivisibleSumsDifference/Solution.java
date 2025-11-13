package Easy.DivisibleAndNonDivisibleSumsDifference;

// LeetCode Problem 2894: Divisible and Non-divisible Sums Difference

// Accepted with 1ms runtime and 42.71MB memory usage
class Solution {
    public static int differenceOfSums(int n, int m) {
        int sum1 = 0;
        int sum2 = 0;

        for (int i = 1; i <= n; i++) {
            
            if (i % m != 0) {
                sum1 += i;
            }

            if (i % m == 0) {
                sum2 += i;
            }
        }

        return sum1 - sum2;
    }

    public static void main(String[] args) {
        int n = 10;
        int m = 3;

        int result = differenceOfSums(n, m);

        System.out.println(result);
    }
}
