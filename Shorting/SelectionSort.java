package Shorting;

public class SelectionSort {
   /*  static void Selection(int arr[]){
        int n = arr.length;
        int temp[] = new int[n];
       for(int i=0;i<n;i++){
        int min_idx = 0;
        for(int j=1; j<n; j++)
            if(arr[j]<arr[min_idx])
            min_idx = j;
            temp[i] = arr[min_idx];
            arr[min_idx]=Integer.MAX_VALUE;
       }
       for(int i=0;i<n;i++){
        arr[i]=temp[i];
       }
    }
    */

    static void Selection(int arr[]){
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            int min_idx=i;
            for(int j=i+1; j<n; j++)
                if(arr[j]<arr[min_idx])
                   min_idx=j;
                int temp = arr[min_idx];
                   arr[min_idx] = arr[i];
                   arr[i]=temp;
        }
    }
    public static void main(String[] args) {
        int arr[] = {12,6,18,3,2};
        Selection(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
