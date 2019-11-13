import java.util.ArrayList;
import java.util.Arrays;

/*
 * @lc app=leetcode id=350 lang=java
 *
 * [350] Intersection of Two Arrays II
 */

// @lc code=start
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> al = new ArrayList<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0;
        int j = 0;
        while(i < nums1.length && j < nums2.length){
            if(nums1[i] == nums2[j]){
                al.add(nums1[i]);
                i ++;
                j ++;
            }else if(nums1[i] < nums2[j]){
                i ++;
            }else if(nums1[i] > nums2[j]){
                j ++;
            }
            
        }
        int[] res = new int[al.size()];
        int k = 0;
        for(int x : al){
            res[k] = x;
            k ++;
        }
        return res;
        
    }
}
// @lc code=end

