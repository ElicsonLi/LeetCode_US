import java.util.ArrayList;
import java.util.HashSet;

/*
 * @lc app=leetcode id=3 lang=java
 *
 * [3] Longest Substring Without Repeating Characters
 */

// @lc code=start
class Solution {
    public int lengthOfLongestSubstring(String s) {
        ArrayList<Character> al = new ArrayList<>(); 
        int length = 0;
        for(char c : s.toCharArray()){
            int index = al.indexOf(c);
            if (index >= 0){
                length = Math.max(length, al.size());
                for(int i = 0; i < index + 1; i ++){
                    al.remove(0);
                }
            }
            al.add(c);
        }
        return Math.max(length, al.size());
        
    }
}
// @lc code=end

