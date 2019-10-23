/*
 * @lc app=leetcode id=8 lang=java
 *
 * [8] String to Integer (atoi)
 */

// @lc code=start
class Solution {
    public int myAtoi(String str) {
        String newstr = str.trim();
        if(newstr.length() < 1){
            return 0;
        }
        int ans = 0;
        int sign = 1;
        int start = 0;
        StringBuffer sb = new StringBuffer();
        if(newstr.charAt(0) == '+' || newstr.charAt(0) == '-'){
            sign = newstr.charAt(0) == '-' ? -1 : 1;
            start ++;

        }
        char[] cs = newstr.toCharArray();
        for(int i = start; i < cs.length; i ++){
            int num = cs[i] - '0';        
            if(num >= 0 && num <= 9){
                if(ans > (Integer.MAX_VALUE - num) /10){
                    if(sign == 1){
                        ans = Integer.MAX_VALUE;
                        break;
                    }else{
                        ans = Integer.MIN_VALUE;
                        break;
                    }
                }
                ans = ans * 10 + num;
            }else{
                break;
            }
        }
        return sign * ans;
    }
}
// @lc code=end

