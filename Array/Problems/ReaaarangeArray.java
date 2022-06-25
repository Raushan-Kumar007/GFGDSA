package Array.Problems;
/*Given a sorted array of positive integers. Your task is to rearrange  the array elements alternatively i.e first element should be max value, second should be min value, third should be second max, fourth should be second min and so on.
Note: Modify the original array itself.

Example 1:

Input:
N = 6
arr[] = {1,2,3,4,5,6}
Output: 6 1 5 2 4 3
Explanation: Max element = 6, min = 1, 
second max = 5, second min = 2, and 
so on... Modified array is : 6 1 5 2 4 3.
Example 2:

Input:
N = 11
arr[]={10,20,30,40,50,60,70,80,90,100,110}
Output:110 10 100 20 90 30 80 40 70 50 60
Explanation: Max element = 110, min = 10, 
second max = 100, second min = 20, and 
so on... Modified array is : 
110 10 100 20 90 30 80 40 70 50 60.
Your Task:
The task is to complete the function rearrange() which rearranges elements as explained above. Printing of the modified array will be handled by driver code.

Expected Time Complexity: O(N).
Expected Auxiliary Space: O(1).

Constraints:
1 <= N <= 106
1 <= arr[i] <= 107

 */
public class ReaaarangeArray {
    public static void rearrange(long arr[], int n){
        
        // Your code here
          if(arr.length==1){
           return;
       }
       long temp[]=new long[arr.length];
       int mid=(arr.length/2)-1;
       for(int i=arr.length-1,j=0;i>mid;){
           temp[j]=arr[i];
           i--;
           j=j+2;
       }
       for(int i=0,j=1;i<=mid;){
           temp[j]=arr[i];
           i++;
           j=j+2;
       }
       //copy all elements of temp to arr
       for(int i=0;i<temp.length;i++){
           arr[i]=temp[i];
       }
        
    }
}
