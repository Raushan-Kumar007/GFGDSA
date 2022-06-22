/*Given an unsigned integer N. The task is to swap all odd bits with even bits. For example, if the given number is 23 (00010111), it should be converted to 43(00101011). Here, every even position bit is swapped with adjacent bit on the right side(even position bits are highlighted in the binary representation of 23), and every odd position bit is swapped with an adjacent on the left side.

Example 1:

Input: N = 23
Output: 43
Explanation: 
Binary representation of the given number 
is 00010111 after swapping 
00101011 = 43 in decimal.
Example 2:

Input: N = 2
Output: 1
Explanation: 
Binary representation of the given number 
is 10 after swapping 01 = 1 in decimal.

Your Task: Your task is to complete the function swapBits() which takes an integer and returns an integer with all the odd and even bits swapped.


Expected Time Complexity: O(1).
Expected Auxiliary Space: O(1).

Constraints:
1 ≤ N ≤ 109 */





package BitMagic.Problems;

public class SwapAllEvenOddBit {
    public static int swapBits(int n) 
    {
	    // Your code
	     String k="";
    String s=Integer.toBinaryString(n);
    if(s.length()%2==1)
    s="0"+s;
    for(int i=0;i<s.length();i=i+2)
    {
      if(s.substring(i,i+2).equals("00"))
      k=k+"00";
      else if(s.substring(i,i+2).equals("01"))
      k=k+"10";
      else if(s.substring(i,i+2).equals("10"))
      k=k+"01";
      else if(s.substring(i,i+2).equals("11"))
      k=k+"11";
    }
    int dec=Integer.parseInt(k,2);
    return dec;
	}
}
