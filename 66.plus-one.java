/*
 * @lc app=leetcode id=66 lang=java
 *
 * [66] Plus One
 */

// @lc code=start
class Solution {
    public int[] plusOne(int[] digits) {
        boolean flag = false;
        int[] ans;
        for(int i = 0; i < digits.length; i ++){
            int digit = digits[digits.length - 1 - i];
            if(flag || i == 0){
                digit ++;
                if(digit > 9){
                    flag = true;
                    digit = 0;
                }else{
                    flag = false;
                }
                digits[digits.length - 1 - i] = digit;
            }else{
                break;
            }
        
        }
        if(digits[0] == 0){
            ans = new int[digits.length + 1]; 
            ans[0] = 1;
        }else{
            ans = digits;
        }

        return ans;
        
    }
}
// @lc code=end

