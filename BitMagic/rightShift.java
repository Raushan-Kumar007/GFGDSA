package BitMagic;

public class rightShift {
    public static void main(String[] args) {
        int x = 33; // 00.....100001
        System.out.println(x>>1); // right shift by one 0....10000==>16
        System.out.println(x>>2); // right shift by two 00....1000==>8
        // right shift for negative number (signed right shift)
        int y = -2; // 11......10 
        System.out.println(y>>1); // right shift by one 11.......11==> -1
        //  unsigned  right shift
        System.out.println(y>>>2); // unsigned shift by two 01......11 ==> 2^30 - 1 ==> 1073741823
    }
}
