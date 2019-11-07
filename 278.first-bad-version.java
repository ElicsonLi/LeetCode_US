/*
 * @lc app=leetcode id=278 lang=java
 *
 * [278] First Bad Version
 */

// @lc code=start
/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int first = 1;
        int last = n;
        int mid = 1 + (n - 1) / 2;
        while(first <= last){
            if(!isBadVersion(mid)){
                first = mid + 1;
            }else{
                last = mid - 1;
            }
            mid = first + (last - first) / 2;
        }
        return first;
        
    }
}
// @lc code=end

