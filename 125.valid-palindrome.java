/*
 * @lc app=leetcode id=125 lang=java
 *
 * [125] Valid Palindrome
 */

// @lc code=start
class Solution {
    public boolean isPalindrome(String s) {
        boolean ans = true;
        char[] cs = s.toLowerCase().toCharArray();
        int i = 0;
        int j = cs.length - 1;
        while(i < j){
            if (cs[i] < 'a' || cs[i] > 'z'){
                if(cs[i] < '0' || cs[i] > '9'){
                    i ++;
                    continue;
                }  
            }
            if (cs[j] < 'a' || cs[j] > 'z'){
                if(cs[j] < '0' || cs[j] > '9'){
                    j --;
                    continue;
                }
            }
            if(cs[i] != cs[j])
            {
                ans = false;
                break;
            }
            i ++;
            j --;
        }
        return ans;
        
    }
}
// @lc code=end

