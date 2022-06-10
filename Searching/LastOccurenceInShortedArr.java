package Searching;

public class LastOccurenceInShortedArr {
    // Naive approch to find Last occurence in shorted array with bigO(n) time complexity
    static int lastOcuurence(int arr[], int x){
       int n = arr.length;
        for(int i=n-1; i>=0; i--){
           if(arr[i]==x)
           return i;
      }  
      return -1;
    }
    public static void main(String[] args) {
        int arr[] = {10,20,20,30,30,40,40,40};
        int x = 40;
        System.out.print(lastOcuurence(arr, x));
    }
}
