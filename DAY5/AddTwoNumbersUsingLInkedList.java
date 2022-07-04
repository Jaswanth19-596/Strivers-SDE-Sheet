class Solution {                                                                                                                                                     
    public ListNode addTwoNumbers(ListNode ptr1, ListNode ptr2) {
        
        ListNode head  = new ListNode(0);
        
        ListNode tail = head;
        
        int sum = 0 , carry = 0,rem = 0;
        
        while(ptr1 != null && ptr2 != null){
            sum = ptr1.val + ptr2.val + carry;
            
            carry = sum / 10;
            rem = sum % 10;
            
            tail.next = new ListNode(rem);
            tail = tail.next;
            ptr1 = ptr1.next;
            ptr2 = ptr2.next;
        }
        
        while(ptr1 != null){
            sum = ptr1.val + carry;
            carry = sum / 10;
            rem = sum%10;
            tail.next = new ListNode(rem);
            tail = tail.next;
            ptr1 = ptr1.next;
        }
        
        while(ptr2 != null){
            sum = ptr2.val + carry;
            carry = sum / 10;
            rem = sum%10;
            tail.next = new ListNode(rem);
            tail = tail.next;
            ptr2 = ptr2.next;
        }
        
        if(carry != 0){
            tail.next = new ListNode(carry);
        }
        
        return head.next;
    }
}