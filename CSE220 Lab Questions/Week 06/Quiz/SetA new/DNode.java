public class DNode{
  Object val;
  DNode next;
  DNode prev;
  DNode(Object v, DNode n, DNode p){
    val=v;
    next=n;
    prev=p;
  }
}