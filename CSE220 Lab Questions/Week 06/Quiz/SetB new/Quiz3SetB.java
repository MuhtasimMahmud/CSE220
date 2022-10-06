public class Quiz3SetB{
  public static Node joinList(LinkedList a, LinkedList b){
    //TODO
    return null;//remove this line
  }
  public static void print(Node h){
    //TODO
  }
  public static void main(String[]args){
    Object[]a={1,2,3,4,5,6};
    Object[]b={12,22,31,42,51,61};
    LinkedList l1 = new LinkedList(a);
    LinkedList l2 = new LinkedList(b);
    Node output = joinList(l1,l2);//This method creates a dummy headed
                                 //singly linked circular list and returns it.
                                 //The returned list will only contains odd numbers.
    print(output);// 1, 3, 5, 31, 51, 61
  }
}