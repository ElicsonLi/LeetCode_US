/*
 * @lc app=leetcode id=198 lang=java
 *
 * [198] House Robber
 */

// @lc code=start
class Solution {
    public int rob(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        if(nums.length == 1){
            return nums[0];
        }
        int[] values = choose(nums);
        return values[0];
    }

    private int[] choose(int[] nums){
        int[] ans = new int[nums.length];
        ans[ans.length - 1] = nums[ans.length - 1];
        ans[ans.length - 2] = Math.max(nums[ans.length - 1], nums[ans.length - 2]);
        for(int i = ans.length - 3; i >= 0; i --){
            ans[i] = Math.max(nums[i] +  ans[i + 2], ans[i + 1]);
        }
        return ans;
    }
}
// @lc code=end

