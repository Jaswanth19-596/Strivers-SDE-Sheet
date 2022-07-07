class GfG
{
    
    Node merge(Node ptr1,Node ptr2){
        
        if(ptr1 == null)    return ptr2;
        if(ptr2 == null)    return ptr1;
        
        Node temp = new Node(0);
        Node tail = temp;
        while(ptr1 != null && ptr2 != null){
            if(ptr1.data <= ptr2.data){
                tail.bottom = ptr1;
                tail = tail.bottom;
                ptr1 = ptr1.bottom;
            }
            else{
                tail.bottom = ptr2;
                tail = tail.bottom;
                ptr2 = ptr2.bottom;
            }
        }
        
        if(ptr1 != null){
            tail.bottom = ptr1;
        }
        if(ptr2 != null){
            tail.bottom = ptr2;
        }
        
        return temp.bottom;
        
    }
    
    
    
    Node flatten(Node root)
    {
	    if(root == null || root.next == null)   return root;
	    
	    Node ptr2 = flatten(root.next);
	    Node ptr1 = root;
	    
	    Node res = merge(ptr1,ptr2);
	    
	   // res.next = null;
	    
	    return res;
    }
}