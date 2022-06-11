package Searching;

public class SquareRoot {
    // naive approch 
    /*static int SquareRoots(int n){
        int i =1;
         while (i*i<=n) {
            i++;
         }
         return (i-1);    
    }*/
    static int SquareRoots(int x){
        int left = 1;
        int right =x;
        int res =-1;
        while(left<=right){
            int mid = left+(right-left)/2;
            int mSqr = mid*mid;
            if(mSqr==x)
            return mid;
            else if(mSqr>x)
            right=mid-1;
            else{
                left=mid+1;
                res = mid;
            }
            
        }
        return res;

    }
    public static void main(String[] args) {
        System.out.println(SquareRoots(10));
    }
    
}
