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
    public int getDecimalValue(ListNode head) {
        ListNode curr=head;
        int ans=0;
        int si=0;
        while(curr!=null){
          si++;
          curr=curr.next;
        }
        
        ListNode curr2=head;
        while(curr2!=null){
            ans=ans+curr2.val*(int)Math.pow(2,si-1);
            si--;
            curr2=curr2.next;
        }
        return ans;
    }
}