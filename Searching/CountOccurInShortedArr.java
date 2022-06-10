package Searching;

public class CountOccurInShortedArr {
    // Naive approch to find countOccurence in shorted array using bigO(n) time complexity
    static int countOccurInArr(int arr[], int x){
        int n = arr.length;
        int count = 0;
        for(int i=0; i<n; i++){
           if(arr[i]==x){
           count++;
           }
        }
        return count;
    }
  public static void main(String[] args) {
     int arr[] = {10,20,20,20,30,30}; 
     int x = 20;
     System.out.print(countOccurInArr(arr, x));
  }  
}
