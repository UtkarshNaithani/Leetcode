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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int ctr=0;
        
        if(head.next==null && n==1) return head.next;
        
        ListNode temp=head;
        
        while(temp!=null){
            ctr++;
            temp=temp.next;
        }
        
        int till=ctr-n;
        
        if(till==0) return head.next;
        
        ctr=0;
        ListNode t=head;
        
        while(ctr!=till-1){
            ctr++;
            t=t.next;
        }
        
        t.next=t.next.next;
        return head;
    }
}