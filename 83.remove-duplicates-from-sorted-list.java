/*
 * @lc app=leetcode id=83 lang=java
 *
 * [83] Remove Duplicates from Sorted List
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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode begin = head;
        while(begin != null && begin.next != null){
            if(begin.val == begin.next.val){
                begin.next = begin.next.next;
            }else{
                begin = begin.next;
            }
        }
        return head;
    }
}
// @lc code=end

