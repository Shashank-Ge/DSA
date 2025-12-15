/*
Given an array of numbers
have to return the number which appears more times than half of the length of the array :


array = {1, 1, 2, 1, 3, 5, 1}
answer = 1
1 appears 4 times
4 > 3 ( n/2)

*/

/*
Approach 1 :
time Complexity : O (n^2)
Space Complexity : O (1) ( constant )

nested loop, to count the number of times an element occurs, the first one to occur more than n/2 times is
returned

*/


class Approach_1 {

    static int majorityElement ( int [] arr ) {
        // storing the length of the array
        int n = arr.length ;

        //pointer for every element to calculate their frequeny
        for ( int i = 0 ; i < n ; i ++ ) {
            // to count frequency of each element using a nested loop
            int count = 0 ;
            for ( int j = 0 ; j < n; j ++ ) {
                // checking the count of each element
                if (arr[i] == arr[j]) {
                    count ++ ;
                }
            }
            // returning the element which satisfies the condition
            if ( count > n/2 ) return arr[i];

        }
        // if no element satisfies the condition
        return -1 ;
    }

    public static void main(String[] args) {

        int [] nums = { 1, 1, 2, 1, 3, 5, 1 };
        System.out.println(" majority element : " + majorityElement(nums));

    }


}