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
    	String x = "";
    	
    	int k = start;
    	
    	for(int i=0;i<size;i++) 
    	{
    		x = " "+x+data[k]+" ";
    		k=(k+1)%data.length;
    	}
    	return x;
    }
    
    public Object[] toArray()
    {
    	
    	Object array[] = new Object[data.length];
    	
    	int k = start;
    	
    	for(int i=0;i<size;i++) 
    	{
    		array[i] = data[k];
    		k=(k+1) % data.length;
    	}
        return array;
    }
    public int search(Object e)
    {
    	int k = start;
    	
    	for(int i=0;i<data.length;i++) 
    	{
    		if(data[k] == e) 
    		{
    			return k;
    		}
    		k = (k+1)%data.length;
    	}
    	return -1;
    }
}






