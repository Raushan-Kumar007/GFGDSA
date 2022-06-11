package Searching;

public class PeakElement {

    // Naive approch to find peak element

   /*  static int peak(int arr[]){
        int n = arr.length;
       if(n==1)
       return arr[0];
       if(arr[0]>=arr[1])
       return arr[0];
       if(arr[n-1] >= arr[n-2])
       return arr[n-1];
       for(int i=1; i<n-1; i++){
        if(arr[i]>=arr[i-1]&&arr[i]>=arr[i+1])
        return i;
       } 
       return -1;
    }*/

     static int peak(int arr[]){
        int n = arr.length;
        int left = 0; int right = n-1;
        while(left<=right){
            int mid = left + (right-left)/2;
            if((mid==0||arr[mid-1]<=arr[mid])&&(mid==n-1||arr[mid+1]<=arr[mid]))
            return mid;
            if(mid>0 && arr[mid-1]>=arr[mid])
            right = mid-1;
            else
            left = mid + 1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {5, 10, 11, 12, 20, 12};
        System.out.println(peak(arr));
    }
}
