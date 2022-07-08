class Solution {
    public Node copyRandomList(Node head) {
        
        if(head == null)    return null;
        
        
        Node ptr = head;
        
	// create dummy nodes
        while(ptr != null){
                
            Node next = ptr.next;
            ptr.next = new Node(ptr.val);
            ptr.next.next = next;
            ptr = next;            
        }
        
        ptr = head;
        
	// point the random pointers 
        while(ptr != null){
            ptr.next.random = ptr.random != null ? ptr.random.next : null;
            ptr = ptr.next.next;
        }
        
        ptr = head;
        
        Node res = ptr.next;
    
	// seggregate the Copy and original linked lists    
        while(ptr != null){
            Node next = ptr.next.next;
            Node temp = ptr.next;
            temp.next = next != null ? next.next : null;
            ptr.next = next;
            ptr = next;
        }
       
        return res;
        
    }
}