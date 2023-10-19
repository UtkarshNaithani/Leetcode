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
    public boolean isPalindrome(ListNode head) {
        if(head==null || head.next==null) return true;
        
        ListNode st=head,f=head,s=head;
        
     //to find the middle node 
        while(f!=null && f.next!=null){ 
            s=s.next;
            f=f.next.next;
        }
        
        ListNode curr=s,prev=null,nex=null;
        
        //reverse connection from middle point onwards
        while(curr!=null){
            nex=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nex;
        }
        
        //check palindrome
        while(prev!=null){
            if(st.val!=prev.val) return false;
            
            st=st.next;
            prev=prev.next;
        }
        
        return true;
        
        
        
    }
}