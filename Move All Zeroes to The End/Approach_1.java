/*
Goal : to move all the zeroes to the end , maintaining the order of the non-zero elements

naive approach
1) create a new temp array of the same size
2) fill the non-zero elements in order  in the temp array
3) fill the remaining places with zeroes
4) fill values from temp array to original array

TIME COMPLEXITY : O(n)
SPACE COMPLEXITY : O(n)
*/
import java.util.Arrays ;

public class Approach_1 {

    static void pushZeroesToEnd (int[] arr ) {
        int n = arr.length ;
        int [] temp = new int [n] ;

        // element to keep track of the element in the temp array
        int j = 0 ;

        for (int value : arr ) {
            if ( value != 0 ) {
                temp[j] = value ;
                j++;
            }
        }

        // although step not needed, as 0 is default value set when initialised an empty int array
        while (j < n ) {
            temp[j] = 0 ;
            j++ ;
        }

        //replacing the values in the original array with the values of the temp array
        j = 0 ;
        for ( int i = 0 ; i < n ; i ++ ) {
            arr[i] = temp[j] ;
            j++ ;
        }
    }

    public static void main(String[] args) {
         int[] arr = {1, 2, 0, 4, 3, 0, 5, 0};

         pushZeroesToEnd(arr);

        System.out.println (Arrays.toString(arr)) ;
    }
}
