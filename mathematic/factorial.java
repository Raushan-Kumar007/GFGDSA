package mathematic;

public class factorial {
    // iterative approch 
    /*
    timecomplexity = theta(n);
    auxularySpace = theta(1);
    */
    public static int fact(int n){
        int result = 1;
        for(int i=2; i<=n; i++){
           result = result * i;
        }
        return result;
    }
    public static void main(String[] args) {
        int num = 3;
        System.out.println(fact(num));
    }
}
