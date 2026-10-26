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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        int i = 1;
        ListNode curr = head;
        ListNode prev = new ListNode(-1);
        ListNode dummy= new ListNode(-1);
        dummy.next=prev;
        prev.next = curr;
        while (i < left) {
            i++;
            curr = curr.next;
            prev = prev.next;
        }
        ListNode prev2 = null;
        ListNode curr2 = curr;
        ListNode temp2 = curr;
        while (i <= right) {
            temp2 = curr2.next;
            curr2.next = prev2;
            prev2 = curr2;
            curr2 = temp2;
            i++;
        }
        prev.next = prev2; 
        curr.next = curr2; 
        return dummy.next.next;
    }
}