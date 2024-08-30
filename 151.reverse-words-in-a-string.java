/*
 * @lc app=leetcode id=151 lang=java
 *
 * [151] Reverse Words in a String
 */

// @lc code=start
class Solution {
    public String reverseWords(String s) {
        StringBuilder word = new StringBuilder();
        StringBuilder ans = new StringBuilder();
        int j = s.length() - 1;

        while (j >= 0) {
            if (s.charAt(j) == ' ') {
                if (word.length() > 0) {
                    word.reverse();
                    ans.append(word).append(' ');
                    word.setLength(0);
                }
            } else {
                word.append(s.charAt(j));
            }
            j--;
        }

        if (word.length() > 0) {
            word.reverse();
            ans.append(word);
        }
        int k = ans.length()-1;

        if(ans.charAt(k) == ' ')
        {
            ans.deleteCharAt(ans.length()-1);
        }
        if( ans.charAt(0) == ' ')
        {
            ans.deleteCharAt(0);
        }
        

        return ans.toString();
    }
}

// @lc code=end

