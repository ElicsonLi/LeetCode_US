/*
 * @lc app=leetcode id=121 lang=java
 *
 * [121] Best Time to Buy and Sell Stock
 */

// @lc code=start
class Solution {
    /** first method use less memory but a lot of time
    public int maxProfit(int[] prices) {
        return OPT(0,prices);   
    }

    private int OPT(int dayindex, int[] prices){
        if(dayindex >= prices.length - 1){
            return 0;
        }
        int buy = sellmax(dayindex, prices) - prices[dayindex];
        return Math.max(buy, OPT(dayindex + 1,prices));

    }

    private int sellmax(int dayindex, int[] prices){
        if(dayindex >= prices.length - 1){
            return 0;
        }
        int max = prices[dayindex + 1];
        for(int i = dayindex + 1; i < prices.length; i ++){
            if(max < prices[i]){
                max = prices[i];
            }
        }
        return max;
    }
    */

    /** second method, faster but use more memory
    public int maxProfit(int[] prices) {
        if(prices.length < 2) return 0;
        int min = prices[0];
        return OPT(1,min,prices);   
    }

    private int OPT(int dayindex,int min, int[] prices){
        if(dayindex > prices.length - 1){
            return 0;
        }
        int sell = prices[dayindex] - min;
        min = Math.min(min, prices[dayindex]);
        return Math.max(sell, OPT(dayindex + 1,min,prices));

    }
    */

    /** last method, don't use dp  
     * 
     */
    public int maxProfit(int[] prices) {
        if(prices.length < 2) return 0;
        int min = prices[0];
        int ans = 0;
        for(int i = 1; i < prices.length; i ++){
            if(prices[i] < min){
                min = prices[i];
            }else{
                if(ans < prices[i] - min){
                    ans = prices[i] - min;
                }
            }

        }
        return ans; 
    }
}
// @lc code=end

