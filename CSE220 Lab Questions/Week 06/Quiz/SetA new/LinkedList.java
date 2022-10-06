public class LinkedList{
  Node head;
  public LinkedList(Object[]a){
    head=new Node(null,null);
    Node tail=head;
    for(int i=0;i<a.length;i++){
      Node mn = new Node (a[i],null);
      tail.next=mn;
      tail=mn;
    }
  }
}