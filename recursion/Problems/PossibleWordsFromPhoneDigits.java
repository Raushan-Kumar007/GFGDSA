/*Given a keypad as shown in the diagram, and an N digit number which is represented by array a[ ], the task is to list all words which are possible by pressing these numbers.


Example 1:

Input: N = 3, a[] = {2, 3, 4}
Output:
adg adh adi aeg aeh aei afg afh afi 
bdg bdh bdi beg beh bei bfg bfh bfi 
cdg cdh cdi ceg ceh cei cfg cfh cfi 
Explanation: When we press 2,3,4 then 
adg, adh, adi, ... cfi are the list of 
possible words.
Example 2:

Input: N = 3, a[] = {3, 4, 5}
Output:
dgj dgk dgl dhj dhk dhl dij dik dil 
egj egk egl ehj ehk ehl eij eik eil 
fgj fgk fgl fhj fhk fhl fij fik fil
Explanation: When we press 3,4,5 then 
dgj, dgk, dgl, ... fil are the list of 
possible words.
Your Task:
You don't need to read input or print anything. You just need to complete the function possibleWords() that takes an array a[ ] and N as input parameters and returns an array of all the possible words in lexicographical increasing order. 

Expected Time Complexity: O(4N * N).
Expected Auxiliary Space: O(N).

Constraints:
1 ≤ N ≤ 10
2 ≤ a[i] ≤ 9 */





package recursion.Problems;

import java.util.ArrayList;

public class PossibleWordsFromPhoneDigits {
    static ArrayList <String> possibleWords(int a[], int N)
    {
        // your code here  
             ArrayList<String> res = fetchCombinations(a,N,0);
        return res;
    }
    
    private static ArrayList<String> fetchCombinations(int[] a, int n, int current)
    {
        if(current == n)
        {
            ArrayList<String> res = new ArrayList<>();
            res.add("");
            return res;
        }
        
        int currentNum = a[current];
        String currentString = "";
        
        switch(currentNum)
        {
            case 1 : currentString = ""; break;
            case 2 : currentString = "abc"; break;
            case 3 : currentString = "def"; break;
            case 4 : currentString = "ghi"; break;
            case 5 : currentString = "jkl"; break;
            case 6 : currentString = "mno"; break;
            case 7 : currentString = "pqrs"; break;
            case 8 : currentString = "tuv"; break;
            case 9 : currentString = "wxyz"; break;
            case 0 : currentString = ""; break;
            default : currentString = ""; break;
        }
        
        ArrayList<String> others = fetchCombinations(a,n,current + 1);
        ArrayList<String> res = new ArrayList<>();
        
        for(int i = 0; i<currentString.length(); i++)
        {
            String curr = ""+currentString.charAt(i);
            
            for(String str : others)
            res.add(curr+str);
        }
        
        return res;
    }
}
