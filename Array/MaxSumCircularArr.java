package Array;

public class MaxSumCircularArr {
    // naive approch with time Complexity is BigO(n^2)
   /*  static int maxCircularSumArr(int arr[]){
        int n = arr.length;
        int res = arr[0];
        for(int i=1; i<n; i++){
            int Curr_Max = arr[i];
            int Curr_Sum = arr[i];
            for(int j=1; j<n; j++){
                int index = (i+j)%n;
                Curr_Sum += arr[index];
                Curr_Max = Math.max(Curr_Max, Curr_Sum);
            }
            res = Math.max(res, Curr_Max);
        }
        return res;
    }*/

    // efficient Approch  timecomplexity is theta(n)
    static int NormalMaxSum(int arr[]){  /* Standard kadanes Algorithm */
        int n = arr.length;
        int res = arr[0];
        int maxEnd = arr[0];
        for(int i=1; i<n; i++){
            maxEnd = Math.max(arr[i], maxEnd+arr[i]);
            res = Math.max(res, maxEnd);
        }
        return res;
    }
    static int overallSum(int arr[]){
        int n = arr.length;
        int max_normal = NormalMaxSum(arr);  /*Normal Sum*/
        if(max_normal<0)
        return max_normal;
        int arr_sum = 0;          /*Circular Sum*/
        for(int i=0; i<n; i++){
            arr_sum += arr[i];
            arr[i] = -arr[i];
        }
        int max_Circular = arr_sum + NormalMaxSum(arr);
        return Math.max(max_normal,max_Circular);
    }
    public static void main(String[] args) {
        int arr[] = {5,-2,3,4};
        System.out.print(overallSum(arr));
    }
}
