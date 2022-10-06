import java.util.Arrays;

public class ArrayStack implements Stack
{
    int size;
    Object [] data;
    int top = -1;
    
    public ArrayStack()
    {
        size=0;
        data = new Object[5];
    }
    
    
    public int size() 
    {
    	return size;
    }

    public boolean isEmpty() 
    {
    	if(top == -1) 
    	{
    		return true;
    	}
    	return false;
    }
    public boolean isFull() 
    {
    	if(top == (data.length-1)) 
    	{
    		return true;
    	}
    	return false;
    }
    public void push(Object e) throws StackOverflowException
    {
    	if(isFull()) 
    	{
    		throw new StackOverflowException();
    	}
    	else 
    	{
    		top++;
    		size++;
    		data[top] = e;
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
    		int x = top;
    		top--;
    		size--;
    		return data[x];
    	}
    }
    public Object peek() throws StackUnderflowException
    {
    	if(top == -1 || isEmpty()) 
    	{
    		throw new StackUnderflowException();
    	}
    	else 
    	{
    		return data[top];
    	}
    }
    public String toString() 
    {
    	String x = " ";
    	if(isEmpty()) 
    	{
    		System.out.println("Empty Stack");
    	}
    	else 
    	{
    		for(int i=top;i>=0;i--) 
    		{
    			x = " "+x+data[i]+" ";
    		}
    	}
    	return x;
    }
    public Object[] toArray() 
    {
    	Object array [] = new Object [size];
    	for(int i=0,j=top;i<=top;i++,j--) 
    	{
    		array [i] = data[j];
    	}
    	return array;
    }
    public int search(Object e) 
    {
    	for(int i=0;i<=top;i++) 
    	{
    		if(data[i] == e) 
    		{
    			return i;
    		}
    	}
    	return -1;
    }

    
}