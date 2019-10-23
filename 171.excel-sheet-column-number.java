/*
 * @lc app=leetcode id=171 lang=java
 *
 * [171] Excel Sheet Column Number
 */

// @lc code=start
class Solution {
    public int titleToNumber(String s) {
        int n = 0;
        char[] cs = s.toCharArray();
        for(char c : cs){
            n = n * 26 + c - 'A' + 1;
        }
        return n;
        
    }
}
// @lc code=end

