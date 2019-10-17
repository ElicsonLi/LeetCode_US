import java.util.ArrayList;

/*
 * @lc app=leetcode id=38 lang=java
 *
 * [38] Count and Say
 */

// @lc code=start
class Solution {
    public String countAndSay(int n) {
        if(n == 1)  return "1";
        String s = countAndSay(n-1);
        StringBuffer sb = new StringBuffer();
        char num = s.charAt(0);
        int count = 0;
        char[] chars = s.toCharArray();
        for(int i = 0; i < chars.length; i ++){
            if(chars[i] == num){
                count ++;
            }else{
                sb.append(count);
                sb.append(num);
                num = chars[i];
                count = 1;
            }
            if(i == chars.length - 1){
                    sb.append(count);
                    sb.append(num);
            }
        }
        return sb.toString();
    }
}
// @lc code=end

