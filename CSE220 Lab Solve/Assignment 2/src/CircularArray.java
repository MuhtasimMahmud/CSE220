import java.util.Arrays;

public class CircularArray
{
  
  private int start;
  private int size;
  private Object [] cir;
  
   public CircularArray(Object [] lin, int st, int sz)
  
  {
	  start = st;
	  size = sz;
	  
	  cir = new Object[lin.length];
	  for(int i=0,j=start;i<lin.length;i++) 
	  {
		  cir[j] = lin[i];
		  j=(j+1)%cir.length;
	  }
  }
  
  public void printFullLinear()
  {
	  for(int i=0;i<cir.length;i++) 
	  {
		  System.out.println(cir[i]);
	  }
  }
  
  public void printForward()
  {
	  for(int i=0,j=start;i<cir.length;i++) 
	  {
		  if(cir[j]!=null) 
		  {
			  System.out.println(cir[j]);
		  }
		  
		  j=(j+1)%cir.length;
	  }
  }
  
  
  public void printBackward()
  {
	  for(int i=0,j=(start+size-1)%cir.length;i<cir.length;i++) 
	  {
		  if(cir[j]!=null)
		  {
			  System.out.println(cir[j]);
		  }
		  j--;
		  if(j==-1) 
		  {
			  j=cir.length-1;
		  }
	  }
  }
  
  public int null_counter() 
  {
	  int counter = 0;
	  for(int i=0;i<cir.length;i++) 
	  {
		  if(cir[i]==null) 
		  {
			  counter++;
		  }
	  }
	  return counter;
  }
  
  public void linearize()
  
  {
	  Object array [] = new Object[cir.length-null_counter()];
	  
	  for(int i=0,j=start;i<array.length;i++) 
	  {
		  if(cir[j]!=null) 
		  {
			 array [i] = cir [j];
		  }
		  j=(j+1)%cir.length;
	  }
	  
	  cir = new Object[array.length];
	  
	  for(int i=0;i<array.length;i++) 
	  {
		  cir[i] = array[i];
	  }
  }

  public void resizeStartUnchanged(int newcapacity)
  {
	  Object array [] = new Object [newcapacity];
	  
	  linearize();
	  
	  
	  
	  for(int i=0,j=start;i<cir.length;i++) 
	  {
			  array [j] = cir [i];
			  j++;
	  }
	  
	  for(int i=0;i<array.length;i++) 
	  {
		  if(i<start || i >(cir.length+start)) 
		  {
			  array[i] = null;
		  }
		  else 
		  {
			  continue;
		  }
	  }
	  
	  cir = new Object[newcapacity];
	  
	  for(int i=0;i<array.length;i++) 
	  {
		  cir[i] = array [i];
	  }
  }

  public void resizeByLinearize(int newcapacity)
  {
	  
	  Object array[] = new Object[newcapacity];
	  
	  linearize();   
	  
	  for(int i=0;i<array.length;i++) 
	  {
		  if(i<cir.length) 
		  {
			  array[i] = cir[i];
		  }
		  else 
		  {
			  array[i] = null;
		  }
	  }
	  
	  cir =  new Object[array.length];
	  
	  for(int i=0;i<array.length;i++) 
	  {
		  cir[i] = array [i];
	  }
	  
  }
  
  public void rightShiftByOne(int index) 
  {
	  for(int i=cir.length-1;i>index;i--) 
	  {
		  cir[i] = cir[i-1];
	  }
  }
  
  
  public void insertByRightShift(Object elem, int pos)
  {
	 int index = pos;
	 
	 if(cir.length == size) 
	 {
		 resizeStartUnchanged(cir.length+3);
	 }
	 if(cir[index]==null) 
	 {
		 cir[index] = elem;
	 }
	 else 
	 {
		 rightShiftByOne(index);
		 cir[index] = elem;
	 }
	 
	 
  }
  public void leftShiftByOne(int index) 
  {
	  for(int i=0;i<index;i++) 
	  {
		  cir[i] = cir[i+1];
	  }
  }
  
  
  public void insertByLeftShift(Object elem, int pos)
  {
	  
	  int index =(start+pos)% cir.length;
	  
	  
	  if(cir.length==size) 
	  {
		  resizeStartUnchanged(cir.length+3);
	  }
	  if(cir[index] == null) 
	  {
		  cir[index] =elem;
	  }
	  else 
	  {
		leftShiftByOne(index);
		cir[index] = elem;
	  }
  }
  
  public void removeByLeftShift(int pos)
  {
	  
	  int index = pos;
	  
	  for(int i=index;i>(start+size)%cir.length;i=(i+1)%cir.length) 
   	  {
		  cir[i] = cir[(i+1)%cir.length];
		  cir[(i+1)%cir.length] = null;
		  
	  } 
  }
 
  public void removeByRightShift(int pos)
  {
	  int index = (start+pos)%cir.length;
	  
	  for(int i=index;i>start;i--) 
	  {
		  cir[i] = cir[i-1];
	  }
	  cir[start] = null;
  }
}