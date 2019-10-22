/*
 * @lc app=leetcode id=111 lang=java
 *
 * [111] Minimum Depth of Binary Tree
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
    public int minDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        int l = minDepth(root.left);
        int r = minDepth(root.right);
        if( l == 0){
            return 1 + r;
        }
        if( r == 0){
            return 1 + l;
        }
        return 1 + Math.min(l, r);
        
    }
}
// @lc code=end

