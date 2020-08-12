import java.util.LinkedList;
import java.util.List;

/*
 * @lc app=leetcode id=94 lang=java
 *
 * [94] Binary Tree Inorder Traversal
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
    
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> Res = new LinkedList<>();
        if(root == null){
            return Res;
        } 
        List<Integer> leftList = inorderTraversal(root.left);
        List<Integer> rightList = inorderTraversal(root.right);
        
        if(leftList != null){
            Res.addAll(leftList);
        }
        Res.add(root.val);
        if(rightList != null){
            Res.addAll(rightList);
        }
        return Res;
    }
}
// @lc code=end

