/*
 * @lc app=leetcode id=110 lang=java
 *
 * [110] Balanced Binary Tree
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
    boolean flag = true;
    public boolean isBalanced(TreeNode root) {
        depth(root);
        return flag;
    }

    private int depth(TreeNode root) {
        if(root == null){
            return 0;
        }
        int l = depth(root.left);
        int r = depth(root.right);
        if(Math.abs(l - r) > 1){
            flag = false;
        }

        return 1 + Math.max(l, r);
        
    }
}
// @lc code=end

