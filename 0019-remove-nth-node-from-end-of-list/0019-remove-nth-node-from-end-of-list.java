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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int size=0;
        ListNode curr=head;
        while(curr!=null){
            size++;
            curr=curr.next;
        }
         ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode prev = dummy;
        ListNode curr2 = head;
        int count=0;
        while (curr2 != null) {
            if (count==(size-n)) {
                prev.next = curr2.next;
            }
            else{
                prev=prev.next;
            }
            curr2 = curr2.next;
            count++;
        }
        return dummy.next;
    }
}