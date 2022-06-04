package Array;

public class maxisumSubarr {
    // naive approch with timeComplexity is theta(n^2)
    static int MaxSum(int arr[]){
        int n = arr.length;
        int res = arr[0];
        for(int i=0; i<n;i++){
            int curr = 0;
            for(int j = i+1; j<n; j++){
                curr = curr + arr[j];
                res = Math.max(res, curr);
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int arr[] = {1,-2,3,-1,2};
        System.out.print(MaxSum(arr));
    }
}
