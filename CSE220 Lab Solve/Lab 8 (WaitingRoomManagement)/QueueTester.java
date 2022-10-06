import java.util.Scanner;

public class QueueTester
{
  public static void main(String[]args)
  {
      Scanner sc = new Scanner(System.in);
	  
     Waiting_room_management m = new Waiting_room_management();
     
     int n =1;
     
     while(n == 1) 
     {
    	System.out.println("\n1.RegisterPatient \n2.ServePatient \n3.CancelAll \n4.CanDoctorGoHome \n5.ShowAllPatient");
    	int i = sc.nextInt();
    	
    	if(i == 1) 
    	{
    	     try 
    	     {
    	    	 m.RegisterPatient();	 
    	     }
    	     catch(Exception e) 
    	     {
    	    	 System.out.println(e+" ");
    	     }
    	}
    	else if(i == 2) 
    	{
    		m.ServePatient();
    	}
    	else if(i == 3) 
    	{
    		m.CancelAll();
    	}
    	else if(i == 4) 
    	{
    		m.CanDoctorGoHome();
    	}
    	else if(i == 5)
    	{
    		m.ShowAllPatient();
    	}
    	System.out.println("Choose another option ?");
    	System.out.println("1.Yes \n2.No");
    	int b = sc.nextInt();
    	if(b ==1) {n = 1;}
    	else {n=0;}
     }
  	}
  }
