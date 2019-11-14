/*
 * @lc app=leetcode id=367 lang=java
 *
 * [367] Valid Perfect Square
 */

// @lc code=start
class Solution {
    public boolean isPerfectSquare(int num) {
        int head = 1;
        int tail = num;
        int mid = head + (tail - head) / 2;
        while(head <= tail){
        	mid = head + (tail - head) / 2;
            if(mid > num / mid)  tail = mid - 1;
            if(mid < num / mid)  head = mid + 1;
            if(mid == num / mid)  break;
        }

        return mid * mid == num;
    }
}
// @lc code=end

