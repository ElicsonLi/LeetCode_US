import java.util.Arrays;

/*
 * @lc app=leetcode id=16 lang=java
 *
 * [16] 3Sum Closest
 */

// @lc code=start
class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int sum = nums[0] + nums[1] + nums[2];
        for(int i = 0; i < nums.length - 2; i ++){
            if(i > 0 && nums[i] == nums[i - 1]){
                continue;
            }
            int p1 = i + 1;
            int p2 = nums.length - 1;
            while(p1 < p2){
                if(p1 > i + 1 && nums[p1] == nums[p1 - 1]){
                    p1 ++;
                    continue;
                }
                if(p2 < nums.length - 1 && nums[p2] == nums[p2 + 1]){
                    p2 --;
                    continue;
                }
                int temp = nums[i] + nums[p1] + nums[p2];
                if(Math.abs(temp - target) < Math.abs(sum - target)){
                    sum = temp;
                }
                if(temp > target){
                    p2 --;
                }
                if(temp < target){
                    p1 ++;
                }
                if(temp == target){
                    return target;
                }
            }
        }
        return sum;
    }
}
// @lc code=end

