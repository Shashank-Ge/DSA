
import java.util.Arrays;

public class MergeSortLearn {
    public static void main ( String [] args ) {
        int [] arr = {5,4,3,2,1} ;
        int [] sorted = mergeSort(arr) ;
        System.out.println (Arrays.toString(sorted)) ;

    }


    static int[] mergeSort ( int [] arr ) {
        // main recursive function 

        if (arr.length == 1) return arr ;

        int mid = arr.length/2 ;

        int [] left = mergeSort(Arrays.copyOfRange(arr, 0, mid)) ;
        int [] right =mergeSort(Arrays.copyOfRange(arr, mid,arr.length)) ;

        return merge ( left , right ) ;


    }

    static int[] merge (int[] first , int[] second ) {
        // function to take two arrays and store them in a new sorted merged array
        int i = 0 ;
        int j = 0 ;
        int k = 0 ;

        int [] mix = new int[first.length + second.length];

        while (i < first.length && j < second.length ) {
            if (first[i] < second[j]) {
                mix[k] = first[i] ;
                i++ ;
            }else{
                mix[k] = second[j];
                j++ ;
            }
            k++ ;
        }

        // handling the case where one of the array runs out
        while (i < first.length ) {
            mix[k] = first[i] ;
            i++ ;
            k++ ;
        }

        while ( j < second.length ) {
            mix[k] = second[j] ;
            j++;
            k++;
        }

        return mix ;
    }
}
