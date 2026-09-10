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
    public ListNode removeElements(ListNode head, int val) {
        // Step 1: Initialize dummy node
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        
        ListNode curr = dummy;
        // Step 2: Traverse the list looking one step ahead
        while (curr.next != null) {
            if (curr.next.val == val) {
                curr.next = curr.next.next;  // Skip the node matching val
            } else {
                curr = curr.next;  // Move pointer forward
            }
        }
        return dummy.next;
    }
}
