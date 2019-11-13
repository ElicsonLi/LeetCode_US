/*
 * @lc app=leetcode id=50 lang=java
 *
 * [50] Pow(x, n)
 */

// @lc code=start
class Solution {
    public double myPow(double x, int n) {
        boolean isMin = false;
        if(n == 0) return 1;
        if(n == 1) return x;
        if(n < 0) {
            if(n == Integer.MIN_VALUE){
                n = Integer.MAX_VALUE;
                isMin = true;
            }else{
                n = -n;
            }
            x = 1/x;
        }
        double half = myPow(x, n/2);
        double res;
        if(n % 2 == 0){
            res = half * half;
        }else{
            res = half * half * x;
        }
        if(isMin){
            return res * x;
        }
        return res;
    }
}
// @lc code=end

