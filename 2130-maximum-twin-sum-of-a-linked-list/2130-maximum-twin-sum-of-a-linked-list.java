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
    public int pairSum(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null&&fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        //reversing from mid so that i can traverse reverse 
        ListNode prev=null;
        ListNode curr=slow;
        ListNode next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        //finding maxsum;
        int maxsum=Integer.MIN_VALUE;
        while(prev!=null&&head!=null){
            maxsum=Math.max(maxsum,prev.val+head.val);
            prev=prev.next;
            head=head.next;
        }
        return maxsum;
    }
}