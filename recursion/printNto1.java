package recursion;

public class printNto1 {
    // timecomplexility of this program is theta(n) auxillary space is theta(n)
    static void PrintNto1(int n){
        if(n==0)
        return ;
       System.out.print(n+" ");

        PrintNto1(n-1);;
    }
    public static void main(String[] args) {
        PrintNto1(10);
    }
}
