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
    public ListNode removeNodes(ListNode head) {
        ListNode prev=null;
        ListNode curr=head;
        ListNode next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
           prev=curr; 
           curr=next; 
        }
        int maxseensofar=0;
        ListNode dummy=new ListNode(-1);
        dummy.next=prev;
        ListNode prev3=dummy;
        while(prev!=null){
           if(prev.val<maxseensofar){
                prev3.next=prev.next;
                prev=prev.next;
            }
            else
            {
                maxseensofar=Math.max(maxseensofar,prev.val);
                prev=prev.next;
                prev3=prev3.next;
            }
        }
        ListNode prev2=null;
        ListNode curr2=dummy.next;
        ListNode next2;
        while(curr2!=null){
            next2=curr2.next;
            curr2.next=prev2;
           prev2=curr2; 
           curr2=next2; 
        }
        return prev2;
    }
}