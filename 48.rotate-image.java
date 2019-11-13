/*
 * @lc app=leetcode id=48 lang=java
 *
 * [48] Rotate Image
 */

class Solution {
    public void rotate(int[][] matrix) {
        for(int j = 0; j < matrix.length/2; j ++){
            helperRotate(matrix, j);
        }
        
    }


    public void helperRotate(int[][] matrix, int rownum) {
        int len = matrix.length - 1 - rownum * 2;
        int end = matrix.length - 1 - rownum;
        int[] temp = new int[len];
        for(int i = 0; i < len; i ++){
            temp[i] = matrix[rownum][rownum + 1 + i];
            matrix[rownum][rownum + 1 + i] = matrix[end - 1 - i][rownum];
            matrix[end - 1 - i][rownum] = matrix[end][end - 1 - i];
            matrix[end][end - 1 - i] = matrix[rownum + 1 + i][end];
            matrix[rownum + 1 + i][end] = temp[i];
        }
    }
}
// @lc code=end
// @lc code=end

