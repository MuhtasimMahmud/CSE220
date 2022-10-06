import java.util.Scanner;
public class Task1 
{
	public static void main(String[]args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please give me the length of 1st array");
		int length1 = sc.nextInt();
		
		int array1 [] = new int[length1];
		
		System.out.println("Please give me inputs for 1st array");
		for(int i=0;i<array1.length;i++) 
		{
			array1[i] = sc.nextInt();
		}
		
		System.out.println("Please give me the length of 2nd array");
		int length2 = sc.nextInt();
		
		int array2[] = new int[length2];
		
		System.out.println("Please give me inputs for 2nd array");
		for(int i=0;i<array2.length;i++) 
		{
			array2[i] = sc.nextInt();
		}
		
		int array3 [] = appendArrays(array1 , array2);
		
		for(int i=0;i<array3.length;i++) 
		{
			System.out.print(array3[i]+" ");
		}
		
	}

	public static int [] appendArrays(int a[],int b[]) 
	{
		int array[] = new int[a.length+b.length];
		
		int j = 0;
		
		for(int i=0;i<array.length;i++) 
		{
			
			
			if(i<a.length) 
			{
				array[i] = a[i];
			}
			else
			{
				array[i] = b[j];
				j++;
			}
		}
		
		
		return array;
	}
}
















