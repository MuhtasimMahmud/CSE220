public class LinkedList
{
  public Node head;
  
  
  /* First Constructor:
   * Creates a linked list using the values from the given array. head will refer
   * to the Node that contains the element from a[0]
   */ 
  public LinkedList(Object [] a)
  {
	  head = new Node(a[0],null);
	  Node tail = head;
	  for(int i=1;i<a.length;i++) 
	  {
		  Node n = new Node(a[i],null);
		  tail.next = n;
		  tail = n;
	  }
  }
  
  /* Second Constructor:
   * Sets the value of head. head will refer
   * to the given LinkedList
   */
  public LinkedList(Node h)
  {
	  head =  h;
  }
  
  /* Counts the number of Nodes in the list */
  public int countNode()
  {
	  int count = 0 ;
	  for(Node i=head;i!=null;i=i.next) 
	  {
		  count++;
	  }
    return count; // please remove this line!
  }
  
  /* prints the elements in the list */
  public void printList()
  {
	  for(Node n=head;n!=null;n=n.next) 
	  {
		  System.out.println(n.element+" ");
	  }
  }
  
  // returns the reference of the Node at the given index. For invalid index return null.
  public Node nodeAt(int idx)
  {

	  int i=0;
	  
	  for(Node n=head;n!=null;n=n.next) 
	  {
		  if(i==idx) 
		  {
			  return n;
		  }
		  i++;
	  }
	  return null ;
  }
  
  
// returns the element of the Node at the given index. For invalid idx return null.
  public Object get(int idx)
  {
	  int i=0;
	  for(Node n=head;n!=null;n=n.next) 
	  {
		  if(i==idx) 
		  {
			  return n.element;
		  }
		  i++;
	  }
	  return null ; 
  }
  
  
  
  /* updates the element of the Node at the given index. 
   * Returns the old element that was replaced. For invalid index return null.
   * parameter: index, new element
   */
  public Object set(int idx, Object elem)
  {
	  
	 
		 Node x = nodeAt(idx);
		 if(x!=null) 
		 {
			 nodeAt(idx).element = elem;
			 return (x.element);
		 }
		 return null;
	 
  }
  
  
  /* returns the index of the Node containing the given element.
   if the element does not exist in the List, return -1.
   */
  public int indexOf(Object elem)
  {
	  int i=0;
	for(Node n=head;n!=null;n=n.next) 
	{
		if(n.element == elem) 
		{
			return i;
		}
		i++;
	}
    return -1; // please remove this line!
  }
  
  // returns true if the element exists in the List, return false otherwise.
  public boolean contains(Object elem)
  {
	boolean b = false;
	for(Node n = head;n!=null;n=n.next) 
	{
		if(n.element == elem ) 
		{
			b = true;
			return b;
		}
	}
    return b;
  }
  
  // Makes a duplicate copy of the given List. Returns the reference of the duplicate list.
  public Node copyList()
  {
	Node head1 = null;
	Node tail = null;
	for(Node n = head;n!=null;n=n.next) 
	{
		Node temp = new Node(n.element,null);
		if(head1 == null) 
		{
			head1 = temp;
			tail = head1;
		}
		else 
		{
			tail.next = temp;
			tail = tail.next;
		}
	}

    return head1;
  }
  
  // Makes a reversed copy of the given List. Returns the head reference of the reversed list.
  public Node reverseList()
  {
		Node head1 = null;
		
//		10,20,30,40,50
//		head1   temp 
//		null    10
//		10      20-->10
//		20--10  30--20---10
//		30---20--10    40--30
		
		
		for(Node n = head;n!=null;n=n.next) 
		{
			Node temp = new Node(n.element,null);
			if(head1 == null) 
			{
				head1 = temp;
			}
			else 
			{
				temp.next = head1;
				head1 = temp;
			}
		}


	    return head1;
  }
  
  /* inserts Node containing the given element at the given index
   * Check validity of index.
   */
  public void insert(Object elem, int idx)
  {
	Node x = new Node(elem,null);  
	
	if(idx == 0) 
	{
		Node temp = head;
		head = x;
		x.next = temp;
	}
	else if(idx == countNode())
	{
		nodeAt(idx-1).next = x;
	}
	else 
	{
		Node temp = nodeAt(idx);
		nodeAt(idx-1).next = x;
		x.next = temp;
	}
  }
  
  
  /* removes Node at the given index. returns element of the removed node.
   * Check validity of index. return null if index is invalid.
   */
  public Object remove(int index)
  {
	if(index == 0) 
	{
		head = head.next;
	} 
	else 
	{
		Node temp = nodeAt(index-1);
		temp.next = nodeAt(index).next;
	}
	  
    return head; // please remove this line!
  }
  
  // Rotates the list to the left by 1 position.
  public void rotateLeft()
  {
	  Node h = new Node(head.element,null);
	  head = head.next;
	  Node x = null;
	  for(Node n=head;n!=null;n=n.next) 
	  {
		  x = n;
	  }
	  x.next = h;
  }
  
  // Rotates the list to the right by 1 position.
  public void rotateRight()
  {
	  Node h = null;
	  for(Node n= head;n!=null;n=n.next) 
	  {
		  h = new Node(n.element,null);
		  
	  }
	  
	  head = h;
	  head = head.next;
	  
	  h=null;
  }
  
}