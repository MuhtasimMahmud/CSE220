public class CircularArrayTester

{
  public static void main(String [] args)
  
  {
	  
    Object [] linear = { 22, 32, 12, 4 , 72, 26, null, null};
    
    
    System.out.println(" Test 1) print the elements (forward print)");
    CircularArray c = new CircularArray(linear,4,8);
    System.out.println("\n");
    c.printForward();  
    
    
    
    System.out.println("Test 2) print the elements (backward)");
    System.out.println("\n");
    c.printBackward(); 
    
    
    
    
    System.out.println("Test 3) linearize the circular array ");
    System.out.println("\n");
    c.linearize();
    c.printFullLinear(); 
    
    
    
    
    System.out.println("Test 4) Resizing the circular array (start unchanged)");
    System.out.println("\n");
    Object [] linear2 = { 22, 32, 12, 4 , 72, 26, null, null};
    CircularArray c2 = new CircularArray(linear2, 4, 8);
    System.out.println("\n");
    c2.resizeStartUnchanged(11); 
    c2.printFullLinear(); 

    
    
    
    
    
    System.out.println("Test 4) Resize the circular array (by linearize)");
    Object [] linear3 = { 22, 32, 12, 4 , 72, 26, null, null};
    CircularArray c3 = new CircularArray(linear3, 4, 8);
    System.out.println("\n");
    c3.resizeByLinearize(11);
    c3.printFullLinear(); 
    
    
    
    
    
    System.out.println("Test 5) Insert an element at index");
    Object [] linear4 = { 22, 32, 12, 4 , 72, 26, null, null};
    CircularArray c4 = new CircularArray(linear3, 4, 8);
    System.out.println("\n");
    c4.insertByRightShift(80, 4);
    c4.printFullLinear(); 
    
    
    
    
    
    
    System.out.println("Test 6) Insert an element at position");
    c4.insertByLeftShift(90, 1); 
    System.out.println("\n");
    c4.printFullLinear(); 
    
  
    
    
    System.out.println("Test 7) Remove an element from index");
    Object [] linear5 = { 22, 32, 12, 4 , 72, 26, null, null};
    CircularArray c5 = new CircularArray(linear5, 4, 8);
    System.out.println("\n");
    c5.removeByLeftShift(4); 
    c5.printFullLinear();
    
    
    
    System.out.println("Test 8) Remove an element from position");
    Object [] linear6 ={ 22, 32, 12, 4 , 72, 26, null, null};
    CircularArray c6 = new CircularArray(linear5, 4, 8);
    c6.removeByRightShift(3);                              
    System.out.println("\n");
    c5.printFullLinear();

  }
  
}