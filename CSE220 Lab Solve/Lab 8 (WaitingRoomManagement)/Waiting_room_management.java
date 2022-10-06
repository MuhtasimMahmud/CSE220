
import java.util.Scanner;

public class Waiting_room_management 
{
	Scanner sc = new Scanner(System.in);
	
//	ListQueue a = new ListQueue();
	ArrayQueue a = new ArrayQueue();
	
	
	
	
	public void RegisterPatient()throws QueueOverflowException
	{
		
		if(a.isFull()) 
		{
			throw new QueueOverflowException();
		}
		else 
		{
			patient p = new patient();
			System.out.println("name :");
			p.name = sc.next();
			System.out.println("age :");
			p.age = sc.nextInt();
			System.out.println("Blood :");
			p.blood = sc.next();
			
			
			   
			try 
			{
				a.enqueue(p);
				System.out.println("Success");
			}
			catch(Exception e ) 
			{
				System.out.println(e+" "+"Not Succes");
			}
		}
	}
	public void ServePatient()
	{
		try
		{
			patient p = (patient) a.dequeue();
			System.out.println(p.name);
		}
		catch(Exception e )
		{
			System.out.println(e+" ");
		}
	}	
	public void CancelAll()
	{
		while(a.isEmpty() == false) 
		{
			try {a.dequeue();}
			catch(Exception e){System.out.println(e);}
		}
		if(a.size == 0) 
		{
			System.out.println("Canceled all, Now doctor can go to lunch");
		}
	}
	public void CanDoctorGoHome()
	{
		if(a.isEmpty()) 
		{
			System.out.println("Yes, Doctor can go home. No patient is waiting");
		}
		else 
		{
			System.out.println("No, Doctor can not go home. Patient is waiting");
		}
	}
	public void ShowAllPatient()
	{
	    System.out.println(a.toString());
	}
	
	
}
