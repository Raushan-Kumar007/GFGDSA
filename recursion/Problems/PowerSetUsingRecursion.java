
/*You are given a string. You need to print the lexicographically sorted power-set of the string.
Note: The string s contains lowercase letter of alphabet.

Example 1:

Input:
s = a
Output: a
Explanation: empty string and a 
are only sets.
Example 2:

Input:
s = abc
Output: a ab abc ac b bc c
Explanation: empty string, 
a, ab, abc, ac, b, bc, c 
are the sets.
Your Task:
You don't need to read input or print anything. You only need to complete the function powerSet that takes string s as parameter and returns a list of subsets. The lexicographic-sorting and printing is done automatically by the driver code.

Expected Time Complexity: O(2|s|).
Expected Auxiliary Space: O(|s|). 

Constraints:
1 <= |s| <= 10 */




package recursion.Problems;

import java.util.ArrayList;

public class PowerSetUsingRecursion {
    static ArrayList<String> powerSet(String s)
    {
        // add your code here
       ArrayList<String> ls=new ArrayList<>();
        getSet(s,"",0,s.length(),ls);
        return ls;
    }
    public static void getSet(String s,String str,int i,int n,ArrayList<String> ls){
        if(i==n){
            ls.add(str);
            return;
        }
        getSet(s,str,i+1,n,ls);
        getSet(s,str+s.charAt(i),i+1,n,ls);
    }
}
