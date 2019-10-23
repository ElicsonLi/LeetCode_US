import java.util.ArrayList;

/*
 * @lc app=leetcode id=6 lang=java
 *
 * [6] ZigZag Conversion
 */

// @lc code=start
class Solution {
    public String convert(String s, int numRows) {
        if(numRows == 1){
            return s;
        }
        StringBuffer[] sb = new StringBuffer[numRows];
        for(int j = 0; j < numRows; j ++){
            sb[j] = new StringBuffer();
        }
        int i = 0;
        int count = 1;
        for(char c : s.toCharArray()){
            sb[i].append(c);
            i += count;
            if(i == numRows - 1){
                count = -1;
            }
            if(i == 0){
                count = 1;
            }
        }
        StringBuffer ans = new StringBuffer();
        for(int j = 0; j < numRows; j ++){
            ans.append(sb[j]);
        }

        return ans.toString();
        
    }
}
// @lc code=end

