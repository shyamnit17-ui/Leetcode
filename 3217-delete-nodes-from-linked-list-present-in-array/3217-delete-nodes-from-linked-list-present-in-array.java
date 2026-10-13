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
    public ListNode modifiedList(int[] nums, ListNode head) {
        ListNode curr=head;
        ListNode dummy=new ListNode(-1);
        dummy.next=head;
        HashSet<Integer> set= new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        ListNode prev = dummy;
  
        
        while (curr != null) {
            if (set.contains(curr.val)) {
                prev.next = curr.next;
            }
            else{
                prev=prev.next;
            }
            curr = curr.next;
        }
        
        return dummy.next;
    }
}