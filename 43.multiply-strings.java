import java.util.ArrayList;

/*
 * @lc app=leetcode id=43 lang=java
 *
 * [43] Multiply Strings
 */

// @lc code=start
class Solution {
    public String multiply(String num1, String num2) {
        /** the origin thought
         *  dont have enough understanding for prodcut
         */
        /*
        int[][] temps = new int[num2.length()][num1.length() + 1];
        for(int i = 0; i < num2.length(); i ++){
            int digit = 0;
            for(int j = 0; j < num1.length(); j ++){
                int x = (num2.charAt(num2.length() - 1 - i) - '0') * (num1.charAt(num1.length() - 1 -j) - '0') + digit;
                temps[i][j] = x % 10;
                digit = x /10;
            }
            temps[i][num1.length()] = digit;
        }
        StringBuffer sb = new StringBuffer();
        for(int i = 1; i < num2.length(); i ++)
        {
            sb.append(""+temps[i-1][0]);
            int digit = 0;
            for(int j = 0; j < num1.length() ; j++){
            	int x = temps[i][j] + temps[i-1][j + 1] + digit;
                temps[i][j] = x % 10;
                digit = x / 10;
            }
            temps[i][num1.length()] += digit;
        }
        for(int k = 0; k < temps[num2.length() - 1].length; k ++){
            sb.append(""+temps[num2.length() - 1][k]);
        }
        sb = sb.reverse();
        while(sb.length() != 1 && sb.charAt(0) == '0')  sb.deleteCharAt(0);
        return sb.toString();
        */
        int[] res = new int [num1.length() + num2.length() + 1];
        for(int i = num1.length() - 1; i >= 0; i --){
            for(int j = num2.length() - 1; j >= 0; j --){
                int pos = i + j;
                int temp = (num1.charAt(i) - '0') * (num2.charAt(j) - '0') + res[pos + 1];
                
                res[pos] += temp / 10;
                res[pos + 1] =  temp % 10;
            }
        }
        int begin = 0;
        while(begin < res.length && res[begin] == 0){
            begin ++;
        }
        if(begin == res.length){
            return "0";
        }
        StringBuffer sb = new StringBuffer();
        for(int i = begin; i < res.length - 1; i ++){
            sb.append("" + res[i]);
        }

        return sb.toString();
        
    }
}
// @lc code=end

