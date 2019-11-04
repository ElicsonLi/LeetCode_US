/*
 * @lc app=leetcode id=12 lang=java
 *
 * [12] Integer to Roman
 */

// @lc code=start
class Solution {
    public String intToRoman(int num) {
        char[] cs = {'I','V','X','L','C','D','M'};
        StringBuffer sb = new StringBuffer();
        int digit = 0;
        int temp = num;
        while(temp > 0){
            int ans = temp % 10;
            int ans5 = ans / 5;
            switch (ans%5){
                case 0:
                break;
                case 1:
                sb.append(cs[digit]);
                break;
                case 2:
                sb.append(cs[digit]);
                sb.append(cs[digit]);
                break;
                case 3:
                sb.append(cs[digit]);
                sb.append(cs[digit]);
                sb.append(cs[digit]);
                break;
                case 4:
                if(ans5 > 0) sb.append(cs[digit + 2]);
                else sb.append(cs[digit + 1]);
                sb.append(cs[digit]);
                break;
            }
             switch (ans5){
                case 0:
                break;
                case 1:
                if(ans%5 == 4) break;
                sb.append(cs[digit + 1]);
                break;
            }
            temp = temp/10;
            digit += 2;
        }
        return sb.reverse().toString();
    }
}
// @lc code=end

