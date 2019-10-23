/*
 * @lc app=leetcode id=168 lang=java
 *
 * [168] Excel Sheet Column Title
 */

// @lc code=start
class Solution {
    public String convertToTitle(int n) {
        StringBuffer sb = new StringBuffer();
        while(n != 0){
            n = n - 1;
            char c = (char)('A' + n % 26);
            sb.append(c);
            n = n  / 26;
        }
        return sb.reverse().toString();
        
    }
}
// @lc code=end

