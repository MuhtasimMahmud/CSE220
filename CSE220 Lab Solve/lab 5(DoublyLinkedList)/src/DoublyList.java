
public class DoublyList
{
    public Node head;
    
    
    /* First Constructor:
     * Creates a linked list using the values from the given array. head will refer
     * to the Node that contains the element from a[0]
     */ 
    public DoublyList(Object [] a)
    {
        head = new Node(null, null, null);
        Node tail = head;
        
        for(int i = 0; i<a.length; i++)
        {
            Node mn = new Node(a[i], null, null);
            tail.next = mn;
            mn.prev=tail;
            tail=mn;
        }
        tail.next=head; // Making it circular
        head.prev=tail;
    }
    
    /* Second Constructor:
     * Sets the value of head. head will refer
     * to the given LinkedList
     */
    public DoublyList(Node h)
    {
        head = h;
    }
    
    /* Counts the number of Nodes in the list */
    public int countNode()
    {
    	int count =0;
    	
    	for(Node n = head.next; n!= head;n=n.next) 
    	{
    		count++;
    	}
    	
    	
    	return count; 
    }
    
    /* prints the elements in the list */
    public void forwardprint()
    {
    	for(Node n = head.next;n!= head; n=n.next) 
    	{
    		System.out.print(n.element+" ");
    	}
    }
    
    public void backwardprint()
    {
    	for(Node n = head.prev; n!=head; n = n.prev) 
    	{
    		System.out.print(n.element+" ");
    	}
    }
    
    
    // returns the reference of the Node at the given index. For invalid index return null.
    public Node nodeAt(int idx)
    {
    	int count =0;
    	
    	for(Node n = head.next; n!=head ; n=n.next ) 
    	{
    		if(idx == count) 
    		{
    			return n;
    		}
    		count++;
    	}
        
        return null; // for any invalid index it returns null
    }
    
    
    
    /* returns the index of the Node containing the given element.
     if the element does not exist in the List, return -1.
     */
    public int indexOf(Object elem) 
    {
       	int count =0;
     	
       	for(Node n = head.next; n!=head; n=n.next) 
       	{
       		if(n.element == elem) 
       		{
       			return count;
       		}
       		count++;
       	}
    	return -1;
    }
    
    
    
    /* inserts Node containing the given element at the given index
     * Check validity of index.
     */
    public void insert(Object elem, int idx)
    {
    	Node new_Node = new Node(elem,null,null);
    	
    	
    	if(idx==0) 
    	{
    		Node temp = head.next;
    		head.next = new_Node;
    		new_Node.next = temp;
    		temp.prev = new_Node;
    		new_Node.prev = head;
    		
    		
    	}
    	
    	else 
    	{
    		Node temp = nodeAt(idx-1);
    		Node temp2 = temp.next;
    		
    		
    		temp.next = new_Node;
    		new_Node.next = temp2;
    		temp2.prev = new_Node;
    		new_Node.prev = temp;
    		

    	}
    	
    }
    
    
    
    
    /* removes Node at the given index. returns element of the removed node.
     * Check validity of index. return null if index is invalid.
     */
    public Object remove(int index)
    {
        if(index == 0) 
        {
        	Node target = head.next;
        	
        	Node temp = target.next;
        	
        	temp.prev = target.prev;
        	
        	head.next = temp;
        	
        	
        	return target.element;
        }
        else 
        {
        	Node prev = nodeAt(index-1);
        	
        	
        	Node target = prev.next;
        	
        	Node temp = target.next;
        	
        	temp.prev = target.prev;
        	
        	prev.next = temp;
        	
        	
        	
        	
        	return target.element;
        	
        }
    } 
    public void printLinkedList() 
    {
    	for(Node n = head.next;n!=head;n=n.next) 
    	{
    		System.out.print(n.element+" ");
    	}
    	System.out.println();
    }
    
    public void rotateLeft() 
    {
    	Node h = new Node((head.next).element,null,null);
    	Node x = null;
    	
    	for(Node n= head.next;n!=head;n=n.next) 
    	{
    		x = n;
    	}
    	
    	x.next = h;
    	h.next = head;
    	
    	head.next = head.next.next;
    }
    
    public void rotateRight() 
    {
    	Node temp = null;
    	int count = 0 ;
    	
    	
    	for(Node n = head.next;n!=head;n=n.next) 
    	{
    		temp = new Node(n.element,null,null);
    		count++;
    	}
    	
    	temp.prev = head;
    	temp.next = head.next;
    	head.next.prev = temp;
    	head.next = temp;
    	
    	nodeAt(count-1).next = head;
    	head.prev = nodeAt(count-1);
    	
    	
    	
    }
    
    public Node reverseCopy() 
    {
    	
    	Node new_Node = null;
    	
    	for(Node n = head.next;n!=null;n=n.next) 
    	{
    		Node temp = new Node(n.element,null,null);
    		
    		if(n==head.next) 
    		{
    			new_Node = temp;
    		}
    		else 
    		{
    			new_Node.prev = temp;
    			temp.next = new_Node;
    		}
    	}
    	return new_Node;
    }
    
    
    
}









