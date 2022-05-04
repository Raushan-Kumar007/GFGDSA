package mathematic;

public class trailingZero {
    //this solution is applicable for then value of n = 10 bcoz when we give n value >10 then we will catch overflow and output show like 0

    public static int countZero(int n){
        int fact = 1;
        for(int i=2; i<=n; i++)
            fact = fact * i;
            int res =0;
            while(fact % 10 == 0){
                res++;
                fact = fact/10;
            }
        return res;
    }
    public static void main(String[] args) {
        int num = 10;
        System.out.println(countZero(num));
    }
}
