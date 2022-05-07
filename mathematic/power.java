package mathematic;

public class power {
    static int Power(int x, int n){
        int res = 1;
        for(int i=0; i<n; i++){
            res = res * x;
        }
        return res;
    }
    public static void main(String[] args) {
        
       System.out.println(Power(3, 4));

    }
}
