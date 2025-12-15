
/*
solve using a hashmap,
first iterate over the array

if the elemnt is present inside the hashmap then update the frequency
if not then put it , with a frequency of 1

while updating the frequency,if the frequency is grater than n/2 , return that


Time COmplexity : O(n)
Space Complexity : O(n)
*/

import java.util.HashMap;
import java.util.Map;

public class Approach_3 {

    static int majorityElement ( int [] arr ) {
        int n = arr.length ;
        //creating our hashmap
        Map <Integer, Integer> countMap = new HashMap<>() ;

        for ( int number : arr ) {
            // updating the hashmap for each occurence of the number
            if (countMap.containsKey(number) ) {
                countMap.put(number , countMap.get(number) + 1 );
            }
            // putting the new element in the hashmap if not present already
            else  {
                countMap.put(number, 1 ) ;
            }

            //returning if frequency exeeds n/2
            if (countMap.get(number) > n/2 ){
                return number ;
            }
        }

        return -1 ;
    }
    public static void main(String[] args) {
        int [] arr = { 3, 3, 4, 2, 4, 4, 2, 4};
        System.out.println("The majority element is : " +majorityElement (arr) );
    }

}
