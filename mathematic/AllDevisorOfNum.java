package mathematic;

public class AllDevisorOfNum {
    // naive solution with time complexity is theta(n) and space complexity is theta(1)
   /* static void alldivOfNum(int n){
        for(int i=1; i<=n; i++){
            if(n%i==0){
                System.out.println(i);
            }
        }
    }*/
    // efficient solution with time complexity is theta(n^1/2)
   /* static void alldivOfNum(int n){
        for(int i=1; i*i<=n; i++){
            if(n%i==0){
                System.out.println(i);
                if(i!=n/i){
                    System.out.println(n/i);
                }
            }
        }
    }*/
    // more efficient solution to find devisor of a number with time complexity is theta(n^1/2) and auxulary space is theta(1)
    static void alldivOfNum(int n){
        int i;
        for( i=1; i*i<n; i++){
            if(n%i==0){
                System.out.print(i+" ");
            }
        }
            for ( ;i>=1; i--) {
                if(n%i==0){
                    System.out.print(n/i+" ");
                }
            }
        }
    public static void main(String[] args) {
        int n =120;
        alldivOfNum(n);
    }
    
}
