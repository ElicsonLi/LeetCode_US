/*
 * @lc app=leetcode id=258 lang=java
 *
 * [258] Add Digits
 */

// @lc code=start
class Solution {
    public int addDigits(int num) {
        /* use recursion
        if(num/10 == 0){
            return num;
        }
        int sum = 0;
        while(num != 0){
            sum += num%10;
            num /= 10;
        }
        return addDigits(sum);
        */
        
        /**
         * use O(1) runtime
         * the basis is 10 ^ k % 9 = 1
         *       so a * 10 ^ k % 9 = a
         */
        return (num - 1) % 9 + 1;
    
    }
}
// @lc code=end

