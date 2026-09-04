
// LeetCode Problem 2894: Divisible and Non-divisible Sums Difference

// Accepted with 0ms runtime and 57.77MB memory usage
function differenceOfSums(n: number, m: number): number {
    
    let num1: number = 0
    let num2: number = 0

    for (let i = 1; i <= n; i++) {
        if (i % m === 0) {
            num2 += i
            continue
        }
        num1 += i
    }

    return num1 - num2
};