package recursion;

public class print1toN {
    //timecomplexity of the program is thete(n) and space complexity is bigO(n)
    static void Print1toN(int n){
        if(n==0)
        return; 
        Print1toN(n-1);
        System.out.print(n+" ");
    }
    public static void main(String[] args) {
         Print1toN(10);
    }
}
