/*
 * @lc app=leetcode id=36 lang=java
 *
 * [36] Valid Sudoku
 */

// @lc code=start
class Solution {
    public boolean isValidSudoku(char[][] board) {
        boolean ans = true;
        for(int i = 0; i < 9; i ++){
            if(!testValid(getColumn(board, i))){
                ans = false;
                break;
            }
            if(!testValid(getRow(board, i))){
                ans = false;
                break;
            }
            if(!testValid(getSubbox(board, i))){
                ans = false;
                break;
            }

        }
        return ans;
        
    }

    private boolean testValid(char[] test){
        int[] ans = new int[9];
        for(int i = 0; i < 9; i ++){
            if(test[i] <= '9' && test[i] > '0'){
                ans[test[i] - '1'] ++;
            }
        }
        for(int i : ans){
            if(i > 1) {
                return false;
            }
        }
        return true;
    }

    private char[] getRow(char[][] board, int rowNum){
        char[] test = board[rowNum];
        return test;

    } 
    private char[] getColumn(char[][] board, int columnNum){
        char[] test = new char[9];
        for(int i = 0; i < 9; i ++){
            test[i] = board[i][columnNum];
        }
        return test;
    }
    private char[] getSubbox(char[][] board, int subboxNum){
        int x = subboxNum / 3;
        int y = subboxNum % 3;
        char[] test = new char[9];
        int k = 0;
        for(int i = 0; i < 3; i ++){
            for(int j = 0; j < 3; j ++)
            {
                test[k] = board[x * 3 + i][y * 3 + j]; 
                k ++;
            }
        }
        return test; 
    }
}
// @lc code=end

