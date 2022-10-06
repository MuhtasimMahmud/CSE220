public class ObjecttypeTest{
  public static void main(String[] args){
    int i;
    int[] ar = new int[5];
    System.out.println(ar.length);
    //*****
    int [] ar1 = {1,2,3,4,5,6};
    for(i=0;i<ar1.length;i++){
      System.out.print(ar1[i]+ "   ");
    }
    System.out.println();
    //*****
    int [] ar2 = {'a', 'b',1,2,5}; // possible ?? yes/no !!!
    for(i=0;i<ar2.length;i++){
      System.out.print(ar2[i]+ "   ");
    }
    System.out.println();
    //*****
    Object[] ar3 = new Object[5];
    for(i=0;i<ar3.length;i++){
      System.out.print(ar3[i]+ "   ");
    }
    System.out.println();
    //*****
    Object[] ar4 = {1,2,3,4,5}; //possible?? Yes ?
    for(i=0;i<ar4.length;i++){
      System.out.print(ar4[i]+ "   ");
    }
    System.out.println();
    //*****
    Object[] ar5= {'a', 'b',1,2,5}; // possible ?? Yes ?/No ?
    for(i=0;i<ar5.length;i++){
      System.out.print(ar5[i]+ "   ");
    }
    System.out.println();
    //special case
     //*****
//    int [] ar6 = {"a", "b",1,2,5}; // possible ?? yes/no !!!
//    for(i=0;i<ar6.length;i++){
//      System.out.print(ar6[i]+ "   ");
//    }
//    System.out.println();
    //*****
    Object[] ar7 = {"a", "b",1,2,5}; // possible ?? yes/no !!!
    for(i=0;i<ar7.length;i++){
      System.out.print(ar7[i]+ "   ");
    }
    System.out.println();
    //*****
    }
  }