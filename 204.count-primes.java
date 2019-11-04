/*
 * @lc app=leetcode id=204 lang=java
 *
 * [204] Count Primes
 */

// @lc code=start
class Solution {
    public int countPrimes(int n) {
        boolean[] nums = new boolean[n];
        int count = 0;;
        for(int i = 2; i  < n; i ++){
            if(!nums[i]) {
                count ++;
                for(int j = 2 * i; j < n; j += i){
                    nums[j] = true;
                }
            }
        }
        return count; 
    }
}
// @lc code=end

