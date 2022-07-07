class Solution {
    
    
    ListNode reverse(ListNode head,int k,int rem){
        
        if(rem < k) return head;
        
        ListNode curr = head,prev = null;
        
        int count = 0;
        
        while(curr != null && count < k){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            count++;
        }
        
        if(curr != null){
            ListNode reversedHead = reverse(curr,k,rem-k);
            head.next = reversedHead;
        }
        return prev;        
    }
    
    public ListNode reverseKGroup(ListNode head, int k) {
     
        int count = 0;
        
        ListNode ptr = head;
        
        while(ptr != null){
            ptr = ptr.next;
            count++;
        }
        return reverse(head,k,count);
        
        
    }
}