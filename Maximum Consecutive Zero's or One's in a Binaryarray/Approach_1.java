/*
given a binary array, we have to return the longest streak , of 1 or of 0

Time COmplexity : O(n)
Space Complexity : O(1)


two variables : count , maxCount
iterate over the array
if matched with the previous element, update the count
if not matches , then maxCount = max(maxCount, count ) , count = 1

at the end return count
*/
public class Approach_1 {
    static int longestStreak ( int [] nums ) {
        int n = nums.length ;
        int count = 1 ;
        int maxCount = 0 ;

        // iterating over the array , starting from the second element
        for ( int i = 1 ; i < n ; i++ ) {
            // if the current element is equal to the previous one, update the count
            if ( (nums[i] ^ nums[i-1]) == 0 ) {
                // if (nums[i] == nums[i-1])
                count ++ ;
            }
            // if not then store the maximum count uptil now in the  maxCount
            // and update the count
            else{
                maxCount = Math.max (maxCount, count ) ;
                count = 1 ;
            }
        }
        // returning the maximum out of the currrent max (count) which could be a maximum value , or the stored maximum count (maxCount)
        return Math.max (maxCount , count ) ;
    }
public static void main(String[] args) {
        int [] nums = {0,1,0,0,0,0,0,1,1,1,1} ;
        System.out.println ("The longest streak is : " + longestStreak(nums)) ;
    }
}
