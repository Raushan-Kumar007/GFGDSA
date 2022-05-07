package BitMagic;

public class BitwiseOR {
    public static void main(String[] args) {
        int x = 3; // 0...0011
        int y = 6 ;// 0...0110
        // 0011 | 0110 ==> 0111 (if both the input is 0 then the output is 0 otherwise output is 1)
        System.out.println(x|y);
    }
}
