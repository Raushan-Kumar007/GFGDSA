package Array;

public class MaxSumCircularArr {
    // naive approch with time Complexity is BigO(n^2)
    static int maxCircularSumArr(int arr[]){
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
    }
    public static void main(String[] args) {
        int arr[] = {5,-2,3,4};
        System.out.print(maxCircularSumArr(arr));
    }
}
