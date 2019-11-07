/*
 * @lc app=leetcode id=29 lang=java
 *
 * [29] Divide Two Integers
 */

// @lc code=start
class Solution {
    public int divide(int dividend, int divisor) {
        long ldividend = dividend;
        long ldivisor = divisor;
        int sign = 1;
        int ans = 1;
        if(dividend == Integer.MIN_VALUE){
            if(divisor == -1){
                return Integer.MAX_VALUE;
            }
            if(divisor == 1){
                return Integer.MIN_VALUE;
            }
        }
        if(ldividend < 0){
            ldividend *= -1;
            sign *= -1;
        }
        if(ldivisor < 0){
            ldivisor*= -1;
            sign *= -1;
        }
        if(ldividend < ldivisor){
            return 0;
        }
        while(ldivisor * ans * 2 <= ldividend){
            ans *= 2;
        }

        return sign * ans + divide(dividend - divisor * sign * ans, divisor);   
        
    }
}
// @lc code=end

