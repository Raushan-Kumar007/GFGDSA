
/*You are given a number n. You need to find nth Fibonacci number.
F(n)=F(n-1)+F(n-2); where F(1)=1 and F(2)=1

Example 1:

Input:
n = 1
Output: 1
Explanation: The first fibonacci
 number is 1
Example 2:

Input:
n = 20
Output:6765
Explanation: The 20th fibonacci 
number is 6765
Your Task:
You don't need to read input or print anything. You only need to complete the function fibonacci that takes n as parameters and returns the n-th fibonacci number.

Expected Time Complexity: O(2n).
Expected Auxiliary Space: O(N).

Constraints:
1 <= n <= 20 */


package recursion.Problems;

public class FibonacciUsingRecursion {
    static int fibonacci(int n)
    {
        // your code here
        if(n<=1)
         return n;
         return fibonacci(n-1)+fibonacci(n-2);
    }
}
