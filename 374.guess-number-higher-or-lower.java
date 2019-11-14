/*
 * @lc app=leetcode id=374 lang=java
 *
 * [374] Guess Number Higher or Lower
 */

// @lc code=start
/* The guess API is defined in the parent class GuessGame.
   @param num, your guess
   @return -1 if my number is lower, 1 if my number is higher, otherwise return 0
      int guess(int num); */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int head = 1;
        int tail = n;
        int mid = head + (tail - head) / 2;
        while(head <= tail){
            mid = head + (tail - head) / 2;
            if(guess(mid) == 0)  return mid;
            if(guess(mid) > 0)  head = mid + 1;
            if(guess(mid) < 0)  tail = mid - 1;
        }

        return mid;
        
    }
}
// @lc code=end

