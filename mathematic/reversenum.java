package mathematic;

public class reversenum {
    // function to reverse num 
  /*  public static int revnum(int n){
        int rev = 0;   // reverse num 
        int temp = n;
        while(temp != 0){
            int lastdigit = temp % 10;   // remainder 
            rev = (rev * 10) + lastdigit;
            temp = temp /10;
        }
        return rev;

    }
    */
    /* 
       timecomplexity = theta(n) "bcoz if we give n number it will reverse n times "
    */
    // reverse a num using recursion 
    static  int rev = 0;
    public static void revnum(int n){
        if(n<=0)
        return ;
        while(n!=0){
            int lastdigit = n % 10; // remainder 
            rev = rev * 10 + lastdigit; 
            n = n / 10;
        }
    }
   public static void main(String[] args) {
       int n = 1232;
       revnum(n);
       System.out.println(rev);
   } 
}
