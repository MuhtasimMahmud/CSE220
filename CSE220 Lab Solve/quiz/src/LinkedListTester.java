import java.util.Scanner;
public class LinkedListTester
{
  public static void main(String [] args)
  {
	 Scanner sc = new Scanner(System.in);
	 System.out.println("please give me the length of array");
	 int length = sc.nextInt();
	 
	 int array1 [] = new int[length];
	 int array2 [] = new int[length];
	 
	 //taking inputs fot 1st array
	 System.out.println("please give me inputs for 1st array");
	 for(int i=0;i<length;i++) 
	 {
		 array1[i] = sc.nextInt();
	 }
	 //taking inputs fot 2nd array
	 System.out.println("please give me inputs for 2nd array");
	 for(int i=0;i<length;i++) 
	 {
		 array2[i] = sc.nextInt();
	 }
	 
	 int count=0;
	 
	 for(int i=0;i<array1.length;i++) 
	 {
		 for(int j=0;j<array2.length;j++) 
		 {
			 if(array1[i]==array2[j]) 
			 {
				 count++;
			 }
		 }
	 }
	 int arrayCheck [] = new int[count];
	
	 
	 int v = 0;
	 for(int i=0;i<array1.length;i++) 
	 {
		 for(int j=0;j<array2.length;j++) 
		 {
			 if(array1[i]==array2[j]) 
			 {
				 arrayCheck[v] = array1[i];
				 v++;
			 }
		 }
	 }

    LinkedList h1 = new LinkedList(arrayCheck); 

    h1.printList(); 
    
  }
  
}