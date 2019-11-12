/*
 * @lc app=leetcode id=345 lang=java
 *
 * [345] Reverse Vowels of a String
 */

// @lc code=start
class Solution {
    public String reverseVowels(String s) {
        char[] cs = s.toCharArray();
        int i = 0;
        int j = s.length() - 1;
        while(i < j){
            if(!isVowels(cs[i])){
                i ++;
                continue;
            }
            if(!isVowels(cs[j])){
                j --;
                continue;
            }
            if(isVowels(cs[i]) && isVowels(cs[j])){
                char temp = cs[i];
                cs[i] = cs[j];
                cs[j] = temp;
                i ++;
                j --; 
            }
        }
        return new String(cs);
    }


    public boolean isVowels(char t) {
        char c = Character.toLowerCase(t);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'; 
    }
}
// @lc code=end

