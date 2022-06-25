/*Given an array Arr[] of N integers. Find the contiguous sub-array(containing at least one number) which has the maximum sum and return its sum.


Example 1:

Input:
N = 5
Arr[] = {1,2,3,-2,5}
Output:
9
Explanation:
Max subarray sum is 9
of elements (1, 2, 3, -2, 5) which 
is a contiguous subarray.
Example 2:

Input:
N = 4
Arr[] = {-1,-2,-3,-4}
Output:
-1
Explanation:
Max subarray sum is -1 
of element (-1)

Your Task:
You don't need to read input or print anything. The task is to complete the function maxSubarraySum() which takes Arr[] and N as input parameters and returns the sum of subarray with maximum sum.


Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)


Constraints:
1 ≤ N ≤ 106
-107 ≤ A[i] ≤ 107 */

package Array.Problems;

public class KedansAlogorithm {
    long maxSubarraySum(int arr[], int n){
        
        // Your code here
        int max_curr = arr[0], max_all = arr[0];
       for(int i = 1 ; i < n; i++) 
       {
           max_curr = Math.max(arr[i], max_curr + arr[i]);
           max_all = Math.max(max_all, max_curr);
       }
       return max_all;
        
    }
}
