package BitMagic;

public class RightmostdifferentBit {
  /*  static int getfirstbit(int n){
        if(n==0)
        return 0;
        return (int)(Math.log(n &-n)/Math.log(2.0))+1;
    }
    static int findrightmostbitdiff(int m, int n){
        if(m==n)
        return -1;
        return  getfirstbit(m^n);
        
    }
    */
    // Secoond way to find
    static int getfirstbit(int n){
        if(n==0)
        return 0;
        int count = 0;
        while(n!=0){
            count++;
            if((n%2)==1){
                return count;
            }
            n = n>>1;
        }
        return count;
    }
    static int findrightmostbitdiff(int m, int n){
        if(m==n)
        return -1;
        return getfirstbit(m^n);
    }
    public static void main(String[] args) {
       System.out.println(findrightmostbitdiff(11, 9)); 
       /*
       m=11==>01011 n=9==>01001 m^n==> 00010 therefore 2nd bit is deffrient from other bits
       */
    }
}
