import java.util.LinkedList;
import java.util.List;

/*
 * @lc app=leetcode id=54 lang=java
 *
 * [54] Spiral Matrix
 */

// @lc code=start
class Solution {
    List<Integer> res = new LinkedList<>();
    public List<Integer> spiralOrder(int[][] matrix) {
        if(matrix.length == 0)  return res;
    	int t = Math.min(matrix[0].length,matrix.length);
    	int count = t % 2 == 0 ? t / 2 : t / 2 + 1;
        for(int i = 0; i < count; i ++){
            helperSpiralOrder(res, matrix, i);
        }
        return res;
        
    }

    public void helperSpiralOrder(List<Integer> l,int[][] matrix,int x) {
        int len = matrix[0].length;
        int width = matrix.length;
        for(int i = x; i < len - x; i ++){
            l.add(matrix[x][i]);
        }
        for(int i = x + 1; i < width - 1 - x; i ++ ){
            l.add(matrix[i][len - 1 - x]);
        }
        if(x != width - 1 - x){
            for(int i = len - 1 - x; i >= x; i --){
                l.add(matrix[width - 1 - x][i]);
            }
        }
        if(x != len - 1 - x){
            for(int i = width - 2 - x; i > x; i --){
                l.add(matrix[i][x]);
            }
        }
        
    }
}
// @lc code=end

