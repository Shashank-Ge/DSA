/*
aPPROACH :
the element whose frequency is greater than half of the number of elements is for sure to come at the middle of the array

1) find the middle element of the sorted array 
2) check the frequency of that middle element
3) if it is greater than n/2 , return it , else return -1

TIme complexity : O ( n log(n) )
SPace Complexity : O ( 1 )
*/

import java.util.Arrays;

public class Approach_2 {

    static int majorityElement ( int [] arr ) {
        int n = arr.length ;
        // sorting the array so find the middle element ( whether it has the highest frequency or not )
        Arrays.sort(arr) ;

        //element which might have the highest frequency
        int candidate = arr[n/2] ;

        // counting the frequency of the middlemost element
        int count = 0 ;
        for ( int num : arr ) {
            if ( num == candidate ) {
                count ++ ;
            }
        }

        if ( count > n/2 ) {
            return candidate ;
        }

        return -1 ;

    }
    public static void main ( String[] args ) {
        int [] arr = {0, 0, 0, 1, 2, 3} ;
        System.out.println ( " majority element is : " + majorityElement(arr)) ;

    }

}
