/*
 * @lc app=leetcode id=7 lang=java
 *
 * [7] Reverse Integer
 */

// @lc code=start
class Solution {
    public int reverse(int x) {
        boolean fuhao = true;
        long ans = 0;
        if( x < 0){
            fuhao = false;
            x = -1 * x;
        }
        x = Math.abs(x);
        do{
             int y = x % 10;
             ans = ans * 10 + y;
             x /= 10; 
        }while(x != 0);
        
        if(ans > Integer.MAX_VALUE || ans < Integer.MIN_VALUE ){
            return 0;
        }else if(fuhao){
            return (int) ans;
        }else{
            return (int) (-1 * ans);
        }

    }
}
// @lc code=end

