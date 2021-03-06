import java.util.HashMap;

/*
 * @lc app=leetcode id=205 lang=java
 *
 * [205] Isomorphic Strings
 */

// @lc code=start
class Solution {
    public boolean isIsomorphic(String s, String t) {
        // char[] cs = s.toCharArray();
        // char[] ts = t.toCharArray();
        // if(cs.length != ts.length){
        //     return false;
        // }
        // boolean ans = true;
        // HashMap<Character, Character> hm = new HashMap<>();
        // for(int i = 0; i < cs.length; i ++){
        //     if(hm.containsKey(cs[i])){
        //         if(ts[i] != hm.get(cs[i])){
        //             ans = false;
        //             break;
        //         }
        //     }else if(hm.containsValue(ts[i])){
        //         if(!hm.containsKey(cs[i]) || ts[i] != hm.get(cs[i])){
        //             ans = false;
        //             break;
        //         }
        //     }else{
        //         hm.put(cs[i], ts[i]);
        //     }
           
        // }
        // return ans;
        int[] is = new int[256];
        int[] it = new int[256];
        for(int i = 0; i < s.length(); i ++){
            if(is[s.charAt(i)] != it[t.charAt(i)])  return false;
            is[s.charAt(i)] = i + 1;
            it[t.charAt(i)] = i + 1;
        }

        return true;
        
    }
}
// @lc code=end

