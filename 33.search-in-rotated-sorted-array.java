/*
 * @lc app=leetcode id=33 lang=java
 *
 * [33] Search in Rotated Sorted Array
 */

// @lc code=start
class Solution {
    public int search(int[] nums, int target) {
        int first = 0;
        int last = nums.length - 1;
        int mid = (first + last) / 2;
        while(first <= last){
        	mid = (first + last) / 2;
            if(nums[mid] == target)  return mid;
            if(nums[first] == target)  return first;
            if(nums[last] == target)  return last;
            if(nums[first] < nums[last]){
            	if(target > nums[mid]) first = mid + 1;
            	if(target < nums[mid]) last = mid - 1;
            	continue;
            }
            if(target > nums[mid]){
                if(nums[mid] > nums[last]){
                    first = mid + 1;
                }else if(target < nums[last]){
                    first = mid + 1;
                }
                else if(target > nums[last]){
                    last = mid - 1;
                }
            }
            if(target < nums[mid]){
                if(nums[mid] < nums[first]){
                    last = mid - 1;
                }else if(target < nums[last]){
                    first = mid + 1;
                }else if(target > nums[last]){
                    last = mid - 1;
                }
            }
        }
        
        return -1;

        
    }
}
// @lc code=end

