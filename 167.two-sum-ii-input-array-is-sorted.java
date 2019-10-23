/*
 * @lc app=leetcode id=167 lang=java
 *
 * [167] Two Sum II - Input array is sorted
 */

// @lc code=start
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int index1 = 0;
        int index2 = numbers.length - 1;
        int[] ans = new int[2];
        while(index1 < index2){
            int sum = numbers[index1] + numbers[index2];
            if(sum == target){
                ans[0] = index1 + 1;
                ans[1] = index2 + 1;
                break;
            }else if(sum > target){
                index2 --;
            }else{
                index1 ++;
            }
        }
        return ans;
    }
}
// @lc code=end

