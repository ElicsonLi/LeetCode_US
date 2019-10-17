/*
 * @lc app=leetcode id=9 lang=java
 *
 * [9] Palindrome Number
 */

// @lc code=start
class Solution {
    public boolean isPalindrome(int x) {
        if(x >= 0 && x < 10)  return true;
        if(x < 0 || x % 10 == 0) return false;
        int temp = 0;
        do{
            temp = temp * 10 + x % 10;
            x /= 10; 
        }while(x > temp);
        if(temp == x || temp/10 == x){
            return true;
        }
        return false;
    }
}
// @lc code=end

