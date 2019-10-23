import java.util.HashMap;

/*
 * @lc app=leetcode id=169 lang=java
 *
 * [169] Majority Element
 */

// @lc code=start
class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        int max = nums[0];
        for(int i : nums){
            int v = hm.getOrDefault(i, 0);
            v ++;
            if(v > nums.length/2){
                max = i;
                break;
            }
            hm.put(i, v);
        }
        return max;
    }
}
// @lc code=end

