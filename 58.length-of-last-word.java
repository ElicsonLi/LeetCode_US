/*
 * @lc app=leetcode id=58 lang=java
 *
 * [58] Length of Last Word
 */

// @lc code=start
class Solution {
    public int lengthOfLastWord(String s) {
        if(s.length() == 0)  return 0;
        String ns = " "+s.trim();
        int count = 0;
        for(int i = 0; i < ns.length(); i ++){
            if(ns.charAt(ns.length() - 1 - i) == ' '){
                count = i;
                break;
            }
        }
        return count;
        
    }
}
// @lc code=end

