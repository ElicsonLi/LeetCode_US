import java.util.LinkedList;
import java.util.Arrays;
import java.util.List;
/*
 * @lc app=leetcode id=40 lang=java
 *
 * [40] Combination Sum II
 */

// @lc code=start
class Solution {
    List<List<Integer>> res = new LinkedList<>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        LinkedList<Integer> l = new LinkedList<>();

        helperCombinationSum(candidates, target, l, candidates.length - 1);
        return res;
        
    }

    private void helperCombinationSum(int[] candidates, int target, LinkedList<Integer> l,int end) {
        if(target == 0){
        	LinkedList<Integer> ll = new LinkedList<>();
            ll.addAll(l);
            // for(List temp : res){
            //     if(ll.size() == temp.size() && ll.containsAll(temp) && temp.containsAll(ll)){
            //         return;
            //     }
            // }
            res.add(ll);
            return;
        }
        if(target < 0){
            return;
        }
        
        for(int i = end; i >= 0; i --){
            if(candidates[i] <= target){
                if(i < end && candidates[i] == candidates[i + 1] ){
                    continue;
                }
                l.add(candidates[i]);
                helperCombinationSum(candidates, target - candidates[i], l, i - 1);
                l.removeLast();
            }
        }
    }
}
// @lc code=end