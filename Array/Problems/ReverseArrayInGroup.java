/*Given an array arr[] of positive integers of size N. Reverse every sub-array group of size K.

 

Example 1:

Input:
N = 5, K = 3
arr[] = {1,2,3,4,5}
Output: 3 2 1 5 4
Explanation: First group consists of elements
1, 2, 3. Second group consists of 4,5.
 

Example 2:

Input:
N = 4, K = 3
arr[] = {5,6,8,9}
Output: 8 6 5 9
 

Your Task:
You don't need to read input or print anything. The task is to complete the function reverseInGroups() which takes the array, N and K as input parameters and modifies the array in-place. 

 

Expected Time Complexity: O(N)
Expected Auxiliary Space: O(N)

 

Constraints:
1 ≤ N, K ≤ 107
1 ≤ A[i] ≤ 1018 */

package Array.Problems;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseArrayInGroup {
    void swap(ArrayList<Integer> arr, int n, int m)
    {
        int x = arr.get(n);
        int y = arr.get(m);
        arr.set(n, y);
        arr.set(m,x);
    }
    void reverseInGroups(ArrayList<Integer> arr, int n, int k) {
        // code here
          int l=0, r=k-1, p = 0;
        if(k >= n)
        {
            Collections.reverse(arr);
        }
        else
        {
            while(l < r && r < n)
            {
                swap(arr, l, r);
                l++;
                r--;
                if(l >= r)
                {
                    p = p+k;
                    l = p;
                    r = l + k -1;
                    if(r >= n)
                    {
                        r = l + (n - l)-1;
                        
                    }
                }
            }
        }
    }
}
