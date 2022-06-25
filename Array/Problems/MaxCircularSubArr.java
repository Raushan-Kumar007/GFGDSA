/*Given an array arr[] of N integers arranged in a circular fashion. Your task is to find the maximum contiguous subarray sum.


Example 1:

Input:
N = 7
arr[] = {8,-8,9,-9,10,-11,12}
Output:
22
Explanation:
Starting from the last element
of the array, i.e, 12, and 
moving in a circular fashion, we 
have max subarray as 12, 8, -8, 9, 
-9, 10, which gives maximum sum 
as 22.
Example 2:

Input:
N = 8
arr[] = {10,-3,-4,7,6,5,-4,-1}
Output:
23
Explanation: Sum of the circular 
subarray with maximum sum is 23

Your Task:
The task is to complete the function circularSubarraySum() which returns a sum of the circular subarray with maximum sum.


Expected Time Complexity: O(N).
Expected Auxiliary Space: O(1).


Constraints:
1 <= N <= 106
-106 <= Arr[i] <= 106

 */

package Array.Problems;

public class MaxCircularSubArr {
    static int circularSubarraySum(int a[], int n) {
        
        // Your code here
        return Integer.max(kadane(a,n), reverseKadane(a,n));
    }
     static int kadane(int a[], int n)
   {
       int max = Integer.MIN_VALUE, sum = 0;
       for(int x:a)
       {
           sum = Math.max(x,sum+x);
           max = Math.max(max,sum);
       }
       return max;
   }
   static int reverseKadane(int a[], int n)
   {
       int min = Integer.MAX_VALUE, sum = 0, total = 0;
       for(int x:a)
       {
           total += x;
           sum = Math.min(x, sum+x);
           min = Math.min(min, sum);
       }
       return total!=min?(total - min):total;
   }
}
