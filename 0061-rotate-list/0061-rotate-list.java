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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null||head.next==null||k==0){
            return head;
        }
        ListNode curr=head;
        ListNode prev2=new ListNode(-101);
        prev2.next=curr;
        int size=0;
        while(curr!=null){
            size++;
            curr=curr.next;
            prev2=prev2.next;
        }
        
        ListNode curr2=head;
        ListNode prev=new ListNode(-1001);
        prev.next=curr2;
        ListNode next;
        int i=0;
        k=k%(size);
        if(k%size==0){
            return head;
        }
        while(i<(size-k)){
            prev.next=curr2;
            curr2=curr2.next;
            prev=prev.next;
            i++;
        }
        prev2.next=head;
        prev.next=null;
         return curr2;
    }
}