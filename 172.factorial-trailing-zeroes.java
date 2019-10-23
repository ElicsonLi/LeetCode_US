/*
 * @lc app=leetcode id=172 lang=java
 *
 * [172] Factorial Trailing Zeroes
 */

// @lc code=start
class Solution {
    public int trailingZeroes(int n) {
        int ans = 0;
        long x = 5;
        while(n >= x){
            ans += n/x; 
            x *= 5;
        }
        return ans;
        
    }
}
// @lc code=end

