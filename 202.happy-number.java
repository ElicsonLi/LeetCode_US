import java.util.HashSet;

/*
 * @lc app=leetcode id=202 lang=java
 *
 * [202] Happy Number
 */

// @lc code=start
class Solution {
    // HashSet<Integer> hs = new HashSet<>();
    // public boolean isHappy(int n) {
    //     int res = 0;
    //     while(n != 0){
    //         int digit = n % 10;
    //         res += digit * digit;
    //         n /= 10;
    //     }
    //     if(hs.contains(res))  return false;
    //     hs.add(res);
    //     return (res == 1) || isHappy(res);
    // }

        public boolean isHappy(int n) {
            HashSet<Integer> set = new HashSet<Integer>();
            set.add(n);
            while (n != 1) {
                int result = 0;
                while (n != 0) {
                    result += Math.pow(n % 10, 2);
                    n /= 10;
                }
                if (set.contains(result)) {
                    return false;
                }
                set.add(result);
                n = result;
            }
            return true;
        }
}
// @lc code=end

