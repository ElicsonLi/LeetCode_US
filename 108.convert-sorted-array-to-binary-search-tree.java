/*
 * @lc app=leetcode id=108 lang=java
 *
 * [108] Convert Sorted Array to Binary Search Tree
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
    public TreeNode sortedArrayToBST(int[] nums) {
        return helperSortedArrayToBST(nums, 0, nums.length - 1);
        
    }

    private TreeNode helperSortedArrayToBST(int[] nums, int begin, int end) {
        if(begin > end){
            return null;
        }
        int mid = (end + begin)/2;
        int root = nums[mid];
        TreeNode tn = new TreeNode(root);
        tn.left = helperSortedArrayToBST(nums, begin, mid - 1);
        tn.right = helperSortedArrayToBST(nums, mid + 1, end);
        return tn;
        
    }
}
// @lc code=end

