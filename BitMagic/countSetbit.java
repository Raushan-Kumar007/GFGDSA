package BitMagic;

public class countSetbit {
    // naive solution with time complexity is theta(total bit in n)
   /* static int countSet(int n){
        int count = 0;
        while(n!=0){
            if(n%2!=0) // or also using bitwise operator if(n&1==1)
            count++;
            n = n/2;// or also using bitwise operator n = n>>2
            
        }
        return count;
    }*/
    //Brian and Kerningham Algorithm time complexity is theta(number of count)
    /*static int countSet(int n){
        int count = 0;
        while(n>0){
            n=(n&(n-1));
            count++;
        }
        return count;
    }*/
    //lookup table method to find number of count bit with timecomplexity is theta(1)
    static int[] table = new int[256];
    static void initialize(){
         table[0]=0;
        for(int i=1; i<256; i++){
            table[i]=(i&1) + table[i/2];
        }  

    }
    static int countSet(int n){
        return table[n & 0xff] + 
        table[(n >> 8) & 0xff] + 
        table[(n >> 16) & 0xff] + 
        table[n >> 24]; 
    }
    public static void main(String[] args) {
        initialize();
        int n = 9;
       System.out.println(countSet(n));
    }
}
