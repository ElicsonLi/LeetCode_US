import java.util.Hashtable;

/*
 * @lc app=leetcode id=242 lang=java
 *
 * [242] Valid Anagram
 */

// @lc code=start
class Solution {
    public boolean isAnagram(String s, String t) {
        boolean ans = true;
        char[] cs = s.toCharArray();
        char[] ct = t.toCharArray();
        int[] chars1 = new int[26];
        int[] chars2 = new int[26];
        for(char c : cs){
            chars1[c - 'a'] ++;
        }
        for(char c : ct){
            chars2[c - 'a'] ++;
        }
        for(int i = 0; i < 26; i ++){
            if(chars1[i] != chars2[i]){
                ans = false;
                break;
            }
        }
        
        return ans;
        
    }
}
// @lc code=end

