package BitMagic;

public class countTotalsetBit {
  /*  static int countSetBits(int n)
    {
        //Ignoring 0 as all the bits are unset. 
        n+=1;
        int count=0;
        
        //Counting set bits from 1 to n.
        for( int x=2 ; x/2<n ; x=x*2 )
        {
            //Total count of pairs of 0s and 1s.
            int quotient = n/x;
            //quotient gives the complete count of pairs of 1s.
            //Multiplying it with the (current power of 2)/2 will give
            //the count of 1s in the current bit.
            count += quotient * x / 2;
            
            int remainder = n%x;
            //If the count of pairs is odd then we add the remaining 1s 
            //which could not be grouped together. 
            if(remainder > x/2)
                count += remainder - x/2;
        }
        
        //returning count of set bits.
        return count;
    }*/
    // otherway to find total count of set bit
    static int largestPowerOfTwo(int n){
        int x=0;
        while((1<<x) <= n){
            x++;
        }
        return x-1;
   }
       public static int countSetBits(int n){
       
           // Your code here
           int x = largestPowerOfTwo(n);
          if(n==0)
        return 0;
         else return (1<<(x-1))*x + (n- (1<<x) +1 ) + countSetBits( n- (1<<x)); 
       }
   
    public static void main(String[] args) {
        System.out.println(countSetBits(4));
    }
}
