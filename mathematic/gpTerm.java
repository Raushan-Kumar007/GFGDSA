package mathematic;

public class gpTerm {
    static double gp(int A, int B, int C){
        /*
        by using formula number of term in gp = a*r^(n-1), r = b/a;
        */
        double div = (double)B/A;
        double ans = Math.pow(div,C-1);
        return Math.floor(A*ans);
    }
    public static void main(String[] args) {
        int A=84, B = 87, C=3;
       System.out.println(gp(A, B, C));
    }
}
