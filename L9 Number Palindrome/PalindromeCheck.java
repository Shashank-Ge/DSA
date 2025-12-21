// to check whether a number is palindrome or not

import java.util.Scanner ;

public class PalindromeCheck {

    static boolean PalindromicNumber (int n ) {

        if (n < 0 ) return false ;

        int original = n ;
        int reversed = 0 ;

        while ( original > 0 ) {
            int digit = original % 10 ;
            reversed = reversed * 10 + digit ;
            original /= 10 ;
        }

        return n == reversed ;

    }
    public static void main(String[] args) {
        Scanner  sc = new Scanner (System.in);
        System.out.print("Enter your Number : ");
        int num = sc.nextInt() ;
        System.out.println ("Palindromic check : " + PalindromicNumber (num) ) ;
    }
}
