/*
 * @lc app=leetcode id=21 lang=java
 *
 * [21] Merge Two Sorted Lists
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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode ans = new ListNode(0);
        ListNode first = ans;
        while(l1 != null || l2 != null){
            if(l1 == null){
                ans.next = l2;
                break;
            }else if(l2 == null){
                ans.next = l1;
                break;
            }

            if(l1.val > l2.val){
                ans.next = l2;
                l2 = l2.next;
            }else{
                ans.next = l1;
                l1 = l1.next;
            }
            ans = ans.next;
        }
        return first.next;
    }
}
// @lc code=end

