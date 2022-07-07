class Solution {
    
    ListNode reverse(ListNode head){
        ListNode curr = head,prev = null;
        
        while(curr != null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
    
    
    public boolean isPalindrome(ListNode head) {
        
        ListNode slow = head,fast = head;
        
        while(fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        
        ListNode ptr1 = head;
        ListNode ptr2 = reverse(slow.next);
        
        while(ptr1 != null && ptr2 != null){
            if(ptr1.val != ptr2.val)    return false;
            
            ptr1 = ptr1.next;
            ptr2 = ptr2.next;
        }
        return true;
        
    }
}