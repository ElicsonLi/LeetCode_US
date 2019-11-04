/*
 * @lc app=leetcode id=203 lang=java
 *
 * [203] Remove Linked List Elements
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
    public ListNode removeElements(ListNode head, int val) {
        ListNode current = head;
        ListNode sentinel = new ListNode(1);
        sentinel.next = head;
        ListNode pre = sentinel;
        while(current != null){
            if(current.val == val){
                current = current.next;
                pre.next = current;
            }else{
                current = current.next;
                pre = pre.next;
            }  
        }

        return sentinel.next;
    }
}
// @lc code=end

