/*
 * @lc app=leetcode id=112 lang=java
 *
 * [112] Path Sum
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
    public boolean hasPathSum(TreeNode root, int sum) {
        if(root == null){
            return false;
        }
    
        return helperhasPathSum(root, sum);       
    }

    private boolean helperhasPathSum(TreeNode root, int sum) {
        if(root.left == null && root.right == null){
            return sum == root.val;
        }
        if(root.left == null){
            return helperhasPathSum(root.right, sum - root.val);
        }
        if(root.right == null){
            return helperhasPathSum(root.left, sum - root.val);
        }
    
        return helperhasPathSum(root.left, sum - root.val) || helperhasPathSum(root.right, sum - root.val);
        
    }
}
// @lc code=end

