/*You are given a number n. You need to find the count of digits in n.

Example 1:

Input:
n = 1
Output: 1
Explanation: Number of digit in 1 is 1.
Example 2:

Input:
n  = 99999
Output: 5
Explanation:Number of digit in 99999 is 5
Your Task:
You don't need to read input or print anything. Your task is to complete the function countDigits() that takes n as parameter and returns the count of digits in n.

Expected Time Complexity: O(Logn).
Expected Auxiliary Space: O(Logn).

Constraints:
0 <= n <= 107 */



package recursion.Problems;

public class CountTotalDigit {
    public static int countDigits(int n)
    {
        // add your code here
         if(n/10==0)
          return 1;
          return 1 + countDigits(n/10);
    }
}
