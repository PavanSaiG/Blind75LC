/*
 * @lc app=leetcode id=1732 lang=java
 *
 * [1732] Find the Highest Altitude
 */

// @lc code=start
class Solution {
    public int largestAltitude(int[] gain) {
        int n = gain.length;
        int[] pf = new int[n];
        pf[0] = gain[0];
        for(int i=1;i<n;i++)
        {
            pf[i] = pf[i-1] + gain[i];
        }
        int max = 0;
        for(int i=0;i<n;i++)
        {
            if(pf[i]>max)
            max = pf[i];
            System.out.println(pf[i]);
        }
        System.out.println(max);
        return max;
    }
}
// @lc code=end

