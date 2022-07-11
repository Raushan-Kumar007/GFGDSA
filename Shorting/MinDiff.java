package Shorting;

import java.util.Arrays;

public class MinDiff {

    // Naive Approch for finding MinDiff

   /*  static int minDiff(int arr[], int n){
        int res = Integer.MAX_VALUE;
        for(int i=1;i<n; i++){
            for(int j=0;j<i;j++)
                res =   Math.min(res,(Math.abs(arr[i]-arr[j])));     
        }
        return res;
    }
    */
    static int minDiff(int arr[], int n){
        Arrays.sort(arr);
        int res = Integer.MAX_VALUE;
        for(int i=1;i<n;i++){
            res = Math.min(res,arr[i]-arr[i-1]);
        }
        return res;
    }
    public static void main(String[] args) {
        int arr[] = {10,3,20,12};
        int n = 4;
       System.out.print(minDiff(arr, n));
    }
}
