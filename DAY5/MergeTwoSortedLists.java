class Solution {
    public ListNode mergeTwoLists(ListNode ptr1, ListNode ptr2) {
        
        ListNode head = null,tail = null;
        
        if(ptr1 == null)    return ptr2;
        if(ptr2 == null)    return ptr1;
        
        if(ptr1.val <= ptr2.val){
            head = tail = ptr1;
            ptr1 = ptr1.next;
        }else{
            head = tail = ptr2;
            ptr2 = ptr2.next;
        }
        
        while(ptr1 != null && ptr2 != null){
            if(ptr1.val <= ptr2.val){
                tail.next = ptr1;
                tail = tail.next;
                ptr1 = ptr1.next;
            }else{
                tail.next = ptr2;
                tail = tail.next;
                ptr2 = ptr2.next;
            }
        }
        
        if(ptr1 == null)    tail.next = ptr2;
        if(ptr2 == null)    tail.next = ptr1;
        
        return head;
    }
}