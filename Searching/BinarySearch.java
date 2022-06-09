package Searching;

public class BinarySearch {
    // iterative Approch to find a element in shorted Array
   /*  static int BinarySrch(int arr[],int x){
      int n = arr.length;
      int left = 0; 
      int right = n-1;   
      while(left<=right){
        int mid = left + (right -left)/2;
           if(arr[mid]==x){
               return mid;
           }else if(arr[mid]>x){
               right = mid-1;
           }else{
            left = mid +1;
           }
      }
       return -1;
    }
    */
    static int BinarySrch(int arr[],int x,int left, int right){
        int mid = left + (right - left)/2;
        if(arr[mid]==x)
        return mid;
        else if(arr[mid]>x)
        return BinarySrch(arr, x, left, mid-1);
        else{
            return BinarySrch(arr, x, mid+1, right);   
        }
    }
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50};
        int n = 5;
        System.out.print(BinarySrch(arr,40,0,n-1));
    }
}
