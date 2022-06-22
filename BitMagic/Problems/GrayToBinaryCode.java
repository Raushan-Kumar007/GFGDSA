/*Given N in Gray Code, find its binary equivalent. Return the decimal representation of the binary equivalent.



Example 1:

Input: N = 4
Output: 7
Explanation:
Given 4 representing gray code 110.
Binary equivalent of gray code 110 is 100.
Return 7 representing gray code 100.
Example 2:

Input: N = 15
Output: 10
Explanation:
Given 15 representing gray code 1000.
Binary equivalent of gray code 1000 is 1111.
Return 10 representing gray code 1111 
ie binary 1010.
Example 3:

Input: N = 0
Output: 0
Explanation: 
Zero remains the same in all systems.

Your Task: 
You don't need to read input or print anything. Your task is to complete the function grayToBinary() which accepts an integer n as an input parameter and returns decimal of the binary equivalent of the given gray code. 

Expected Time Complexity: O(log N)
Expected Auxiliary Space: O(1)

Constraints:
0 <= N <= 108 */


package BitMagic.Problems;

public class GrayToBinaryCode {
    public static int grayToBinary(int n) {
        
        // Your code here
        int x=0;
        while(n!=0){
            x=x^n;
            n=n>>1;
        }
       return x;
        
    }
}
