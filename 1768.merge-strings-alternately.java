/*
 * @lc app=leetcode id=1768 lang=java
 *
 * [1768] Merge Strings Alternately
 */

// @lc code=start
class Solution {
    public String mergeAlternately(String word1, String word2) {
        int n=word1.length();
        int m=word2.length();
        char[] res = new char[n+m];
        int i=0,j=0,k=0;
        while(k<(n+m))
        {
            //System.out.println(i+" "+j+" "+k);
            if(i<n){
                res[k] = word1.charAt(i);
                i++;
                k++;
            }
            if(j<m){
                res[k] = word2.charAt(j);
                j++;
                k++;
            }
            if(k==n+m){
                break;
            }
            
        }
        String ans = new String(res);
        //System.out.println(res);
        return ans;
    }
}
// @lc code=end

