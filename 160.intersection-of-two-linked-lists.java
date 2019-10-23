import java.util.HashSet;

/*
 * @lc app=leetcode id=160 lang=java
 *
 * [160] Intersection of Two Linked Lists
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    /* hashset solution 
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        HashSet<ListNode> hs = new HashSet<>();
        if(headA == null || headB == null){
            return null;
        }
        ListNode A = headA;
        ListNode B = headB;
        ListNode ans = null;
        while(A != null || B != null){   
            if(hs.contains(A)){
                ans = A;
                break;
            }
            if(A != null){
                hs.add(A);
                A = A.next;
            }
            
            if(hs.contains(B)){
                ans = B;
                break;
            }
            if(B != null){
                hs.add(B);
                B = B.next;
            }
        }

        return ans;
    }
    */

    /**the two pointer solution
     * set from A to insection is x, 
     * set from B to insection is y,
     * set from insection to end is z,
     * then pathA = pathB = x + y + z; 
     * @param headA
     * @param headB
     * @return
     */
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode A = headA;
        ListNode B = headB;
        while(A != B){
            /*
            if(A != null){
                A = A.next;
            }else{
                A = headB;
            }
            if(B != null){
                B = B.next;
            }else{
                B = headA;
            }*/
            A = A == null ? headB : A.next;
            B = B == null ? headA : B.next; 
            
        }

        return A;        
    }
}
// @lc code=end

