import java.util.ArrayList;
import java.util.LinkedList;

/*
 * @lc app=leetcode id=234 lang=java
 *
 * [234] Palindrome Linked List
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
    public boolean isPalindrome(ListNode head) {
        /** use O(N) memoery
         *  can be fastened
         */
        /*
        ListNode first = head;
        boolean ans = true;
        int size = 0;
        while(first != null){
            size ++;
            first = first.next;
        }
        int[] nums = new int[size];
        int i = 0;
        while(i < size){
            nums[i++] = head.val;
            head = head.next;
        }
        for(int j = 0; j < size/2; j++){
            if(nums[j] != nums[size -1- j]){
                ans = false;
                break;
            }
        }
        return ans;
        */

        if(head == null || head.next == null){
            return true;
        }
        ListNode two_mid = head;
        ListNode mid = head;
        ListNode mid_next = head.next;
        ListNode mid_ahead = head;
        boolean ans = true;
        while(two_mid.next != null && two_mid.next.next != null){
            mid_ahead = mid;
            mid = mid_next;
            mid_next = mid.next;
            two_mid = two_mid.next.next;
            mid.next = mid_ahead;
        }
        if(two_mid.next == null){
            mid = mid.next;
        }
        while(mid_next != null){
            if(mid.val != mid_next.val){
                ans = false;
                break;
            }
            mid = mid.next;
            mid_next = mid_next.next;
        }

        return ans;
        
    }
}
// @lc code=end

