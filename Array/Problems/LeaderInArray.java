/*Given an array A of positive integers. Your task is to find the leaders in the array. An element of array is leader if it is greater than or equal to all the elements to its right side. The rightmost element is always a leader. 

 

Example 1:

Input:
n = 6
A[] = {16,17,4,3,5,2}
Output: 17 5 2
Explanation: The first leader is 17 
as it is greater than all the elements
to its right.  Similarly, the next 
leader is 5. The right most element 
is always a leader so it is also 
included.
 

Example 2:

Input:
n = 5
A[] = {1,2,3,4,0}
Output: 4 0
 

Your Task:
You don't need to read input or print anything. The task is to complete the function leader() which takes array A and n as input parameters and returns an array of leaders in order of their appearance.

 

Expected Time Complexity: O(n)
Expected Auxiliary Space: O(n)

 

Constraints:
1 <= n <= 107
0 <= Ai <= 107 */

package Array.Problems;

import java.util.ArrayList;

public class LeaderInArray {
    static ArrayList<Integer> leaders(int arr[], int n){
        // Your code here
        ArrayList<Integer> list = new ArrayList<Integer>();
        if(n==0)
        return list;
        list.add(arr[n-1]);
        int max = arr[n-1];
        for(int i=n-2; i>=0; i--){
            if(max<=arr[i]){
                max = arr[i];
                list.add(arr[i]);
            }
        }
         int low=0;int high=list.size()-1;
        while(low<high)
        {
            int temp=list.get(low);
            list.set(low,list.get(high));
            list.set(high,temp);
            low++;high--;
            
        }
        return list;
    }
}
