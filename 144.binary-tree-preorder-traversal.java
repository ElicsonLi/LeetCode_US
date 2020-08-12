/*
 * @lc app=leetcode id=144 lang=java
 *
 * [144] Binary Tree Preorder Traversal
 */

// @lc code=start
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> Res = new LinkedList<>();
        if(root == null){
            return Res;
        } 
        List<Integer> leftList = preorderTraversal(root.left);
        List<Integer> rightList = preorderTraversal(root.right);
        Res.add(root.val);
        if(leftList != null){
            Res.addAll(leftList);
        }
        if(rightList != null){
            Res.addAll(rightList);
        }
        return Res;
    }
}
// @lc code=end

