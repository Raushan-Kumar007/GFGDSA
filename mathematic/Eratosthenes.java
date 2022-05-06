package mathematic;

public class  Eratosthenes {
    //naive solution with timecomplexity bigO(n*n^1/2)
    static boolean isPrime(int n){
        if(n<=1)
        return false;
        for(int i=2; i<n; i++){
            if(n%i==0)
            return false;
        }
        return true;
    }
    static void printPrime(int n){
        for(int i=2; i<n; i++){
            if(isPrime(i)){
                System.out.println(i+" ");
            }
        }
    }
    public static void main(String[] args) {
       int n = 10;
       printPrime(n);
    }
}
