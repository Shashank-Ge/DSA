/*
same as approach 2
instead of changing values of 0 eleemnts with the non-zero elements
we sawp the zero elements with the non-zero elements
 */
import java.util.Arrays;
public class Approach_3 {
    static void pushZeroesToEnd (int [] arr ) {
        int n = arr.length ;
        int count = 0 ;

        for (int i = 0 ; i < n ; i++ ) {
            if (arr[i] != 0 ) {
                count ++ ;
            }
            else {
                
            }
        }
    }
    public static void main(String[] args) {
        int [] nums = {1,2,0,4,3,0,5,0} ;

        pushZeroesToEnd (nums );

        System.out.println (Arrays.toString (nums) ) ;
    }
}
