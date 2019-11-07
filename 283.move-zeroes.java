/*
 * @lc app=leetcode id=283 lang=java
 *
 * [283] Move Zeroes
 */

// @lc code=start
class Solution {
    public void moveZeroes(int[] nums) {
        // int count = 0;
        // int i = 0;
        // LOOP:
        // while(i < nums.length){
        //     if(nums[i] == 0){
        //         int j = i;
        //         while(nums[j] == 0){
        //             j ++;
        //             if(j >= nums.length){
        //                 break LOOP;
        //             }
        //         }
                
        //         nums[i] = nums[j];
        //         nums[j] = 0;
        //     }
        //     i ++;  
        // }
        if (nums == null || nums.length == 0) return;        

        int insertPos = 0;
        for (int num: nums) {
            if (num != 0) nums[insertPos++] = num;
        }        
    
        while (insertPos < nums.length) {
            nums[insertPos++] = 0;
        }
        
    }
}
// @lc code=end

