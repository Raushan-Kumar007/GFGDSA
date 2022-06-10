package Searching;

public class LastOccurenceInShortedArr {
    // Naive approch to find Last occurence in shorted array with bigO(n) time complexity
   /*  static int lastOcuurence(int arr[], int x){
       int n = arr.length;
        for(int i=n-1; i>=0; i--){
           if(arr[i]==x)
           return i;
      }  
      return -1;
    }
    */
    // iterative approch to find last occurence in shoreted array with log(n) time complexity
    /*static int lastOcuurence(int arr[], int x){
        int n = arr.length;
        int left = 0;
        int right = n-1;
        while(left<=right){
            int mid = left + (right - left)/2;
            if(arr[mid]<x)
            left = mid+1;
            else if(arr[mid]>x)
            right = mid-1;
            else{
                if(mid==n-1||arr[mid]!= arr[mid+1])
                return mid;
                else
                left = mid + 1;
            }
        }
        return -1;

    }*/

    // recursive approch to find lastOccurence of element in array

    static int lastOcuurence(int arr[], int x, int left, int right){
        int n = arr.length;
        if(left>right)
        return -1;
        int mid = left + (right-left)/2;
        if(arr[mid]<x)
        return lastOcuurence(arr, x, mid+1, right);
        else if(arr[mid]>x)
            return lastOcuurence(arr, x, left, mid-1);
        else{
            if(mid==n-1||arr[mid]!=arr[mid+1])
            return mid;
            else
            return lastOcuurence(arr, x, mid+1, right);
      
        }
    }
    public static void main(String[] args) {
        int arr[] = {10,20,20,30,30,40,40,40};
        int x = 40;
        int n = 8;
        System.out.print(lastOcuurence(arr, x, 0, n-1));
    }
}
