package Searching;

public class SearchInShortedRotatedArr {
    // Naive approch 

  /*  static int search(int arr[], int x){
        int n = arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]==x)
            return i;
        }
        return -1;
    }*/

    // efficient approch timecomplexity is BigO(logn) && auxullary space is bigO(1)
    static int search(int arr[],int x){
        int n = arr.length;
      int left = 0;  int right = n-1;
      while(left<=right){
      int mid = left + (right - left)/2;
      if(arr[mid]==x)
      return mid;

        // left half shorted


      if(arr[left]<arr[mid]){
        if(x>=arr[left] && x<arr[mid])
        right = mid - 1;
        else
        left = mid +1;
      }
      
      // right half shorted
      
      else{
        if(x>arr[mid] && x <= arr[right])
        left = mid + 1;
        else
        right = mid-1;
      }
      }
      return -1;
    }
    public static void main(String[] args) {
      int arr[] = {100,200,400,1000,10,20};
      int x = 10;
      System.out.print(search(arr, x));
    }
}
