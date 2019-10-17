/*
 * @lc app=leetcode id=28 lang=java
 *
 * [28] Implement strStr()
 */

// @lc code=start
class Solution {
    public int strStr(String haystack, String needle) {
        if(needle.length() == 0) return 0;
        char[] h = haystack.toCharArray();
        char[] n = needle.toCharArray();
        int i = 0;
        int j = 0;
        boolean isStart = false;
        while(i < h.length && j < n.length){
            if(h[i] == n[j]){
                isStart = true;
            }else if(j > 0){
                i = i - j;
                j = 0;
                isStart = false;
            }
            if(isStart){
                j ++;
            }
            i ++;
        }
        
        if(j == n.length)  return i -j;
        return  -1;
    }
}

// @lc code=end

