import java.util.LinkedList;
import java.util.List;

/*
 * @lc app=leetcode id=22 lang=java
 *
 * [22] Generate Parentheses
 */

// @lc code=start
class Solution {
    List<String> res = new LinkedList<>();
    public List<String> generateParenthesis(int n) {
        String sb = "";
        helperGenerateParenthesis(sb, n, n);
        return res;
    }

    public void helperGenerateParenthesis(String sb, int leftn, int rightn) {
        if(rightn == 0){
        	if(leftn == 0){
        		res.add(sb);
        	}
            return;
        }
        if(rightn < leftn){
            return;
        }

        if(leftn > 0){
            helperGenerateParenthesis(sb + "(", leftn - 1, rightn);
        }
        

        if(rightn > 0){
            helperGenerateParenthesis(sb + ")", leftn, rightn - 1);
        }
        
    }
}
  
// @lc code=end

