class Solution {
    
    
    int getLen(ListNode head){
        int count = 0;
        while(head != null){
            count++;
            head = head.next;
        }
        return count;
    }
    
    public ListNode rotateRight(ListNode head, int k) {
        
        // if the length of list is 0 or 1 then no need to reverse
        if(head == null || head.next == null)   return head;
        
        // get the length of the linked list
        int count = getLen(head);
        
        // mod the k value -> if we rotate list by n times it produces same list
        k = k % count;
        
        ListNode ptr = head;
        
        // Go till last node
        while(ptr.next != null) ptr = ptr.next;
        
        // point the last node to head
        ptr.next = head;
        
        // find the diff
        int n = count - k;
        
        // go till the that node
        while(n-- > 0)  ptr = ptr.next;
        
        // mark next node as head
        head = ptr.next;
        // break the link
        ptr.next = null;
        
        return head;
       
    }
}