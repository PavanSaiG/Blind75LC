/*
 * @lc app=leetcode id=1071 lang=java
 *
 * [1071] Greatest Common Divisor of Strings
 */

// @lc code=start
class Solution {
    public String gcdOfStrings(String str1, String str2) {
        // Check if concatenating str1 and str2 in both orders gives the same result
        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }

        // Find the GCD of the lengths of str1 and str2
        int gcdLength = gcd(str1.length(), str2.length());

        // Return the prefix of str1 up to the GCD length
        return str1.substring(0, gcdLength);
    }

    // Helper method to find the GCD of two numbers using the Euclidean algorithm
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
// @lc code=end

