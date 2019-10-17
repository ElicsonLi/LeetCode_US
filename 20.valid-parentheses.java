import java.util.LinkedList;

/*
 * @lc app=leetcode id=20 lang=java
 *
 * [20] Valid Parentheses
 */

// @lc code=start
class Solution {
    public boolean isValid(String s) {
        LinkedList<Character> ll = new LinkedList<>();
        for(char c : s.toCharArray()){
            if(ll.size() == 0){
                ll.add(c);
                continue;
            }
            if((c - ll.getLast() == 1) || (c - ll.getLast() == 2)){
                ll.removeLast();
            }else{
                ll.add(c);
            }
        }

        return (ll.size() == 0);
        
    }
}
// @lc code=end

