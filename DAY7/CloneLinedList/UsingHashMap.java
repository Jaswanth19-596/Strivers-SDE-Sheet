class Solution {
    public Node copyRandomList(Node head) {
        
    
        HashMap<Node,Node> map = new HashMap<>();
        
        Node ptr = head;
    
        // for every node in list store a dummy node in the map
        while(ptr != null){
            map.put(ptr,new Node(ptr.val));
            ptr = ptr.next;
        }
        
        ptr = head;
        
        while(ptr != null){
            // get the dummy of current node
            Node curr = map.get(ptr);
            
            // mark the next and random pointers
            curr.next = map.get(ptr.next);
            curr.random = map.get(ptr.random);
            
            ptr = ptr.next;
        }
        
        Node head2 = map.get(head);
        return head2;
        
        
    }
}