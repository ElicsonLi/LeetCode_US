import java.util.LinkedList;
import java.util.List;

/*
 * @lc app=leetcode id=107 lang=java
 *
 * [107] Binary Tree Level Order Traversal II
 */

// @lc code=start
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> temp = new LinkedList<List<Integer>>();
        helperlevelOrderBottom(root, temp, 0);

        LinkedList<List<Integer>> ans = new LinkedList<List<Integer>>();
        
        for(List<Integer> k : temp){
            ans.addFirst(k);
        }
        return ans;
    }

    public List<List<Integer>> helperlevelOrderBottom(TreeNode root, List<List<Integer>> ll, int level) {
        if(root == null){
            return ll;
        }
        if(ll.size() <= level){
            ll.add(new LinkedList<Integer>());
        }
        List<Integer> temp = ll.get(level);
        temp.add(root.val);
        level ++;
        helperlevelOrderBottom(root.left, ll, level);
        helperlevelOrderBottom(root.right, ll, level);

        return ll;
        
    }
}
// @lc code=end

