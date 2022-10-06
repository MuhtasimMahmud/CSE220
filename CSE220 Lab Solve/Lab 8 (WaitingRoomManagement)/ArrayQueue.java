public class ArrayQueue implements Queue
{
    int size;
    int start;
    int front;
    int rear;
    Object [] data;
    
    public ArrayQueue()
    {
        start=0;
        size =0;
        rear =-1;
        front =-1;
        data = new Object[5];
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
    
    public boolean isFull() 
    {
    	
    	if(size == data.length) 
    	{
    		return true;
    	}
    	return false;
    }
    
    public void enqueue(Object e) throws QueueOverflowException
    {
    	if(isFull()) 
    	{
    		throw new QueueOverflowException();
    	}
    	else 
    	{
    		rear++;
    		if(rear == data.length) 
    		{
    			rear = 0;
    		}
    		data[rear] = e;
    		size++;
    	}
    }
    
    public Object dequeue() throws QueueUnderflowException
    {
    	if(isEmpty()) 
    	{
    		throw new QueueUnderflowException();
    	}
    	else 
    	{
    		int x = start;
    		start++;
    		size--;
    		return data[x];
    	}
    }
    
    public Object peek() throws QueueUnderflowException
    {
    	if(isEmpty()) 
    	{
    		throw new QueueUnderflowException();
    	}
    	else 
    	{
    		return data[start];
    	}
    }
    
    public String toString()
    {
    	String x = "\n";
    	
    	int k = start;
    	
    	for(int i=0;i<size;i++) 
    	{
    		x = x+data[k]+"\n";
    		k=(k+1)%data.length;
    	}
    	return x;
    }
    


}






