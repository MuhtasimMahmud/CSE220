import java.util.Scanner;
import java.util.Arrays;
public class fiboWithMemoization{
    static long[] F = new long[100];
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        // for(int i = 0; i<F.length; i++){
        //     F[i] = -1;
        // }
        Arrays.fill(F, -1);
        System.out.println(fib(y));
        
     }
    public static long fib(int n){
         if(n==0 || n ==1) return n;
         if(F[n] != -1) return F[n];
         else{
             F[n] = fib(n-1) + fib (n-2); 
             return F[n];
         }
     }
}
