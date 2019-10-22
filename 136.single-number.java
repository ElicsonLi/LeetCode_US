import java.util.HashSet;

/*
 * @lc app=leetcode id=136 lang=java
 *
 * [136] Single Number
 */

// @lc code=start
class Solution {
    public int singleNumber(int[] nums) {
        /*use hashset
        HashSet<Integer> hs = new HashSet<>();
        int ans = 0;
        for(int i : nums){
            if(hs.contains(i)){
                ans = ans - i;
            }else{
                hs.add(i);
                ans = ans + i;
            }
        }
        return ans;
        */
        int ans = 0;
        for(int i : nums){
            ans = ans^i;
        }
        return ans;
    }


}
// @lc code=end

