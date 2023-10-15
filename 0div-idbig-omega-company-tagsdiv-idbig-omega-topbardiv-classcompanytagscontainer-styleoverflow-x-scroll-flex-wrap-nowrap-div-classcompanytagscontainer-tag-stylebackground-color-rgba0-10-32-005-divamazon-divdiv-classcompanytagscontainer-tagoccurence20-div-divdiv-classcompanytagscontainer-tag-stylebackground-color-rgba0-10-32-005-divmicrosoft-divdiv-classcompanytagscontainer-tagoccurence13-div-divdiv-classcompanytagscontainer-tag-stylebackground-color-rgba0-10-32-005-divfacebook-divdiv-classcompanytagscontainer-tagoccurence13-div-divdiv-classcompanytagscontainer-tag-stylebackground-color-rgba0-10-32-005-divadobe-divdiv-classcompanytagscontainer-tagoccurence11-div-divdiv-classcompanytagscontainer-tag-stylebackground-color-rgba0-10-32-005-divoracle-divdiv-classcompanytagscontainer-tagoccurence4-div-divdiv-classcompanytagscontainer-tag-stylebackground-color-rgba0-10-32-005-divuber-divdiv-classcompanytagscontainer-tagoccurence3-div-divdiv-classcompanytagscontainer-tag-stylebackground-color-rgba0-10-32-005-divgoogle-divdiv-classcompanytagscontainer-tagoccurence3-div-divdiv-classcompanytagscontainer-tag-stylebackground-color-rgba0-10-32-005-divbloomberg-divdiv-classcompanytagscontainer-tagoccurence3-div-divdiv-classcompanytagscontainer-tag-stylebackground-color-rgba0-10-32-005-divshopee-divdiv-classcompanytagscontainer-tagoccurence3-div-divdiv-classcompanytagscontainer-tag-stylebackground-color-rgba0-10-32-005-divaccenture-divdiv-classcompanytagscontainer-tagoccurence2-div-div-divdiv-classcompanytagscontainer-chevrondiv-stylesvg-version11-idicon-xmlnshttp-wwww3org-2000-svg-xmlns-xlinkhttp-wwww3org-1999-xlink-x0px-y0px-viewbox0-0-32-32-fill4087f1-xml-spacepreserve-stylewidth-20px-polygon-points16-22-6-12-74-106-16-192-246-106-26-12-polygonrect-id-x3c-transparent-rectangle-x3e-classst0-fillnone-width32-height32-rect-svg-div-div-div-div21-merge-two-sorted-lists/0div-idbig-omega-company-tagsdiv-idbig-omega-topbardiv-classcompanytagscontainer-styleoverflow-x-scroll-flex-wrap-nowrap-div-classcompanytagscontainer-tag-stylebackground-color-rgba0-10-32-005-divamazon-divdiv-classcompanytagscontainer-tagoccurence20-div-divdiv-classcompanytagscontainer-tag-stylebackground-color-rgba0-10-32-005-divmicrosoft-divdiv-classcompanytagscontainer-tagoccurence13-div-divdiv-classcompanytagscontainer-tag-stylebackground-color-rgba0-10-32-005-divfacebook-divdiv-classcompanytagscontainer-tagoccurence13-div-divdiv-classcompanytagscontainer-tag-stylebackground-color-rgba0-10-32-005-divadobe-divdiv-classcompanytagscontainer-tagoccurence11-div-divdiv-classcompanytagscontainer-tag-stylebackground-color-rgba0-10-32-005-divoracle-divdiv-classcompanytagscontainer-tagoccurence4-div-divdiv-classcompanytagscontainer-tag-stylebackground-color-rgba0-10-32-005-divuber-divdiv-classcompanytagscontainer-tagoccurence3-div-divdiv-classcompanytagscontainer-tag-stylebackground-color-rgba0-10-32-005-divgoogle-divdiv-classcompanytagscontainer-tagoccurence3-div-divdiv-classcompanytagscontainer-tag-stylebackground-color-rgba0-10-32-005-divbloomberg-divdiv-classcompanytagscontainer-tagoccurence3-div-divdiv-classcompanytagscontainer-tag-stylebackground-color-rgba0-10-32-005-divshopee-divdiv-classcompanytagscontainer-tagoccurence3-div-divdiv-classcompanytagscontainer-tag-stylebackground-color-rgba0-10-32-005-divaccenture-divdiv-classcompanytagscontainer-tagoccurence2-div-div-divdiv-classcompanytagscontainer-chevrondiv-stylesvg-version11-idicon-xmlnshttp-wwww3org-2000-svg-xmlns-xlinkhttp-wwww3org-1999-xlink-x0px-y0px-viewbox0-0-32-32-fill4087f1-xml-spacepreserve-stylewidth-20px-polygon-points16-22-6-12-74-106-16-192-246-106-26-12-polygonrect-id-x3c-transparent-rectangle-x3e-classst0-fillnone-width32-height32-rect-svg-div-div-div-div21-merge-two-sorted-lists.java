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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
       
       if(list1==null && list2==null)
           return null;
        
        if(list1==null) return list2;
        
          if(list2==null) return list1;
       
        ListNode head=null,dummy=null;
        
        while(list1!=null && list2!=null){
            if(list1.val<list2.val){
                  if(head==null && dummy==null){
                     dummy=list1;
                      head=dummy;
                      list1=list1.next;
                }
                else{
                    dummy.next=list1;
                    list1=list1.next;
                    dummy=dummy.next;
                }
            }
            
            else if(list2.val<list1.val){
                  if(head==null && dummy==null){
                     dummy=list2;
                    head=dummy;
                      list2=list2.next;
                }
                else{
                    dummy.next=list2;
                    list2=list2.next;
                    dummy=dummy.next;
                }
            }
            
            else{
              
                if(head==null && dummy==null){
                     dummy=list1;
                    head=dummy;
                      list1=list1.next;
                }
                else{
                    dummy.next=list1;
                    list1=list1.next;
                    dummy=dummy.next;
                }
                
              
            }
        }
        
        while(list1!=null){
            dummy.next=list1;
            list1=list1.next;
            dummy=dummy.next;
        }
        
         
        while(list2!=null){
            dummy.next=list2;
            list2=list2.next;
            dummy=dummy.next;
        }
        
        return head;
        
    
        
    }
}