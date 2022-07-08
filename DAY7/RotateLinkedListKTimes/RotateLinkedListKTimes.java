class Solution {
    
    
    ListNode rotate(ListNode head){
        
        ListNode ptr = head;
        
        // moves the pointer to the second last node
        while(ptr.next.next != null){
            ptr = ptr.next;
        }
        
        // makes the last node as the head of the linked list
        ListNode temp = ptr.next;
        ptr.next = null;
        temp.next = head;
        head = temp;
        
        return head;       
    }
    
    
    // finds the length of the linked list
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
        
        // rotate the list k times
        for(int i = 0;i<k;i++){
            head = rotate(head);
        }    
        return head;
    }
}