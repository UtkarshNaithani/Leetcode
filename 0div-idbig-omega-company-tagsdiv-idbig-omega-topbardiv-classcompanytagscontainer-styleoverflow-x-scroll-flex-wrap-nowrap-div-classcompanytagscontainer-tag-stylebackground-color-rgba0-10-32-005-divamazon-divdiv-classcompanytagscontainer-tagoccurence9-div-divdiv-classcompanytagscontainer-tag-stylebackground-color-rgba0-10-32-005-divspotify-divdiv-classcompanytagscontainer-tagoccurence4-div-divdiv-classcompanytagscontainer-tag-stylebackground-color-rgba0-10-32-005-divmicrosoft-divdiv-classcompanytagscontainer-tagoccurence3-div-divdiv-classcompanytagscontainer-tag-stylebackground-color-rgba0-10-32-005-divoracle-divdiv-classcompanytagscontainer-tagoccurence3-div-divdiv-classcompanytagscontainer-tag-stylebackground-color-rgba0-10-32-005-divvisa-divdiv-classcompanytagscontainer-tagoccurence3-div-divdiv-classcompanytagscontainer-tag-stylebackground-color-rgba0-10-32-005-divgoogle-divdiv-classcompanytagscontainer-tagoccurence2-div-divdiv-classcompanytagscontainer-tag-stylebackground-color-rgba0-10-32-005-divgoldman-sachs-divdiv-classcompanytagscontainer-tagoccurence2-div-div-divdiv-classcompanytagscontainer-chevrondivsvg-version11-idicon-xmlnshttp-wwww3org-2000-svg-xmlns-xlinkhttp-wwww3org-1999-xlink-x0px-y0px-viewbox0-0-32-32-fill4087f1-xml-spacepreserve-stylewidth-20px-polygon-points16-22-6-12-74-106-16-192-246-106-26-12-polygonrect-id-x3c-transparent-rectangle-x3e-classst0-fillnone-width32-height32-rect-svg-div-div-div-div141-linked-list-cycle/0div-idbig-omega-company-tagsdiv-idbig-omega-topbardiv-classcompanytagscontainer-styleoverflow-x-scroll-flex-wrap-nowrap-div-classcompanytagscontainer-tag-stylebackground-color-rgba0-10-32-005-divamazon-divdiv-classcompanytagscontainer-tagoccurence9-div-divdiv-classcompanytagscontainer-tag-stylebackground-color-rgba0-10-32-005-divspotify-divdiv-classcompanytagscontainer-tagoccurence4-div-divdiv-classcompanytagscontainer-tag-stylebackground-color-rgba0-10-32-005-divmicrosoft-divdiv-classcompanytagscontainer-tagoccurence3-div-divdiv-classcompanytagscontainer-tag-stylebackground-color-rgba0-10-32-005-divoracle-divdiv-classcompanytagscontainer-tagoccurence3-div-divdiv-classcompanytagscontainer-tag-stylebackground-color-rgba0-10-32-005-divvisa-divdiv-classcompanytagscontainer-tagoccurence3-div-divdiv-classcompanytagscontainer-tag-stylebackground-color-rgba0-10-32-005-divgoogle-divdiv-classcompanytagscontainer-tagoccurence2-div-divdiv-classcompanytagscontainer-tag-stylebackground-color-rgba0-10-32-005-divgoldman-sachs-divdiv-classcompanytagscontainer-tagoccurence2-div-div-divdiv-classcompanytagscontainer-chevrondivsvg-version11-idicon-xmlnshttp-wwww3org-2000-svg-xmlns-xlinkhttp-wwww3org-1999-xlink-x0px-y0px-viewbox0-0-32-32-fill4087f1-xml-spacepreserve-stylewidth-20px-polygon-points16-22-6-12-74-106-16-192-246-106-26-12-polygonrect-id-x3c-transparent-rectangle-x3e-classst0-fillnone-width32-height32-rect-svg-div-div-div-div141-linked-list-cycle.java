/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        
        
        if(head==null || head.next==null) return false;
        
        ListNode f=head.next,s=head;
        
        boolean flag=false;
        
        while(f!=null && f.next!=null){
            if(f==s){
                flag=true;
                break;
            }
            f=f.next.next;
            s=s.next;
        }
        
        return flag;
        
    }
}