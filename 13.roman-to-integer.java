import java.util.HashMap;

/*
 * @lc app=leetcode id=13 lang=java
 *
 * [13] Roman to Integer
 */

// @lc code=start
class Solution {
    public int romanToInt(String s) {
        int a[] = new int[26];
        a['I' - 'A'] = 1;
        a['V' - 'A'] = 5;
        a['X' - 'A'] = 10;
        a['L' - 'A'] = 50;
        a['C' - 'A'] = 100;
        a['D' - 'A'] = 500;
        a['M' - 'A'] = 1000;
        
        char[] cs = s.toCharArray();
        int stage = a[cs[0] - 'A'];
        int ans = 0;
        for(int i = 1; i < cs.length; i ++){
            int num = a[cs[i] - 'A'];
            if(num > stage){
                ans -= stage;
            }else{
                ans += stage;
            }
            stage = num;
        }
        return ans + stage;
    }
}
// @lc code=end

