/*
Moore's Voting algo

1) apply moore's voting algo , if an element exists it might be a majority element
2) check whether the existing elemnt is a majority elemnt or not


Time Complexity : O(n)
Space Complexity : O(1) 
*/


public class Approach_4 {

    static int majorityElementMoore ( int [] arr ) {
        int n = arr.length ;
        int ele = -1 ;
        int count = 0 ;

        // moore's voting loop to find candidate
        for ( int value : arr ) {
            if (count == 0 ) {
                ele = value ;
                count = 1 ;
            }else if (value == ele ){
                count ++ ;
            }else {
                count -- ;
            }
        }

        //find the frequency of the candidate
        count = 0 ;
        for ( int val : arr ) {
            if ( val == ele ) count ++ ;
        }

        //validate the moore's voting system
        if (count > n/2 ) return ele ;
        else return -1 ;

    }

    public static void main(String[] args) {
        int [] arr = { 1, 1, 2, 1, 3, 5, 1 } ;
        System.out.println ("The majority element is : " +  majorityElementMoore(arr));
    }

}
