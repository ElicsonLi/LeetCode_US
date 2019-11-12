/*
 * @lc app=leetcode id=34 lang=java
 *
 * [34] Find First and Last Position of Element in Sorted Array
 */

// @lc code=start
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, -1};
        int l = findlowerbound(nums, target);
        if(l < nums.length && nums[l] == target){
            ans[0] = l;
            ans[1] = findlowerbound(nums, target + 1) - 1;
        }
        return ans;
        
    }

    private int findlowerbound(int[] nums, int target){
        int l = 0; 
        int u = nums.length;
        int mid = l + (u - l) /2;
        while(l < u){
            mid = l + (u - l) /2;
            if(nums[mid] >= target)  u = mid;
            else l = mid + 1; 
        }
        return l;
    }
}
// @lc code=end

