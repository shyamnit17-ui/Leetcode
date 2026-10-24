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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode curr=head;
        int n=0;
        while(curr!=null){
            n++;
            curr=curr.next;
        }
        int val1=0;
        int val2=0;
        int i=0;
        ListNode curr2=head;
        while(curr2!=null){
            if(i==k-1){
                val1=curr2.val;
            }
            if(i==n-k){
                val2=curr2.val;
            }
            curr2=curr2.next;
            i++;
        }
        int j=0;
        ListNode curr3=head;
        ListNode temp=curr3;
        while(curr3!=null){
            if(j==k-1){
                curr3.val=val2;
            }
            if(j==n-k){
                curr3.val=val1;
            }
            curr3=curr3.next;
            j++;
        }
        return temp;
    }
}