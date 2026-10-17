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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {    
    ListNode copy1=l1;
    ListNode copy2=l2;
    ListNode dummy=new ListNode(-1);
    ListNode curr=dummy;
    int carry=0;
    while(copy1!=null||copy2!=null||carry!=0){
      int sum=(copy1 != null ? copy1.val : 0)+(copy2 != null ? copy2.val : 0)+carry;
      ListNode sh=new ListNode(sum%10);
      curr.next=sh;
      sum/=10;
      carry=sum%10;
      if(copy1!=null){
        copy1=copy1.next;
      }
      if(copy2!=null){
           copy2=copy2.next;
      }
      curr=curr.next;
    }
    if(carry!=0){
         ListNode newnode= new ListNode(carry);
        curr.next=newnode;
        newnode.next=null;
    }
     return dummy.next;
    }
}