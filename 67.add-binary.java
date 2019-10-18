/*
 * @lc app=leetcode id=67 lang=java
 *
 * [67] Add Binary
 */

// @lc code=start
class Solution {
    public String addBinary(String a, String b) {
        char[] as = a.toCharArray();
        char[] bs = b.toCharArray();
        StringBuffer ans = new StringBuffer();
        int jinwei = 0;
        int i =0;
        while(i < as. length || i < bs.length || jinwei > 0){
            int adds1 = 0;
            if(i < bs.length){
                adds1 = bs[bs.length - 1 - i] - '0';
            }
            int adds2 = 0;
            if(i < as.length){
                adds2 = as[as.length - 1 - i] - '0';
            }
            int digit = jinwei + adds2 + adds1;
            jinwei = digit / 2;
            digit %= 2;
            ans.append(digit); 
            i ++;
        }
        return ans.reverse().toString();

        

        
    }
}
// @lc code=end

