package BitMagic;

public class countSetbit {
    // naive solution with time complexity is theta(total bit in n)
   /* static int countSet(int n){
        int count = 0;
        while(n!=0){
            if(n%2!=0) // or also using bitwise operator if(n&1==1)
            count++;
            n = n/2;// or also using bitwise operator n = n>>2
            
        }
        return count;
    }*/
    //Brian and Kerningham Algorithm time complexity is theta(number of count)
    static int countSet(int n){
        int count = 0;
        while(n>0){
            n=(n&(n-1));
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        int n = 9;
       System.out.println(countSet(n));
    }
}
