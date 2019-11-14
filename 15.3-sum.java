import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/*
 * @lc app=leetcode id=15 lang=java
 *
 * [15] 3Sum
 */

// @lc code=start
class Solution {
    List<List<Integer>> res = new LinkedList<>();
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        for(int i = 0; i < nums.length - 2; i ++){
            if(i > 0 && nums[i] == nums[i - 1]){
                continue;
            }
            // if(3 * nums[i] > 0){
            //     break;
            // }
            // if(nums[i] + nums[nums.length - 1] * 2 < 0){
            //     continue;
            // }
            int p1 = i + 1;
            int p2 = nums.length - 1;
            while(p1 < p2){
                if(p1 != i + 1 && nums[p1] == nums[p1 - 1]){
                    p1 ++;
                    continue;
                }
                if(p2 != nums.length - 1 && nums[p2] == nums[p2 + 1]){
                    p2 --;
                    continue;
                }
                if(nums[i] + nums[p1] + nums[p2] == 0){
                    LinkedList<Integer> temp = new LinkedList<>();
                	temp.add(nums[i]);
                	temp.add(nums[p1]);
                	temp.add(nums[p2]);
                	res.add(temp);
                    p1 ++;
                    p2 --;
                }else if(nums[i] + nums[p1] + nums[p2] > 0){
                    p2 --;
                }else{
                    p1 ++;
                }
            }
            


        }
        return res;
        
    }
}
// @lc code=end

