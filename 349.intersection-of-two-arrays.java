import java.util.Arrays;
import java.util.HashSet;

/*
 * @lc app=leetcode id=349 lang=java
 *
 * [349] Intersection of Two Arrays
 */

// @lc code=start
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> hs = new HashSet<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0;
        int j = 0;
        while(i < nums1.length && j < nums2.length){
            if(nums1[i] == nums2[j]){
                hs.add(nums1[i]);
                i ++;
                j ++;
            }else if(nums1[i] < nums2[j]){
                i ++;
            }else if(nums1[i] > nums2[j]){
                j ++;
            }
            
        }
        
        int[] res = new int[hs.size()];
        int count = 0;
        for(int x : hs){
            res[count] = x;
            count ++; 
        }
        return res;
    }
}
// @lc code=end

