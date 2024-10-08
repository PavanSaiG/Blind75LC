/*
 * @lc app=leetcode id=724 lang=java
 *
 * [724] Find Pivot Index
 */

// @lc code=start
class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        int[] pf = new int[n];
        int[] sf = new int[n];
        pf[0] = nums[0];
        sf[n-1] = nums[n-1];
        for(int i=1;i<n;i++)
        {
            pf[i] = pf[i-1] + nums[i];
        }
        for(int i=n-2;i>=0;i--)
        {
            sf[i] = sf[i+1] + nums[i];
        }
        for(int i=0;i<n;i++)
        {
            if(pf[i] == sf[i])
            return i;
        }
        return -1;
    }
}
// @lc code=end

