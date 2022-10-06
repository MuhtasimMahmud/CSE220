public class LinkedList{
  DNode head;
  public LinkedList(Object[]a){
    head=new DNode(a[0],null,null);
    DNode tail=head;
    for(int i=1;i<a.length;i++){
      DNode mn = new DNode (a[i],null,tail);
      tail.next=mn;
      tail=mn;
    }
  }
}