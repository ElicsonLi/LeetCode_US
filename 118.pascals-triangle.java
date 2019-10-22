import java.util.LinkedList;
import java.util.List;

/*
 * @lc app=leetcode id=118 lang=java
 *
 * [118] Pascal's Triangle
 */

// @lc code=start
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new LinkedList<List<Integer>> ();
        if(numRows == 0){
            return ans;
        }
        LinkedList<Integer> row1 = new LinkedList<>();
        row1.add(1);
        ans.add(row1);
        for(int i = 1; i < numRows; i ++){
            LinkedList<Integer> rowi = new LinkedList<>();
            List<Integer> rowi1 = ans.get(ans.size() - 1);
            rowi.add(1);
            for(int j = 1; j < i; j ++){
                rowi.add(rowi1.get(j) + rowi1.get(j - 1));
            }
            rowi.add(1);
            ans.add(rowi);
        }

        return ans;  
    }
}
// @lc code=end

