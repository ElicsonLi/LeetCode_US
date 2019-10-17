/*
 * @lc app=leetcode id=35 lang=java
 *
 * [35] Search Insert Position
 */

// @lc code=start
class Solution {
    public int searchInsert(int[] nums, int target) {
        int ans;
        int head = 0;
        int tail = nums.length - 1;
        int mid = (head + tail) / 2;
        while(head < tail){
            if(target > nums[mid]) head = mid + 1;
            if(target < nums[mid]) tail = mid - 1;
            if(target == nums[mid]) break;
             mid = (head + tail) / 2;
        }
        if(target <= nums[mid]){
            return mid;
        }else{
            return mid + 1;
        }
    }
}
// @lc code=end

