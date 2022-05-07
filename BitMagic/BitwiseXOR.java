package BitMagic;

public class BitwiseXOR {
    public static void main(String[] args) {
        int x = 3; // 0...0011
        int y = 6; // 0...0110
        // 0011 ^ 0110 ==> 0101 (if both the input is same then the output is always zero)
        System.out.println(x^y);
    }
}
