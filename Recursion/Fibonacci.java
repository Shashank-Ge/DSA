import java.util.Scanner ;


public class Fibonacci {
    public static void main ( String [] args ) {
        Scanner sc = new Scanner ( System.in) ;
        System.out.print("Enter the number of the fibonacci series : ");
        int num = sc.nextInt() ;
        for ( int i = 1 ; i <= num ; i ++ ) {
            System.out.print (fibonacci(i) + ",") ; 
        }

    }

    static int fibonacci ( int n ) {
        if ( n == 1 ) return 0 ;
        else if ( n == 2 ) return 1 ;
        else {
            int x =  fibonacci(n-1) + fibonacci(n-2) ;
            return x ;
        }

    }

}
