package mathematic;

public class primeNumber {
    public static boolean primeNo(int n){
        if(n==1 || n==0)
        return false;
        for (int i = 2; i < n; i++) {
           if(n%i==0)
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
