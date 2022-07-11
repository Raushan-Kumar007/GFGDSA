package Shorting;

public class MinDiff {

    // Naive Approch for finding MinDiff

    static int minDiff(int arr[], int n){
        int res = Integer.MAX_VALUE;
        for(int i=1;i<n; i++){
            for(int j=0;j<i;j++)
                res =   Math.min(res,(Math.abs(arr[i]-arr[j])));     
        }
        return res;
    }
    public static void main(String[] args) {
        int arr[] = {5,3,8};
        int n = 3;
       System.out.print(minDiff(arr, n));
    }
}
