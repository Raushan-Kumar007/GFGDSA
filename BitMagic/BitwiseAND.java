package BitMagic;

public class BitwiseAND {
   public static void main(String[] args) {
       int x =3; // 0....0011
       int y =6; // 0....0110
       /*
       0011 & 0110 = 0010 ==> 2 (if both the input is one then we get output as one otherwise zero)
       */
       System.out.println(x&y);
   } 
}
