package recursion;

public class ropecutting {
    static int maxCut(int n, int a, int b, int c){
        if(n==0)
        return 0;
        if(n<=-1)
        return -1;
        int res = Math.max(maxCut(n-a, a, b, c), Math.max(maxCut(n-b,a,b,c), maxCut(n-c, a, b, c)));
        res = res + 1;
        return res;
    }
    public static void main(String[] args) {
        int n = 5, a = 2, b = 1, c = 5;
        System.out.println(maxCut(n, a, b, c));
    }
}
