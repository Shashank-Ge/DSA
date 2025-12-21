/*
Two traversal approach

we iterate through the array and move the non-zero elements to the front
how ?
1) whenevr a zero is occured , replace it with the next non-zero element
2) now after all non-zero elements , replace all the remaining elements ( on the irght side ) with zero


Time COmplexity : O(n)
Space Complexity : O(1)
*/

public class Approach_2 {

    static void pushZeroesToEnd ( int   [] arr ) {
        int n = arr.length ;

        // for keeping track of the index of the modified array
        int count = 0 ;

        // making te zero elements as their next non-zero elements
        for (int i = 0 ; i < n ; i++ ) {
            if (arr[i] != 0 ) {
                arr[count++] = arr[i] ;
            }
        }

        // making the rest of the array as zero , after the non-zero elements are finished
        while ( count < n ) {
            arr[count++] = 0 ;
        }

    }
    public static void main(String[] args) {
        int [] arr = { 1,2,0,4,3,0,5,0} ;
        pushZeroesToEnd (arr ) ;

        for (int val : arr ) {
            System.out.print ( val + " ");
        }
    }

}
