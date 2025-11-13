package Easy.ConcatenationOfArrays;

// LeetCode Problem 1929: Concatenation of Array

// Accepted with 1ms runtime and 47.25MB memory usage
public class Solution_V2 {
    public static int[] getConcatenation(int[] nums) {
        int[] ans = new int[2 * nums.length];
        for (int i = 0; i < 2 * nums.length; i++) {
            ans[i] = nums[i % nums.length];
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2,1 };
        int[] result = getConcatenation(nums);
        
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
