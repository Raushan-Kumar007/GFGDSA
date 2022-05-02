package mathematic;

public class reversenum {
    // function to reverse num 
    public static int revnum(int n){
        int rev = 0;   // reverse num 
        int temp = n;
        while(temp != 0){
            int lastdigit = temp % 10;   // remainder 
            rev = (rev * 10) + lastdigit;
            temp = temp /10;
        }
        return rev;

    }
   public static void main(String[] args) {
       int n = 1232;
       System.out.println(revnum(n));
   } 
}
