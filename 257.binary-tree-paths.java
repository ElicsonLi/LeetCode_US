import java.util.LinkedList;
import java.util.List;

/*
 * @lc app=leetcode id=257 lang=java
 *
 * [257] Binary Tree Paths
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
    List<String> res = new LinkedList<>();
    public List<String> binaryTreePaths(TreeNode root) {
        StringBuffer sb = new StringBuffer();
        if(root == null){
            return res;
        }
        helperBinaryTreePaths(root, sb);
        return res;
        
    }

    private void helperBinaryTreePaths(TreeNode root,StringBuffer sb) {
        if(root.left == null && root.right == null){
            String s = "" + root.val;
            sb.append(s);
            res.add(sb.toString());
            sb.delete(sb.length() - s.length(),sb.length());
            return;
        }
        
        String s = root.val + "->";
        sb.append(s);        
        if(root.left != null){
            helperBinaryTreePaths(root.left, sb);   
        }
        
        if(root.right != null){
            helperBinaryTreePaths(root.right, sb);
            
        }
        sb.delete(sb.length() - s.length(),sb.length());
    
    }
}
// @lc code=end

