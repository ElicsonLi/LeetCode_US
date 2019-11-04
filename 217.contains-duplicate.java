import java.util.HashSet;

/*
 * @lc app=leetcode id=217 lang=java
 *
 * [217] Contains Duplicate
 */

// @lc code=start
class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        for(int i : nums){
            if(hs.contains(i)){
                return true;
            }
            hs.add(i);
        }
        return false;
        
    }
}
// @lc code=end

