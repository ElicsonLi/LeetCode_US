import java.util.LinkedList;
import java.util.Arrays;
import java.util.List;

/*
 * @lc app=leetcode id=39 lang=java
 *
 * [39] Combination Sum
 */

// @lc code=start
class Solution {
    List<List<Integer>> res = new LinkedList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        LinkedList<Integer> l = new LinkedList<>();
      
        helperCombinationSum(candidates, target, l, candidates.length - 1);
        return res;
        
    }

    private void helperCombinationSum(int[] candidates, int target, LinkedList<Integer> l,int end) {
        if(target == 0){
        	LinkedList<Integer> ll = new LinkedList<>();
        	ll.addAll(l);
            res.add(ll);
            return;
        }
        if(target < 0){
            return;
        }
        
        for(int i = end; i >= 0; i --){
            if(candidates[i] <= target){
                l.add(candidates[i]);
                helperCombinationSum(candidates, target - candidates[i], l, i);
                l.removeLast();
            }
        }
    }
}
// @lc code=end

