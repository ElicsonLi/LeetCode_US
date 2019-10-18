/*
 * @lc app=leetcode id=101 lang=java
 *
 * [101] Symmetric Tree
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
    public boolean isSymmetric(TreeNode root) {
        if(root == null) return true;
        return helperIsSymmetric(root.left, root.right);
    }

    private boolean helperIsSymmetric(TreeNode rootleft, TreeNode rootright) {
        if(rootleft == null || rootright == null){
            if(rootleft == null && rootright == null){
                return true;
            }else{
                return false;
            }
        }
        return (helperIsSymmetric(rootleft.left,rootright.right) && (rootleft.val == rootright.val) && helperIsSymmetric(rootleft.right,rootright.left));  
    }
}
// @lc code=end

