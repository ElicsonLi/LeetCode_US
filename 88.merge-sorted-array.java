import java.util.ArrayList;

/*
 * @lc app=leetcode id=88 lang=java
 *
 * [88] Merge Sorted Array
 */

// @lc code=start
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0, j= 0;
        int[] ans = new int [m + n];
        int len = 0;
        while(i < m || j < n){
            if(i >= m){
                System.arraycopy(nums2, j, ans, len, n - j);
                break;
            }
            if(j >= n){
                System.arraycopy(nums1, i, ans, len, m - i);
                break;
            }
            if(nums1[i] < nums2[j]){
                ans[len ++] = nums1[i ++];
                
            }else{
                ans[len ++] = nums2[j ++];
            }
        }
        for(int k = 0; k < ans.length; k ++){
            nums1[k] = ans[k];
        }
    }
}
// @lc code=end

