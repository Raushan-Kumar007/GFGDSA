/*Given an array A of n positive numbers. The task is to find the first Equilibium Point in the array. 
Equilibrium Point in an array is a position such that the sum of elements before it is equal to the sum of elements after it.

Note: Retun the index of Equilibrium point. (1-based index)

Example 1:

Input: 
n = 5 
A[] = {1,3,5,2,2} 
Output: 3 
Explanation: For second test case 
equilibrium point is at position 3 
as elements before it (1+3) = 
elements after it (2+2). 
 

Example 2:

Input:
n = 1
A[] = {1}
Output: 1
Explanation:
Since its the only element hence
its the only equilibrium point.
 

Your Task:
The task is to complete the function equilibriumPoint() which takes the array and n as input parameters and returns the point of equilibrium. Return -1 if no such point exists.

Expected Time Complexity: O(n)
Expected Auxiliary Space: O(1)

Constraints:
1 <= n <= 106
1 <= A[i] <= 108 */

package Array.Problems;

public class EquilibriumPoint {
    public static int equilibriumPoint(long arr[], int n) {

        // Your code here
        if(n == 1)
        {
            return 1;
        }
        
        long sum = 0;
        
        for(int i = 0; i < n; i++)
        {
            sum += arr[i];
        }
        
        for(int i = 1; i < n; i++)
        {
            arr[i] = arr[i] + arr[i-1];
            
            if(arr[i-1] == (sum - arr[i]))
                return(i+1);
        }
        
        return -1;
    }
}
