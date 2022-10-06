import java.util.Arrays;

public class CircularArray
{
  
  private int start;
  private int size;
  private Object [] cir;
  
  /*
   * if Object [] lin = {10, 20, 30, 40, null}
   * then, CircularArray(lin, 2, 4) will generate
   * Object [] cir = {40, null, 10, 20, 30}
   */
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
  
  //Prints from index --> 0 to cir.length-1
  public void printFullLinear()
  {
	  for(int i=0;i<cir.length;i++) 
	  {
		  System.out.println(cir[i]);
	  }
  }
  
  // Starts Printing from index start. Prints a total of size elements
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
  
  // With no null cells
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
  
  // Do not change the Start index
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
  
  // Start index becomes zero
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
  
  /* pos --> position relative to start. Valid range of pos--> 0 to size.
   * Increase array length by 3 if size==cir.length
   * use resizeStartUnchanged() for resizing.
   */
  public void rightShiftByOne(int index) 
  {
	  for(int i=cir.length-1;i>index;i--) 
	  {
		  cir[i] = cir[i-1];
	  }
  }
  
  
  public void insertByRightShift(Object elem, int pos)
  {
	 int index = (start+pos)%cir.length;
	 
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
  
  /* parameter--> pos. pos --> position relative to start.
   * Valid range of pos--> 0 to size-1
   */
  public void removeByLeftShift(int pos)
  {
	  
	  int index = (start+pos)% cir.length;
	  
	  for(int i=index;i>(start+size)%cir.length;i=(i+1)%cir.length) 
   	  {
		  cir[i] = cir[(i+1)%cir.length];
		  cir[(i+1)%cir.length] = null;
		  
	  } 
  }
  
  /* parameter--> pos. pos --> position relative to start.
   * Valid range of pos--> 0 to size-1
   */
  public void removeByRightShift(int pos)
  {
	  int index = (start+pos)%cir.length;
	  
	  for(int i=index;i>start;i--) 
	  {
		  cir[i] = cir[i-1];
	  }
	  cir[start] = null;
  }
  
  
  
  public void reverse() 
  {
	  for(int i=0,j=cir.length-1;i<cir.length/2;i++,j--) 
	  {
		 Object temp = cir[i];
		 cir[i] =  cir[j];
		 cir[j] = temp;
	  }
  }
  
  //This method will check whether the array is palindrome or not
  public void palindromeCheck()
  {
	  linearize();
	  
	  boolean b = false;
	  
	  Object array[] = new Object[cir.length];
	  for(int i=0;i<array.length;i++) 
	  {
		  array[i] = cir[i];
	  }
	  
	  reverse();
	  
	  for(int i=0;i<cir.length;i++) 
	  {
		  System.out.println(cir[i]);
	  }
	
	  
	  for(int i=0;i<array.length;i++) 
	  {
		  if(array[i] == cir[i]) 
		  {
			  b = true;
		  }
		  else 
		  {
			  b = false;
			  break;
		  }
	  }
	  
	  if(b==true) 
	  {
		  System.out.println("This array is a palindrome");
	  }
	  else if(b==false)
	  {
		  System.out.println("This array is not a palindrome"); 
	  }
  }
  
  
  //This method will sort the values by keeping the start unchanged
  public void sort()
  {
	  
	  Arrays.sort(cir);
  }
  
  //This method will check the given array across the base array and if they are equivalent interms of values return true, or else return false
  public boolean equivalent(CircularArray k)
  
  {
	  k.linearize();
	  this.linearize();
	  
	  boolean b = false;
	  
	  for(int i=0;i<this.cir.length;i++) 
	  {
		  if(this.cir[i] == k.cir[i]) 
		  {
			  b = true;
		  }
		  else 
		  {
			b = false;
			break;
		  }
	  }
    return b; 
  }
}