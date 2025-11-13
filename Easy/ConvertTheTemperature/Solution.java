package Easy.ConvertTheTemperature;

// LeetCode Problem 2469: Convert the Temperature

// Accepted with 0ms runtime and 45.6MB memory usage
class Solution {
    public static double[] convertTemperature(double celsius) {
        double[] res = {celsius + 273.15, celsius * 1.80 + 32.00};
        return res;
    }

    public static void main(String[] args) {
        
        double[] res = convertTemperature(32);

        System.out.println(String.format("[%.2f, %.2f]", res[0], res[1]));
    }
}