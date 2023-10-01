//  Problem link : https://leetcode.com/problems/middle-of-the-linked-list/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode middleNode(ListNode head) {
        // Initialize two pointers: fast pointer (fp) and slow pointer (sp)
        ListNode fp = head; // Fast pointer starts at the head of the list
        ListNode sp = head; // Slow pointer starts at the head of the list
        
        // Traverse the linked list using the fast and slow pointers
        while (fp != null && fp.next != null) {
            // Move the fast pointer two steps ahead
            fp = fp.next.next;
            
            // Move the slow pointer one step ahead
            sp = sp.next;
        }
        
        // At this point, the slow pointer (sp) is at the middle node
        // because the fast pointer (fp) reached the end of the list or null.
        
        
        
        // Return the middle node (slow pointer)
        return sp;
    }
}
