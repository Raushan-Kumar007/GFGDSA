package recursion;

public class digitsum {
    static int DigitSum(int n){
        if(n<=0)
        return 0;
        return DigitSum(n/10)+n%10;
    }
    /*
      timeComplexity is theta(n) and spaceComplexity is theta(n) ittrative approch is better than recursive approch
    */
    public static void main(String[] args) {
        System.out.println(DigitSum(253));
    }
}
