/* 

    A number is said to be a sparse number if no two or more consecutive bits are set in the binary representation.
     timecomplexity is theta(logn)

     Input: N = 2
     Output: 1
     Explanation: Binary Representation of 2 is 10, 
     which is not having consecutive set bits. 
     So, it is sparse number.

     *************************
     Input: N = 3
     Output: 0
     Explanation: Binary Representation of 3 is 11, 
     which is having consecutive set bits in it. 
     So, it is not a sparse number.
*/



package BitMagic;

public class NisSparse {
    public static boolean isSparse(int n){
        if(n == 0){
            return true;
        }
        int one = 0;
        while(n>0){
            if((n & 1) != 0){
                if(one == 1){
                    return false;
                }
                one = 1;
            }else{
                one = 0;
            }
            n = n >> 1;
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(isSparse(16));
        
    }
}
