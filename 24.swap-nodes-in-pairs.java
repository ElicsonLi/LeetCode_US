/*
 * @lc app=leetcode id=24 lang=java
 *
 * [24] Swap Nodes in Pairs
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode temp = head;
        ListNode first = head;
        head = head.next;
        while(temp != null && temp.next != null){
            first.next = temp.next;
            first = temp;
            temp = temp.next.next;
            first.next.next = first;
        }
        first.next = temp;
        return head;   
    }
}
// @lc code=end

