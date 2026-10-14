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
    public ListNode sortList(ListNode head) {
        if(head==null){
            return head;
        }
        List<Integer> list= new ArrayList<>();
        ListNode curr=head;
        while(curr!=null){
            list.add(curr.val);
            curr=curr.next;
        }
         list.sort((a, b) -> Integer.compare(a, b));
     ListNode ans= new ListNode(list.get(0));
     ListNode tail=ans;
     ans.next=tail;
     tail.next=null;
     for(int i=1;i<list.size();i++){
       ListNode newNode= new ListNode(list.get(i));
       tail.next=newNode;
       tail=tail.next;
       newNode.next=null;
     }
     return ans;
    }
    }