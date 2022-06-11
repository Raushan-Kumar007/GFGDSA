package Searching;

public class SquareRoot {
    // naive approch 
    static int SquareRoots(int n){
        int i =1;
         while (i*i<=n) {
            i++;
         }
         return (i-1);    
    }
    public static void main(String[] args) {
        int n = 10;
        System.out.println(SquareRoots(n));
    }
    
}
