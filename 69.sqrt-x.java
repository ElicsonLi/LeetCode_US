import java.text.BreakIterator;

/*
 * @lc app=leetcode id=69 lang=java
 *
 * [69] Sqrt(x)
 */

// @lc code=start
class Solution {
    public int mySqrt(int x) {
        if(x == 0 || x == 1) return x;
        int head = 1;
        int tail = x -1;
        int mid = (head + tail) / 2;
        while(head < tail){
            if(x / mid > mid) head = mid + 1;
            if(x / mid < mid) tail = mid - 1;
            if(x / mid == mid)  break; 
            mid = (head + tail) / 2;
        }
        if(mid * mid <= x){
            return mid;
        }else{
            return mid - 1;
        }
        
    }
}
// @lc code=end

