package BitMagic;

public class powerOFtwo {
    // simple naive solution for finding the power of 2
    static boolean powerof2(int n){
        if(n==0)
        return false;
        while (n != 1) {
            if(n%2 != 0)
            return false;
            n = n>>2;//n = n/2
        }
        return true;
    }

   public static void main(String[] args) {
       int n = 16;
       if(powerof2(n)==true)
       System.out.println("YES");
       else
       System.out.println("NO");
   } 
}
