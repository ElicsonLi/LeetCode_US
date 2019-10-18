/*
 * @lc app=leetcode id=70 lang=java
 *
 * [70] Climbing Stairs
 */

// @lc code=start
class Solution {
    public int climbStairs(int n) {
        int[] climbmethod = new int[n]; 
        climbmethod[0] = 1;
        if(n == 1) {
            return climbmethod[n - 1];
        }
        climbmethod[1] = 2;
        for(int i = 2; i < n; i ++){
            climbmethod[i] = climbmethod[i - 1] + climbmethod[i - 2];
        }
        return climbmethod[n - 1];
    }
}
// @lc code=end

