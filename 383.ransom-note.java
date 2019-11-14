/*
 * @lc app=leetcode id=383 lang=java
 *
 * [383] Ransom Note
 */

// @lc code=start
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] rs = new int[26];
        int[] ms = new int[26];
        for(char c : ransomNote.toCharArray()){
            rs[c - 'a'] ++;
        }
        for(char c : magazine.toCharArray()){
            ms[c - 'a'] ++;
        }
        for(int i = 0; i < 26; i ++){
            if(rs[i] > ms[i]){
                return false;
            }
        }
        return true;   
    }
}
// @lc code=end

