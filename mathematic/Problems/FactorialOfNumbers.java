package mathematic.Problems;

public class FactorialOfNumbers {
    public long factorial(int N) {
        // Your code here
        // long result = 1;
        // for(long i = 2; i<=N; i++){
        //   result = result * i; 
        // }
        // return result;
        if(N<=0)
        return 1;
        return N*factorial(N-1);
    }
}
