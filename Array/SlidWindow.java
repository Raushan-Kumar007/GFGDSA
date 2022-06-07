package Array;

public class SlidWindow{

    // NAIVE approch to find maximum sum with timeComplexity is bigO(n^2)
    static int maxSum(int arr[], int k){
        int n = arr.length;
        int max_sum = Integer.MIN_VALUE;
        for(int i=0; i+k-1<n; i++){
            int sum = 0;
            for(int j=0; j<k; j++){
                sum += arr[i+j];
            }
            max_sum = Math.max(max_sum,sum);
        }
        return max_sum;
    }
    public static void main(String[] args) {
        int arr[] = {1, 8, 30, -5, 20, 7}; int k = 3;
        System.out.print(maxSum(arr, k));
        
    }
    
}
