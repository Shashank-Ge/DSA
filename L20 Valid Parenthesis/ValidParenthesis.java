import java.util.Scanner ;
import java.util.Stack ;

public class ValidParenthesis {
    static boolean validParenthesis  (String s ) {
        Stack <Character> stack = new Stack <>() ;

        for ( char c : s.toCharArray () ) {

            if (c == '(' ) stack.push (')' ) ;
            else if (c == '{' ) { stack.push ('}' ); }
            else if (c == '[' ) { stack.push (']' ); }
            else if ( stack.empty()  || stack.pop() != c ) {
                return false ;
            }
        }
        return stack.isEmpty()  ;
    }
    public static void main (String [] args ) {
        Scanner sc = new Scanner (System.in) ;
        System.out.print ("Enter your bracket string : ");
        String s = sc.next() ;

        System.out.println ("Valid Parenthesis Check : " + validParenthesis(s) );

    }
}
