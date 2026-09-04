
// LeetCode Problem 2469: Convert the Temperature

// Accepted with 0ms runtime and 55.38MB memory usage
function convertTemperature(celsius: number): number[] {
    return [celsius + 273.15, celsius * 1.80 + 32.00]
};