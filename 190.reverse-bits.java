/*
 * @lc app=leetcode id=190 lang=java
 *
 * [190] Reverse Bits
 */

// @lc code=start
public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int ans = 0;
        for(int i = 0; i < 32; i ++){
            //move ans to right then plus the next left digit of n
            ans = (ans << 1)| (n & 1);
            n = n >> 1; 
        }
        return ans;
        
    }
}
// @lc code=end

