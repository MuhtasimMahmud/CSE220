public class LinearArray
{
  public static void main(String [] args)
  {
    int [] a = {10, 20, 30, 40, 50, 60};
    
    System.out.println("\n///// TEST 01: Copy Array example /////");
    int [] b = copyArray(a, a.length);
    printArray(b); // This Should Print: { 10, 20, 30, 40, 50, 60 } 
    
    System.out.println("\n///// TEST 02: Print Reverse example /////");
    printArray(a); // This Should Print: { 10, 20, 30, 40, 50, 60 } 
    System.out.println("\n\n Reverse array is ");
    printReverse(a); // This Should Print: { 60, 50, 40, 30, 20, 10 } 
    
    
    System.out.println("\n///// TEST 03: Reverse Array example /////");
    reverseArray(b);
    printArray(b); // This Should Print: { 60, 50, 40, 30, 20, 10 } 
    
    
    System.out.println("\n///// TEST 04: Shift Left k cell example /////");
    b = copyArray(a, a.length);
    b=shiftLeft(b,3);
    printArray(b); // This Should Print: { 40, 50, 60, 0, 0, 0 } 
    
    System.out.println("\n///// TEST 05: Rotate Left k cell example /////");
    reverseArray(a);
    b = copyArray(a, a.length); 
    printArray(b); // This Should Print: { 10, 20, 30, 40, 50, 60 } 
    System.out.println("\n\n rotate array");
    b=rotateLeft(b,3);
    printArray(b); // This Should Print: { 40, 50, 60, 10, 20, 30 } 
    
    System.out.println("\n///// TEST 06: Shift Right k cell example /////");
    b = copyArray(a, a.length);
    printArray(b); // This Should Print: { 10, 20, 30, 40, 50, 60 } 
    System.out.println("\n\n right shifted array");
    b=shiftRight(b,3);
    printArray(b);  // This Should Print: { 0, 0, 0, 10, 20, 30 } 
    
    System.out.println("\n///// TEST 07: Rotate Right k cell example /////");
    b = copyArray(a, a.length);
    printArray(b); // This Should Print: { 10, 20, 30, 40, 50, 60 }
    System.out.println("\n\n rotate array");
    b=rotateRight(b,3);
    printArray(b); // This Should Print: { 40, 50, 60, 10, 20, 30 } 
    
    
    System.out.println("\n///// TEST 08: Insert example 1 /////");
    
    b = copyArray(a, a.length);
    printArray(b);  // This Should Print: { 10, 20, 30, 40, 50, 60 } 
    System.out.println("\n\n");
    boolean bol=insert(b,6, 70, 2); // This Should Print: No space Left 
    System.out.println(bol); // This Should Print: false
    printArray(b);  // This Should Print: { 10, 20, 30, 40, 50, 60 } 
    
    System.out.println("\n///// TEST 09: Insert example 2 /////");
    int [] c = {10, 20, 30, 40, 50, 0, 0}; 
    printArray(c);  // This Should Print: { 10, 20, 30, 40, 50, 0, 0 }
    System.out.println("\n\n");
    bol=insert(c,5, 70, 2);  // This Should Print: Number of elements after insertion: 6
    System.out.println(bol); // This Should Print: true
    printArray(c); // This Should Print: { 10, 20, 70, 30, 40, 50, 0 } 
    
    System.out.println("\n///// TEST 10: Insert example 3 /////");
    printArray(c); // This Should Print: { 10, 20, 70, 30, 40, 50, 0 } 
    bol=insert(c,6, 70, 6); // This Should Print: Number of elements after insertion: 7 
    System.out.println(bol); // This Should Print: true
    printArray(c); // This Should Print: { 10, 20, 70, 30, 40, 50, 70 } 
    
    System.out.println("\n///// TEST 11: Remove example 1 /////");
    
    printArray(c); // This Should Print: { 10, 20, 70, 30, 40, 50, 70 } 
    bol=removeAll(c,7,90);
    System.out.println("\n\n");
    System.out.println(bol); // This Should Print: false
    printArray(c); // This Should Print: { 10, 20, 70, 30, 40, 50, 70 } 
    
    System.out.println("\n///// TEST 12: Remove example 2 /////");
    printArray(c);  // This Should Print: { 10, 20, 70, 30, 40, 50, 70 } 
    bol=removeAll(c,7,70);
    System.out.println("\n\n");
    System.out.println(bol); // This Should Print: true
    printArray(c);  // This Should Print: { 10, 20, 30, 40, 50, 0, 0 } 
    
  }
  
  public static void printArray(int [] source)
  {
	  for(int i=0;i<source.length;i++)
	  {
		  System.out.println(source[i]);
	  }
  }
  
  public static void printReverse(int [] source)
  {
	  for(int i=0,j=source.length-1;i<source.length/2;i++,j--)
	  {
		  int temp = source[i];
		  source[i] = source[j];
		  source[j] = temp;
	  }
	  for(int i=0;i<source.length;i++)
	  {
		  System.out.println(source[i]);
	  }
  }
  
  public static int [] copyArray(int [] source, int len)
  {
	  int array[] = new int[len];
	  for(int i=0;i<source.length;i++)
	  {
		 array[i] = source[i];
	  }
	  return array;
  }
  

  public static void reverseArray(int [] source)
  {
	 for(int i=0,j=source.length-1;i<source.length/2;i++,j--)
	 {
		 int temp = source[i];
		 source[i] = source[j];
		 source[j] = temp;
	 }
  }
  
  public static void shiftLeftByOne(int source[],int k)
  {
	  for(int i=k;i<source.length-1;i++)
	  {
		  source[i]=source[i+1];
	  }
	  source[source.length-1] = 0;
  }

  public static int [] shiftLeft(int [] source, int k)
  {
	  reverseArray(source);
	  for(int i=0;i<source.length-k;i++)
	  {
		  source[i]=source[i+k];
	  }
	  for(int i=source.length-k;i<source.length;i++)
	  {
		  source[i]=0;
	  }
	  return source;
  }
  
  public static void leftRotateByOne(int source[] )
  {
	  int temp = source[0];
	  for(int i=0;i<source.length-1;i++)
	  {
		  source[i]=source[i+1];
	  }
	  source[source.length-1] = temp;
  }

  public static int [] rotateLeft(int [] source, int k)
  {
	  for(int i=0;i<k;i++)
	  {
		  leftRotateByOne(source);
	  }
	  return source; 
  }
  
  
/// nicher ei method ta diyeu one by one rightShifting kora jay....eta ektu easier
  
//  public static void shiftRightByOne(int source[])
//  {
//	  for(int i=source.length-1;i>0;i--)
//	  {
//		  source[i]=source[i-1];
//	  }
//	  source[0]=0;
//  }
  public static int [] shiftRight(int [] source, int k)
  {
	  for(int i=source.length-1;i>=source.length-k;i--)
	  {
		  source[i] = source[i-k];
	  } 
	  for(int i=0;i<k;i++)
	  {
		  source[i] = 0;
	  }
	  
	  return source;     
  }
  
  public static void rightRotateByOne(int source[])
  {
	  int temp = source[source.length-1];
	  for(int i=source.length-1;i>0;i--)
	  {
		  source[i]=source[i-1];
	  }
	  source[0]=temp;
  }

  
  public static int [] rotateRight(int [] source, int k)
  {
	  for(int i=0;i<k;i++)
	  {
		  rightRotateByOne(source);
	  }
	  return source;
  }
  
  /** @return true if insertion is successful; @return false otherwise
    * @param arr the reference to the linear array
    * @param size the number of elements that exists in the array. size<=arr.length
    * @param elem the element that is to be inserted
    * @param index the index in which the element is required to be inserted
    * if insertion is not successful due to lack space, print "No space Left"
    * if given index is invalid, print "Invalid Index"
    * if insertion is successful, print the 'Number of elements after insertion' is completed
    */
  public static boolean insert(int [] arr, int size, int elem, int index)
  {
	  boolean b = false;
	  int count = 0;
	  for(int i=0;i<arr.length;i++)
	  {
		  if(arr[i]==0)
		  {
			  count++;
		  }
	  }
	  if(count==0)
	  {
		  b = false;
		  System.out.println("No space Left");
	  }
	  else if(index > arr.length-1)
	  {
		  b = false;
		  System.out.println("Invalid Index");
	  }
	  else if(index <= arr.length-1 )
	  {
		  b = true;
		  for(int i=arr.length-1;i>index;i--)
		  {
			  arr[i] = arr[i-1];
		  }
		  arr[index] = elem;
		  int a = size+1;
		  System.out.println("Number of elements after insertion: "+ a);
	  }
	  return b;    
  }
  
  /** 
   * removes all the occurences of the given element
   * @param arr the reference to the linear array
   * @param size the number of elements that exists in the array. size<=arr.length
   * @param elem the element to be removed
   * @return true if removal is successful; return false otherwise
   * if removal is successful, print the 'Number of elements after removal' is completed
   */  
  public static boolean removeAll(int [] arr, int size, int elem)
  {
	  boolean b = false;
	  
	  for(int i=0;i<arr.length;i++)
	  {
		  if(arr[i] == elem)
		  {
			  b=true;
			  arr[i] = 0;
			  shiftLeftByOne(arr,i);
		  }
	  }
	  return b;    
  }
}