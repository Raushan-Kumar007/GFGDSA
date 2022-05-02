package mathematic;

public class factorial {
    // iterative approch 
    /*
    timecomplexity = theta(n);
    auxularySpace = theta(1);
    */
   /* public static int fact(int n){
        int result = 1;
        for(int i=2; i<=n; i++){
           result = result * i;
        }
        return result;
    }
    */
    //recursive approch
    /*
    timecomplexity = theta(n);
    auxularySpace = theta(n);

    Conclusion of this program is itrative approch is better than recursive approch becoz the auxlary space of itrative approch is theta(1) but auxlary space of recursive approch is theta(n) 
    */
    public static int fact(int n){
        if(n<=0)
        return 1;
        return n * fact(n-1);
    }
    public static void main(String[] args) {
        int num = 5;
        System.out.println(fact(num));
    }
}
