/*
 * @lc app=leetcode id=299 lang=java
 *
 * [299] Bulls and Cows
 */

// @lc code=start
class Solution {
    public String getHint(String secret, String guess) {
        char[] secrets = secret.toCharArray();
        char[] guesses = guess.toCharArray();
        int[] nums = new int[10];
        int A = 0;
        int B = 0;
        for(int i = 0 ; i < secrets.length; i ++){
            if(secrets[i] == guesses[i]){
                A ++;
            }
            nums[secrets[i] - '0'] ++;
        }
        
        for(char c : guesses){
            if(nums[c - '0'] > 0){
                B ++;
                nums[c - '0'] --;
            }
        }
        int x = B - A;
        return ""+A+'A'+x+'B';
    }
}
// @lc code=end

