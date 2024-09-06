/*
 * @lc app=leetcode id=1318 lang=java
 *
 * [1318] Minimum Flips to Make a OR b Equal to c
 */

// @lc code=start
class Solution {
    public int minFlips(int a, int b, int c) {
        boolean bit_a,bit_b,bit_c;
        int flip = 0;
        for(int i=0;i<32;i++)
        {
            bit_a = checkbit(a,i);
            bit_b = checkbit(b,i);
            bit_c = checkbit(c,i);
            if((bit_a | bit_b) != bit_c)
            {
                if(bit_c == false)
                {
                    if(bit_a == true && bit_b == true)
                    {
                        System.out.println(bit_a+" "+bit_b+" "+bit_c);
                        flip = flip +2;
                    }
                    else
                    {
                        System.out.println(bit_a+" "+bit_b+" "+bit_c);
                        flip = flip +1;
                    }
                }
                if(bit_c == true)
                {
                    System.out.println(bit_a+" "+bit_b+" "+bit_c);
                    flip = flip+1; 
                }
            }
        }
        return flip;
    }
    public boolean checkbit(int a, int i)
    {
        if((a | (1<<i)) == a)
        return true;
        return false;
    }
}
// @lc code=end

