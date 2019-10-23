/*
 * @lc app=leetcode id=141 lang=java
 *
 * [141] Linked List Cycle
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode firstpointer = head;
        ListNode secondepointer = head;
        boolean ans = false;
        while(secondepointer != null && secondepointer.next != null){
            firstpointer = firstpointer.next;
            secondepointer = secondepointer.next.next;
            if(firstpointer == secondepointer){
                ans = true;
                break;
            }
        }
        return ans; 
    }
}
// @lc code=end

