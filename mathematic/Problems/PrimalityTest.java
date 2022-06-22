
/*A prime number is a number which is only divisible by 1 and itself.
Given number N check if it is prime or not.

 

Example 1:

Input:
N = 5
Output: Yes
Explanation: 5 is only divisible by 1 
and itself. So, 5 is a prime number.
 

Example 2:

Input:
N = 4
Output: No
Explanation: 4 is divisible by 2. 
So, 4 is not a prime number.
 

Your Task:
You don't need to read input or print anything. Your task is to complete the function isPrime() that takes N as input parameter and returns True if N is prime else returns False. 

 

Expected Time Complexity : O(N1/2)
Expected Auxilliary Space :  O(1)

 

Constraints:
1 <= N <= 109
 */





package mathematic.Problems;

public class PrimalityTest {
    public boolean isPrime(int N) {
        // code here
        if(N==0||N==1)
        return false;
        if(N==2 || N==3)
        return true;
        if(N%2==0 || N%3==0)
        return false;
        for(int i=5; i*i<=N; i=i+6){
            if(N%i==0 || N%(i+2)==0)
            return false;
        }
        return true;
      }
}
