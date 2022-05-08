package BitMagic;

public class BitwiseNOT {
    public static void main(String[] args) {
        int x = 5;// x = 0000....0101 
        System.out.println(~x);
        // (2^32-1-5)==>(2^32-6)==> so output is -6; compare it with 2^32-x
    }
}
