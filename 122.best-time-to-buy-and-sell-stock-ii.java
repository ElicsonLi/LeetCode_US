/*
 * @lc app=leetcode id=122 lang=java
 *
 * [122] Best Time to Buy and Sell Stock II
 */

// @lc code=start
class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length <= 1 )  return 0;
        int min = prices[0];
        int ans = 0;
        int max = prices[0];
        for(int i : prices){
            if(i < min && max < 0){
                min = i;
                continue;
            }
            if(i > max){
                max = i;
                continue;
            }
            ans += max - min;
            min = i;
            max = Integer.MIN_VALUE;   
        }
        if(max == Integer.MIN_VALUE){
            return ans;
        }
        return ans + max - min;
        
    }
}
   
// @lc code=end

