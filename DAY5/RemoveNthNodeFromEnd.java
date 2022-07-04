class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
                
        int len = 0;
        
        ListNode ptr = head;
        
        while(ptr != null){
            len++;
            ptr = ptr.next;
        }
        
        if(len == n)    return head.next;
        
        int noOfHops = len - n - 1;
        
        int count = 0;
        
        ptr = head;
        
        while(count < noOfHops){
            count++;
            ptr = ptr.next;
        }
        
        if(ptr.next != null){
            ptr.next = ptr.next.next;
        }
        
        return head;
    }
}