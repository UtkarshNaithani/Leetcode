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
    public ListNode reverseKGroup(ListNode head, int k) {
        
        if(head==null || k==1) return head;
        
        int count=0;
        ListNode temp=head;
        ListNode dum=new ListNode(0);
        dum.next=head;
        ListNode prev=dum,curr,nex;
        
        while(temp!=null){ //length of the linked list
            temp=temp.next;
            count++;
        }
        
        while(count>=k){
            curr=prev.next;
            nex=curr.next;
            
            for(int i=1;i<k;i++){ //k=2 -> 1 link change,k=3 -> 2 link change,loop for k-1 time
                curr.next=nex.next;
                nex.next=prev.next;
                prev.next=nex;
                nex=curr.next;
            }
            prev=curr;
            count-=k;
            
        }
        
        return dum.next;
        
    }
}