import java.util.HashSet;

/*
 * @lc app=leetcode id=290 lang=java
 *
 * [290] Word Pattern
 */

// @lc code=start
class Solution {
    public boolean wordPattern(String pattern, String str) {
        String[] map = new String[26];
        String[] s = str.split(" ");
        HashSet<String> hs = new HashSet<>();
        boolean ans = true;
        if(pattern.length() != s.length){
            return false;
        }
        for(int i = 0; i < pattern.length(); i ++){
            if(map[pattern.charAt(i) - 'a'] == null){
                if(hs.contains(s[i])){
                    ans = false;
                    break;
                }
                map[pattern.charAt(i) -'a'] = s[i];
                hs.add(s[i]); 
            }else if(!map[pattern.charAt(i) - 'a'].equals(s[i])){
                ans = false;
                break;
            }
        }

        return ans;
        
    }
}
// @lc code=end

