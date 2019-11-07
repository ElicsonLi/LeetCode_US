import java.util.Arrays;

/*
 * @lc app=leetcode id=31 lang=java
 *
 * [31] Next Permutation
 */

// @lc code=start
class Solution {
    public void nextPermutation(int[] nums) {
        for(int i = nums.length - 1; i >= 0 ; i --){
            int min = i;
            for(int j = i; j < nums.length; j ++){
                if(nums[j] > nums[i]){
                    if(min == i)  min = j;
                    min = nums[min] < nums[j] ? min : j;
                }
            }
            if(min != i){
                int temp = nums[min];
                nums[min] = nums[i];
                nums[i] = temp;
                Arrays.sort(nums, i + 1, nums.length);
                return;
            }
        }
        Arrays.sort(nums);
    }
}
// @lc code=end

