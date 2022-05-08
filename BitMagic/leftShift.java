package BitMagic;

public class leftShift {
   public static void main(String[] args) {
       int x = 3;//0000....0011
       System.out.println(x<<1);// 0000....0011 <<(leftShift by one) 000....0110 ==> 6
       System.out.println(x<<2);// 0000....0011 <<(leftShift by two) 000....01100 ==> 12
       System.out.println(x<<3);// 0000....0011 <<(leftShift by three) 000..011000 ==> 24
       int y = 4;
       int z = (x<<y); // 0000....0011[3] <<(left shift by 4) 000..0110000==>48
       System.out.println(z);
       int m = -1;// 1111.....1..1
       System.out.println(m<<1); // 1111....1 <<(left shift by 1) 1111....10==>-2
   } 
}
/*
         in general left shift for smaller number either positive or negative it is multiple by 2  for e.g :- 3 is left shift by 2 3*2*2==>12
*/