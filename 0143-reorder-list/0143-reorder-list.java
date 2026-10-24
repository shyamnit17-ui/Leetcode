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
    public void reorderList(ListNode head) {
         //findmid
        ListNode slow=head;
        ListNode fast=head.next;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode mid=slow;
        //reversing a half linkedlist;
        ListNode curr=mid.next;
        mid.next=null;
        ListNode prev=null;
        ListNode next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        //merging
        ListNode right=prev;
        ListNode nextR,nextL;
        while(head!=null&&right!=null){
            nextL=head.next;
            head.next=right;
            nextR=right.next;
            right.next=nextL;
            head=nextL;
            right=nextR;
        }
    }
}