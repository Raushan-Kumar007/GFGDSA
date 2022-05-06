package mathematic;

public class primeFactor {
  /* 
   public static void primeFactor(int n){
        if(n<=0)
        return ;
        for(int i=2; i*i<=n; i++){
            while(n%i==0){
                System.out.print(i+" ");
                n = n/i;
            }
        }
        if(n>1){
            System.out.print(n+" ");
            System.out.println();
        }
     
    }
    */
    // NAIVE SOLUTION TO FIND PRIME FACTOR OF ANY NUMBER
    static boolean isPrime(int n){
        if(n==1||n==0)
        return false;
        if(n==2 || n==3)
        return true;
        if(n%2==0||n%3==0)
        return false;
        for(int i=5; i*i<=n; i= i+6){
            if(n%i==0 || n%i+2==0)
            return false;
        }
        return true;
    }
    static void PrimeFactor(int n){
        for(int i=2; i<n; i++){
            if(isPrime(i)){
                int x = i;
                while(n%x==0){
                    System.out.println(i+" ");
                    x = x * i;
                }
            }
        }
    }
    public static void main(String[] args) {
        int n = 1200;
        PrimeFactor(n);
       
    }
}
