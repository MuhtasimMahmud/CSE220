
public class TestCircularArray
{
  
  String [] cir;
  int size;
  int start;
    private Object Integet;
  
  public TestCircularArray(String[]lin, int st, int sz){
   start=st;
    size=sz;
      cir=new String [lin.length];
    for(int c=0; c<cir.length;c++){
      cir[(c+st)%cir.length]=lin[c];
    }
    
    display();
    
  }
  
  public void sort()
  {
    
    int i=start;
 for(int c1=1; c1<size; c1++)
 {
   int j=(i+1)%cir.length;
   for(int c2=c1+1; c2<=size;c2++)
   {
     if(Integer.parseInt(cir[i])>Integer.parseInt(cir[j]))
     {
       String temp=cir[i];
       cir[i]=cir[j];
       cir[j]=temp;
     }
       j=(j+1)%cir.length;
     }
       i=(i+1)%cir.length;
    }
      
    display();
  }
  public int countOdd(){
    /* From the cir array, you have to count the number of odd numbers.
     * It is not as easy as it looks. Firstly, notice that the numbers are given as strings. 
     * To determine whether a number is odd,you first have to sum up the digits. 
     * For example if one number is "234", you have to find the result of 2+3+4. 
     * If the summation is odd then consider the number as odd.
     * Then return the count.
     */
    int count = 0; int st = start;
     for(int i =0;i<size;i++){
       String word = cir[st];
       int num = 0;
       for(int j=0;j<word.length();j++){
         num = num + (int)(word.charAt(j));
       }
       if (num%2!=0){
         count++;
       }
       st = (st+1)%cir.length;
     }
    return count;
  }
  
  public int countEven(){
    /* From the cir array, you have to count the number of even numbers.
     * It is not as easy as it looks. Firstly, notice that the numbers are given as strings. 
     * To determine whether a number is even, you first have to sum up the digits. 
     * For example if one number is "234", you have to find the result of 2+3+4. 
     * If the summation is even then consider the number as even.
     * Then return the count.
     */
    
    // TO DO
      int count = 0; int st = start;
     for(int i =0;i<size;i++){
       String word = cir[st];
       int num = 0;
       for(int j=0;j<word.length();j++){
         num = num + (int)(word.charAt(j));
       }
       if (num%2==0){
         count++;
       }
       st = (st+1)%cir.length;
     }
    return count;
    
  }
  
  public void insert(String item,int offset) throws CircularArrayException{
    /* If there are no empty spaces, throw CircularArrayException
     * This class must be created
     * you must createhe CircularArrayException object send the name of the particular exception as String in the constructor
     * one of them is done for you
     * 
     * If there is/are empty space(s), insert using LEFT shift.
     * Offset means how far from start. The index has been calculated for you.
     * Offset cannot be more than size
     * Note that the element pointed by start will also shift, hence change the start at the end
     * increment size
     */
    
    if (offset<0 || offset>size){
      throw new CircularArrayException("Invalid offset");
    }
    
    if (size==cir.length){
      throw new CircularArrayException("Array full");
    }
    
    int idx = (start+offset)%cir.length;  
    int pos=offset;
    int numbershiftedvalue=(size-pos);
    int from=(start+size-1)%cir.length;
    int to=(from+1)%cir.length;
    for(int i=0; i<numbershiftedvalue;i++){
    cir[to%cir.length]=cir[from%cir.length];
    to=from;
    from=from-1;
    
    if(from<0){
      from=cir.length-1;
   }
    }
     
   cir[idx]=item;
   
    int count = start;
    count--;
    size++;
    display();
  }
  
  public String delete (int offset)throws CircularArrayException
  {
      int index;
      index = (start + offset)% cir.length;
      String remove=cir[index];
      int nShifts = size - offset - 1;
      int to = index;
int from = (to + 1) % cir.length;
for (int i = 0; i <= nShifts; i++) {
cir[to] = cir[from];
// advance to and from forwards.
to = from;
from = (from + 1) % cir.length;
}
cir[from] = null;
    display();
    return remove;
  }
  
  public void display(){
    int i = 0;
    int st = start;
    while(i<size){
      
      System.out.print(cir[st]+" ");
        
      i++;
      st = (st+1)%cir.length;
    }
    System.out.println();
  }

//    public void insert(String string, int i) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

   

        
    }
  

