package recursion;

public class palindrom {
    static boolean isplindrom(String str, int start, int end){
      if(start>=end)
      return true;
      return ((str.charAt(start)==str.charAt(end)) &&  isplindrom(str, start+1, end-1));
    }
    /*
         timeComplexity is theta(n) and Auxullary Space is theta(n)
    */
   public static void main(String[] args) {
       String str = "abba";
       int start = 0;
       int end = 3;
       if(isplindrom(str, start, end)==true)
       System.out.println("yes");
       else
       System.out.println("No");
   } 
}
