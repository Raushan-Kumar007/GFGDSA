package BitMagic;

public class  firstSetBit{
    // first way 
   /* static int setBit(int n){
        if(n==0)
        return 0;
        return (int)(Math.log(n&-n)/Math.log(2.0)) + 1;

    }*/
    // second way 
    static int getSetBit(int n){
        if(n==0)
        return 0;
        int count = 0;
        while(n!=0){
            count++;
            if(n%2==1){
               return count;
            }
             n = n>>1; // right sift by 1
        }
        return count;
    }
      public static void main(String[] args) {
          System.out.println(getSetBit(0)); // 10010==>18
      }
}