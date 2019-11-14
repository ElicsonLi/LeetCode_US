import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/*
 * @lc app=leetcode id=18 lang=java
 *
 * [18] 4Sum
 */

// @lc code=start
class Solution {
    List<List<Integer>> res = new LinkedList<>();
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        for(int i = 0; i < nums.length - 3; i ++){
            if(i > 0 && nums[i] == nums[i - 1]){
                continue;
            }
            if(nums[i] * 4 > target){
                break;
            }
            if(nums[i] + nums[nums.length - 1] * 3 < target){
                continue;
            }
            for(int j = i + 1; j < nums.length - 2; j ++){
                if(j > i + 1 && nums[j] == nums[j - 1]){
                    continue;
                }
                if(nums[i] + 3 * nums[j] > target){
                    break;
                }
                if(nums[i] + nums[j] + nums[nums.length - 1] * 2 < target){
                    continue;
                }
                int p1 = j + 1;
                int p2 = nums.length - 1;
                while(p1 < p2){
                    if(p1 > j + 1 && nums[p1] == nums[p1 - 1]){
                        p1 ++;
                        continue;
                    }
                    if(p2 < nums.length - 1 && nums[p2] == nums[p2 + 1]){
                        p2 --;
                        continue;
                    }
                    if(nums[i] + nums[j] + 2 * nums[p1] > target){
                        break;
                    }
                    int sum = nums[i] + nums[j] + nums[p1] + nums[p2];
                    if(sum > target){
                        p2 --;
                    }else if(sum < target){
                        p1 ++;
                    }else{
                        List<Integer> temp = new LinkedList<>();
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[p1]);
                        temp.add(nums[p2]);
                        res.add(temp);
                        p2 --;
                        p1 ++;
                    }
                }
            }

        }
        return res;
    }
}
// @lc code=end

