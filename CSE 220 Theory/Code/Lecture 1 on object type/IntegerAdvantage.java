public class IntegerAdvantage{
  public static void main(String[] args){
    Integer birth_year = new Integer(1980); //32 bits
    Integer current_year; //32 bits
    
    current_year = new Integer("2016"); // Error ! there is no 
                           //direct way to convert
    if (current_year != null){      /// *** important for avoiding null pointer exception
      //do your task
    }
    else{ 
      // if current_year has no value
    }
    String st = birth_year.toString(); // Error ! there is no 
                           //direct way to create 
                            //text representation
    System.out.println("current_year: "+current_year+ " type: "+ current_year.getClass());
    System.out.println("st: "+st+ " type: "+ st.getClass());
    
   }
  }