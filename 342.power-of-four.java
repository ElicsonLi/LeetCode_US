/*
 * @lc app=leetcode id=342 lang=java
 *
 * [342] Power of Four
 */

// @lc code=start
class Solution {
    public boolean isPowerOfFour(int num) {
        if(num <= 0)  return false;
        int x =(int) Math.round(Math.log(num)/Math.log(4));
        return Math.abs(num - Math.pow(4, x)) < 1e-5;
    }
}
// @lc code=end

