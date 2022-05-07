package mathematic;

public class power {
  /*  static int Power(int x, int n){
        int res = 1;
        for(int i=0; i<n; i++){
            res = res * x;
        }
        return res;
    }*/
   // efficient solution with timecomplexity is thete(logn) and spacecomplexity is theta(logn)
    static int Power(int x, int n){
        if(n==0)
        return 1;
        int temp = Power(x,n/2);
        temp = temp*temp;
        if(n%2==0)
        return temp;
        else
        return temp*x;
    }
    public static void main(String[] args) {
        
       System.out.println(Power(3, 4));

    }
}
