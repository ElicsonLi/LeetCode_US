/*
 * @lc app=leetcode id=268 lang=java
 *
 * [268] Missing Number
 */

// @lc code=start
class Solution {
    public int missingNumber(int[] nums) {
        long sum = (nums.length + 1) * nums.length / 2;
        for(int i : nums){
            sum -= i;
        }
        return (int) sum;
        
    }
}
// @lc code=end

