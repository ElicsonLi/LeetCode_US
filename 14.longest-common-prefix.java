import sun.awt.www.content.audio.basic;

/*
 * @lc app=leetcode id=14 lang=java
 *
 * [14] Longest Common Prefix
 */

// @lc code=start
class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0)  return "";
        StringBuffer sb = new StringBuffer();
        int length = strs[0].length();
        For1:
        for(int i = 0 ;i < length;i++){
            char c = strs[0].charAt(i);
            for(String s : strs){
                try{
                    if(s.charAt(i) != c){
                    break For1;
                }
                }catch(Exception e){
                    break For1;
                }
                
            }
            sb.append(c);
        }

        return sb.toString();
    }
}
// @lc code=end

