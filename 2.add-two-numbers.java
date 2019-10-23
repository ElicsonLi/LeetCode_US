/*
 * @lc app=leetcode id=2 lang=java
 *
 * [2] Add Two Numbers
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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ans = new ListNode(1);
        ListNode head = ans;
        int flag = 0;
        while(l1 != null || l2 != null || flag != 0){
            int ans1 = l1 == null ? 0 : l1.val;
            int ans2 = l2 == null ? 0 : l2.val;
            int sum = ans1 + ans2 + flag;
            ans.next = new ListNode(sum % 10);
            ans = ans.next;
            l1 = l1 == null ? l1 : l1.next;
            l2 = l2 == null ? l2 : l2.next;
            flag = sum / 10;
        }
        return head.next;
        
    }
}
// @lc code=end

