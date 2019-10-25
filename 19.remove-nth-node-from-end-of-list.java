/*
 * @lc app=leetcode id=19 lang=java
 *
 * [19] Remove Nth Node From End of List
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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(n == 0){
            return head.next;
        }
        ListNode sentinel = new ListNode(5);
        sentinel.next = head;
        ListNode temp = head;
        ListNode begin = sentinel;
        int i = 0;
        while(temp != null && i <  n){
            temp = temp.next;
            i ++;
        }
        while(temp != null){
            begin = begin.next;
            temp = temp.next;
        }
        if(begin != null && begin.next != null){
            begin.next = begin.next.next;
        }
        return sentinel.next;     
    }
}
// @lc code=end

