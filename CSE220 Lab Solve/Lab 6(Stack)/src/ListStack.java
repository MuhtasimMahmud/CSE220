public class ListStack implements Stack
{
    int size;
    Node top ;
    
    public ListStack()
    {
        size = 0;
        top = null;
    }
    
    
    public int size() 
    {
    	return size;
    }
    public boolean isEmpty() 
    {
    	if(size == 0) 
    	{
    		return true;
    	}
    	return false;
    }
    public void push(Object e) throws StackOverflowException
    {
    	Node temp = new Node(e,null);
    	if(top == null) 
    	{
    		top = temp;
    		size++;
    	}
    	else 
    	{
    		temp.next = top;
    		top = temp;
    		size++;
    	}
    }
    public Object pop() throws StackUnderflowException
    {
    	if(isEmpty()) 
    	{
    		throw new StackUnderflowException();
    	}
    	else 
    	{
    		Node temp = top;
    		top = top.next;
    		size--;
    		
    		return temp.val;
    	}
    }
    public Object peek() throws StackUnderflowException
    {
    	if(isEmpty()) 
    	{
    		throw new StackUnderflowException();
    	}
    	else 
    	{
    		return top.val;
    	}
    }
    public String toString() 
    {
    	String x = " ";
    	if(isEmpty()) 
    	{
    		x = "Stack is Empty";
    	}
    	else 
    	{
    		for(Node n = top;n!=null;n=n.next) 
        	{
        		x = " "+x+n.val+" ";
        	}
    	}
    	return x;
    }
    public Object[] toArray() 
    {
    	Object [] array = new Object[size];
    	int i = 0;
    	
    	for(Node n = top;n!=null;n=n.next) 
    	{
    		array[i] = n.val;
    		i++;
    	}
    	return array;
    }
    public int search(Object e) 
    {
    	int count = 0;
    	
    	for(Node n= top;n!=null;n=n.next) 
    	{
    		if(n.val == e) 
    		{
    			return count;
    		}
    		count++;
    	}
    	return -1 ;
    }
    

}