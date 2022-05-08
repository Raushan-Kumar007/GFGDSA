package BitMagic;

public class Kthbit {
    // by left shift 
  /* static void kthbit(int n, int k){
        if(( n & (1<<(k-1))) != 0){
          System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }*/
    // by right shift
    static void isKthbit(int n, int k){
        if(((n>>(k-1)) & 1)==1){
         System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    } 
    public static void main(String[] args) {
        
       isKthbit( 5, 3);
    }
}
