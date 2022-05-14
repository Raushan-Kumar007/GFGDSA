package mathematic;

public class trailingZero {
    //this solution is applicable for the value of n = 10 bcoz when we give n value >10 then we will issues like overflow and output show like 0
   /*
      timecomplexity is theta(n)
   */
    /*
    public static int countZero(int n){
        int fact = 1;
        for(int i=2; i<=n; i++)
            fact = fact * i;
            int res =0;
            while(fact % 10 == 0){
                res++;
                fact = fact/10;
            }
        return res;
    }
    */
    // this is the most efficient solution now in this solution we have no issues  like overflow and give proper output 
    /*
      timecomplexity is theta(logn)
    */ 
    public static int countZero(int n){
        int res = 0;
        for(int i=5; i<=n; i=i+5)
        res = res + n/i;
        return res;
    }
    public static void main(String[] args) {
        int num = 251;
        System.out.println(countZero(num));
    }
}
