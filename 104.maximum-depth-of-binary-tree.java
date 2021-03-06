/*
 * @lc app=leetcode id=104 lang=java
 *
 * [104] Maximum Depth of Binary Tree
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
    int depth = 0;
    public int maxDepth(TreeNode root) {
        return helperMaxDepth(0, root);
    }

    private int helperMaxDepth(int currentDepth, TreeNode root) {
        if(root == null){
            return currentDepth; 
        }

        currentDepth ++;
        return Math.max(helperMaxDepth(currentDepth,root.left), helperMaxDepth(currentDepth,root.right));
        
    }
}
// @lc code=end

