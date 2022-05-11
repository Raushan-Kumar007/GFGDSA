package BitMagic;

public class  firstSetBit{
    static int setBit(int n){
        if(n==0)
        return 0;
        return (int)(Math.log(n&-n)/Math.log(2.0)) + 1;

    }
      public static void main(String[] args) {
          System.out.println(setBit(18)); // 10010==>18
      }
}