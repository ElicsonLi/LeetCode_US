import java.util.HashMap;

/*
 * @lc app=leetcode id=1 lang=java
 *
 * [1] Two Sum
 */

// @lc code=start
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hs = new HashMap<>();
        int[] ans = new int[2];
        for(int i = 0; i < nums.length; i++){
            int s = target - nums[i];
            if(hs.containsKey(s)){
                ans[0] = i;
                ans[1] = hs.get(s);
                break;
            }else{
                hs.put(nums[i],i);
            }

        }
        return ans;
    }
}
// @lc code=end

