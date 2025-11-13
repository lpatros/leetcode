package Easy.ConcatenationOfArrays;

// LeetCode Problem 1929: Concatenation of Array

// Accepted with 2ms runtime and 46.80MB memory usage
class Solution_V1 {
    public static int[] getConcatenation(int[] nums) {
        int[] ans = new int[2 * nums.length];
        int n;
        for (int i = 0; i < 2 * nums.length; i++) {

            if (i >= nums.length) {
                n = i - nums.length;
            } else {
                n = i;
            }

            ans[i] = nums[n];
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 1};
        int[] result = getConcatenation(nums);

        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}