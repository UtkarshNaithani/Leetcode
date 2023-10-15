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
    public ListNode reverseList(ListNode head) {
        
        if(head==null || head.next==null) return head;
        
        ListNode c=head,p=null,n=c.next;
        
        while(n!=null){
            c.next=p;
            p=c;
            c=n;
            n=n.next;
        }
        
        c.next=p;
        
        return c;
        
        
    }
}