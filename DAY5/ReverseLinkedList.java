class Solution {
    
    public ListNode reverse(ListNode prev,ListNode curr){
        if(curr == null)    return prev;
        
        ListNode next = curr.next;
        curr.next = prev;
        prev = curr;
        curr = next;
        
        return reverse(prev,curr);
        
    }
   
    public ListNode reverseList(ListNode head) {
        if(head == null)    return null;
        return reverse(null,head);
    }
}