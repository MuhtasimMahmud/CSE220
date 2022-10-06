
public class Task1 
{
	public static void main(String[] args)
	{
		int array [] = new int [] {4,26,22,36,17,26,20,31};
		System.out.println(" a) Printing the elements ");
		print(array);
		System.out.println(" b) Copying an array ");
		copy(array);
		System.out.println(" c) Resizing an array ");
		resize(array,10);
		System.out.println(" d) Reversing an array ");
		reverse(array);
		System.out.println(" e) Shifting an array left ");
		shiftLeft(array);
		System.out.println(" f) Shifting an array right ");
		shiftRight(array);
		System.out.println(" g) Inserting an element at any position ");
		insert(array,8,7,7);
		System.out.println(" h) Removing an element from any position ");
		remove(array,8,22);
		System.out.println(" i) Rotating an array left ");
		rotateLeft(array);
		System.out.println(" j) Rotating an array right  ");
		rotateRight(array);
	}
	public static void print(int array[])
	{
		for(int i=0;i<array.length;i++)
		{
			System.out.println(array[i]);
		}
	}
	public static void copy (int array[])
	{
		int b[]=new int[array.length];
		for(int i=0;i<array.length;i++)
		{
			b[i]=array[i];
		}
		print(b);
	}
	public static void resize(int array[], int newLength)
	{
		int a[] = new int[newLength];
		for(int i=0;i<array.length;i++)
		{
			a[i] = array[i];
		}
		print(a);
	}
	public static void reverse(int array[])
	{
		int a[] = new int[array.length];
		for(int i=0;i<array.length;i++)
		{
			a[i] = array[i];
		}
		for(int i=0,j=a.length-1;i<a.length/2;i++,j--)
		{
			int temp = a[i];
			a[i] = a[j];
			a[j] = temp;
		}
		print(a);
	}
	  public static void shiftLeftByOne(int source[],int k)
	  {
		  for(int i=k;i<source.length-1;i++)
		  {
			  source[i]=source[i+1];
		  }
		  source[source.length-1] = 0;
	  }
	public static void shiftLeft(int array[])
	{
		int a[] = new int[array.length];
		for(int i=0;i<array.length;i++)
		{
			a[i] = array[i];
		}
		for(int i=0;i<a.length-1;i++)
		{
			a[i]=a[i+1];
		}
		a[a.length-1]=0;
		print(a);
	}
	public static void rotateLeft(int array[])
	{
		int a[] = new int[array.length];
		for(int i=0;i<array.length;i++)
		{
			a[i] = array[i];
		}
		int temp = a[0];
		for(int i=0;i<a.length-1;i++)
		{
			a[i]=a[i+1];
		}
		a[a.length-1]=temp;
		print(a);
	}
	public static void shiftRight(int array[])
	{
		int a[] = new int[array.length];
		for(int i=0;i<array.length;i++)
		{
			a[i] = array[i];
		}
		for(int i=a.length-1;i>0;i--)
		{
			a[i] = a[i-1];
		}
		a[0] = 0;
		print(a);
	}
	public static void rotateRight(int array[])
	{
		int a[] = new int[array.length];
		for(int i=0;i<array.length;i++)
		{
			a[i] = array[i];
		}
		int temp = a[a.length-1];
		for(int i=a.length-1;i>0;i--)
		{
			a[i] = a[i-1];
		}
		a[0] = temp;
		print(a);
	}
	  public static void insert(int [] arr, int size, int elem, int index)
	  {
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
			  System.out.println("No space Left");
		  }
		  else if(index > arr.length-1)
		  {
			  System.out.println("Invalid Index");
		  }
		  else if(index <= arr.length-1 )
		  {
			  for(int i=arr.length-1;i>index;i--)
			  {
				  arr[i] = arr[i-1];
			  }
			  arr[index] = elem;
			  int a = size+1;
			  System.out.println("Number of elements after insertion: "+ a);
		  }
		  print(arr);    
	  }
	  public static void remove(int [] arr, int size, int elem)
	  {
		  for(int i=0;i<arr.length;i++)
		  {
			  if(arr[i] == elem)
			  {
				  arr[i] = 0;
				  shiftLeftByOne(arr,i);
			  }
		  }
		  print(arr);
	  }

}
