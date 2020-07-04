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
    public ListNode partition(ListNode head, int x) {
        ListNode b_head = new ListNode(0);
        ListNode b = b_head;
        ListNode a_head = new ListNode(0);
        ListNode a = a_head;
        
        while (head != null) {
            if (head.val < x) {
                b.next = head;
                b = b.next;
            }
            else {
                a.next = head;
                a = a.next;
            }
            head = head.next;
        }
        a.next = null;
        b.next = a_head.next;
        return b_head.next;
    }
}