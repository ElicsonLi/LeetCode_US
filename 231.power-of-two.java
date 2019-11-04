/*
 * @lc app=leetcode id=231 lang=java
 *
 * [231] Power of Two
 */

// @lc code=start
class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n == 0){
            return false;
        }
        while((n & 1) == 0){
            n = n >> 1;
        }
        return (n == 1);
        
    }
}
// @lc code=end

