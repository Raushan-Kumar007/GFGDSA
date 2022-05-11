package recursion;

public class sumNnaturalnumber {
    static int Sumnatural(int n){
        if(n==0)
        return 0;
        return n + Sumnatural(n-1);
    }
    public static void main(String[] args) {
        System.out.println(Sumnatural(20));
    }
}
