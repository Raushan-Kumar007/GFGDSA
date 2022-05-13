package mathematic;

public class sumOfDigit {
    static int digitSum(int n){
        if(n<=0)
        return 0;
        int sum = 0;
        while(n!=0){
          sum = sum + n%10;
          n = n/10;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(digitSum(253)); // 2 + 5 + 3 ==> 10
    }
}
