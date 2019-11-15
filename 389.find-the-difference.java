/*
 * @lc app=leetcode id=389 lang=java
 *
 * [389] Find the Difference
 */

// @lc code=start
class Solution {
    public char findTheDifference(String s, String t) {
        int[] ts = new int[26];
        char ans = 'a';
        for(char c : t.toCharArray()){
            ts[c - 'a'] ++;
        }
        for(char c : s.toCharArray()){
            ts[c - 'a'] --;
        }
        for(int i = 0; i < 26; i ++){
            if(ts[i] > 0){
                ans =  (char)('a'+ i);
                break;
            }
        }
        return ans;
    }
}
// @lc code=end

