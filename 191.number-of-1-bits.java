/*
 * @lc app=leetcode id=191 lang=java
 *
 * [191] Number of 1 Bits
 */

// @lc code=start
public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int ans = 0;
        while(n != 0){
            ans += n & 1;
            n = n >>> 1;
        }
        return ans;
    }
}
// @lc code=end

