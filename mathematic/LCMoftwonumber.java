package mathematic;

public class LCMoftwonumber {
   /* public static int LCM(int a, int b){
        int res = Math.max(a, b);
        while(true){
            if(res%a==0 && res%b==0)
            return res;
            res++;
        } 
    }
    */
    //Efficient Solution 
    /*
    using a * b = gcd(a,b)*lcm(a,b)
    */
    public static int gcd(int a, int b){
        if(b==0)
        return a;
        return gcd(b, a%b);
    }
    public static int LCM(int a, int b){
        return (a*b)/gcd(a, b);
    }
    public static void main(String[] args) {
        int a = 40;
        int b = 60;
        System.out.println(LCM(a, b));
    }
}
