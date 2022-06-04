package Array;

public class ArraySum {
    static int SumOfArr(int arr[]){
        int n = arr.length;
        int sum = arr[0];
        int i = 1; 
        while(i<n){
            sum = sum+arr[i];
            i++;
        }
        return sum;
    }
 public static void main(String[] args) {
     int arr[] = {10,20,30,-30};
     System.out.print(SumOfArr(arr));
 }
}
