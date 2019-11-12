/*
 * @lc app=leetcode id=326 lang=java
 *
 * [326] Power of Three
 */

// @lc code=start
class Solution {
    public boolean isPowerOfThree(int n) {
        if(n <= 0)  return false;
        int x =(int) Math.round(Math.log(n)/Math.log(3));
        return Math.abs(n - Math.pow(3, x)) < 1e-5;
    }
}
// @lc code=end

