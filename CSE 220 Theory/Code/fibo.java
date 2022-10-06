import java.util.Scanner;
public class fibo{

     public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        System.out.println(fib(y));
        
     }
     public static int fib(int n){
         if(n==0 || n ==1) return n;
         else{
             return fib(n-1) + fib (n-2);
         }
     }
}