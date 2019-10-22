import java.util.LinkedList;
import java.util.List;

/*
 * @lc app=leetcode id=119 lang=java
 *
 * [119] Pascal's Triangle II
 */

// @lc code=start
class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> ans = new LinkedList<>();
        LinkedList<Integer> row1 = new LinkedList<>();
        row1.add(1);
        ans.add(row1);
        for(int i = 1; i <= rowIndex; i ++){
            LinkedList<Integer> rowi = new LinkedList<>();
            List<Integer> rowi1 = ans.get(ans.size() - 1);
            rowi.add(1);
            for(int j = 1; j < i; j ++){
                rowi.add(rowi1.get(j) + rowi1.get(j - 1));
            }
            rowi.add(1);
            ans.add(rowi);
        }
        return ans.get(rowIndex);
        
    }
}
// @lc code=end

