public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        
        int len1 = 0,len2 = 0;
    
        
        ListNode ptr1 = headA , ptr2 = headB;
        
        while(ptr1 != null){
            len1++;
            ptr1 = ptr1.next;
        }
        
        while(ptr2 != null){
            len2++;
            ptr2 = ptr2.next;
        }
        
              
        ptr1 = headA;
        ptr2 = headB;
        
        
        if(len1 == 0)   return ptr2;
        
        if(len2 == 0)   return ptr1;
        
        
        if(len1 == 1 && len2 == 1){
            return ptr1 == ptr2 ? ptr1 : null;
        }
        
  
        
        int hops = Math.abs(len1-len2);
        if(len2 > len1){
            int count = 0;
            
            while(count < hops){
                ptr2 = ptr2.next;
                count++;
            }
        }
        else if(len1 > len2){
            int count = 0;
            while(count < hops){
                ptr1 = ptr1.next;
                count++;
            }
        }
        
        while(ptr1 != null && ptr2 != null){
            if(ptr1 == ptr2){
                return ptr1;
            }
            ptr1 = ptr1.next;
            ptr2 = ptr2.next;
        }
        return null;
        
        
        
    }
}