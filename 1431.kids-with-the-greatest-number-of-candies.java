/*
 * @lc app=leetcode id=1431 lang=java
 *
 * [1431] Kids With the Greatest Number of Candies
 */

// @lc code=start

import java.lang.reflect.Array;
import java.util.ArrayList;

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> res = new ArrayList<>();
        int max = candies[0];
        for(int i=0;i<candies.length;i++)
        {
            max = Math.max(max,candies[i]);
            candies[i] = candies[i] + extraCandies;
        }
        for(int i=0;i<candies.length;i++)
        {
            if(candies[i]>=max)
            {
                res.add(true);
            }
            else
            {
                res.add(false);
            }
        }
        return res;
        
    }
}
// @lc code=end

