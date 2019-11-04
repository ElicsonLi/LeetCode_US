import java.util.HashSet;

/*
 * @lc app=leetcode id=219 lang=java
 *
 * [219] Contains Duplicate II
 */

// @lc code=start
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashSet<Integer> hs = new HashSet<>();
        for(int i = 0; i  < nums.length; i ++){
            if(hs.contains(nums[i])){
                return true;
            }
            hs.add(nums[i]);
            if(i >= k){
                hs.remove(nums[i - k]);
            }
            
        }
        return false;
        
    }
}
// @lc code=end

