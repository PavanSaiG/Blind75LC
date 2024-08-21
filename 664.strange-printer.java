/*
 * @lc app=leetcode id=664 lang=java
 *
 * [664] Strange Printer
 */

// @lc code=start

import java.util.HashSet;

class Solution {
    public int strangePrinter(String s) {
        HashSet<Character> hs = new HashSet<>();
        for (int i=0; i<s.length();i++) {
            hs.add(s.charAt(i));
        }
        //Dp problem will solve later
        return hs.size();        
    }
}
// @lc code=end

