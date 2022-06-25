/*Given an array arr[] of N distinct integers, check if this array is Sorted (non-increasing or non-decreasing) and Rotated counter-clockwise. Note that input array may be sorted in either increasing or decreasing order, then rotated.
A sorted array is not considered as sorted and rotated, i.e., there should be at least one rotation.

Example 1:

Input:
N = 4
arr[] = {3,4,1,2}
Output: Yes
Explanation: The array is sorted 
(1, 2, 3, 4) and rotated twice 
(3, 4, 1, 2).
Example 2:

Input:
N = 3
arr[] = {1,2,3}
Output: No
Explanation: The array is sorted 
(1, 2, 3) is not rotated.
Your Task:
The task is to complete the function checkRotatedAndSorted() which returns true if an array is sorted and rotated clockwise otherwise false.

Expected Time Complexity: O(N).
Expected Auxiliary Space: O(1).

Constraints:
1 <= N <= 106
1 <= A[i] <= 106

 */

package Array.Problems;

public class CheckIfArrayIsShortedOrRotated {
    public static boolean checkRotatedAndSorted(int arr[], int num){
        
        // Your code here
         if(num == 2){
            return true;
        }else if(num ==1){
            return false;
        }else if(num == 3){
            return (arr[1] < arr[2] && arr[1] < arr[0]) || (arr[1] > arr[2] && arr[1] > arr[0]);
        }
        
        int max = -1;
        int min = Integer.MAX_VALUE;
        int maxIndex = -1;
        int minIndex = -1;
        
        for(int i = 0; i< num; i++){
            if(max < arr[i]){
                max = arr[i];
                maxIndex = i;
            }
            
            if(min > arr[i]){
                min = arr[i];
                minIndex = i;
            }
        }
        
        //If arrasy is sorted but not rotated than max and min index are at furthest distance or at the ends of the array.
        if(Math.abs(maxIndex-minIndex)==(num-1)){
            return false;
        }else if(minIndex == (maxIndex+1)){// for increasing order
            // last element should be less than first element
            if(arr[num-1] < arr[0]){
                return true;
            }else{
                return false;
            }
        }else if(minIndex == (maxIndex-1)){ // for decreasing order
            // last element should be graeter than first element
            if(arr[num-1] > arr[0]){
                return true;
            }else{
                return false;
            }
        }else {
            return false;
        }
    }
}
