package mathematic;

public class AllDevisorOfNum {
    // naive solution with time complexity is theta(n) and space complexity is theta(1)
    static void alldivOfNum(int n){
        for(int i=1; i<=n; i++){
            if(n%i==0){
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        int n =120;
        alldivOfNum(n);
    }
    
}
