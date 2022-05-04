package mathematic;

public class primeNumber {
    /*
    // naive solution with time complexity is O(n)
    public static boolean primeNo(int n){
        if(n==1 || n==0)
        return false;
        for (int i = 2; i < n; i++) {
           if(n%i==0)
           return false; 
        }
        return true;
    }
    */
    // efficient solution with time complexity is O(n^1/2)
   /* public static boolean primeNo(int n){
        if(n==1 || n==0)
        return false;
        for (int i = 2; i*i < n; i++) {
           if(n%i==0)
           return false; 
        }
        return true;
    }*/
    //more efficient solution with time complexity is O(n^1/2)
    public static boolean primeNo(int n){
        if(n==1 || n==0)
        return false;
        if(n==1||n==3)
        return true;
        if(n%2==0 || n%3==0)
        return false;
        for(int i=5; i*i<=n; i= i+6){
            if(n%i==0||n%(i+2)==0)
            return false;
            
        }
        return true;
    }

    public static void main(String[] args) {
        int num = 100;
        for(int i=0; i<=num; i++){
            if(primeNo(i)){
              System.out.println(i+" ");
            }
        }
        
    }
    
}
