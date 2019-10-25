/*
 * @lc app=leetcode id=53 lang=java
 *
 * [53] Maximum Subarray
 */

// @lc code=start
class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int thisSum = 0;
        for(int i : nums){
            thisSum += i;
            if(thisSum > maxSum){
                maxSum = thisSum;
            }
            if(thisSum < 0){
                thisSum = 0;
            }
        }
        return maxSum;
        
    }
}
// @lc code=end

