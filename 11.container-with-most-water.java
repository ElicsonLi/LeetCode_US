/*
 * @lc app=leetcode id=11 lang=java
 *
 * [11] Container With Most Water
 */

// @lc code=start
class Solution {
    public int maxArea(int[] height) {
        int i = 0;
        int j = height.length - 1;
        int ans = 0;
        while(i < j){
            int h;
           if(height[i] > height[j]){
               h = height[j];
               j --;
            }else{
               h = height[i];
               i ++;
            }
            ans = Math.max(ans, h * (j - i + 1));
        }
        return ans;
    }
}
// @lc code=end

