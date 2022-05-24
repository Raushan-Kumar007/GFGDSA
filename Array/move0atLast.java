package Array;

public class move0atLast {
    // naive approch with time complexity is O(n^2)
    static void zeroAtEnd(int[] arr){
     int n = arr.length;
     for(int i=0; i<n; i++){
         if(arr[i]==0){
             for(int j= i+1; j<n; j++){
                 if(arr[j]!=0){
                     int temp = arr[i];
                     arr[i] = arr[j];
                     arr[j]=temp;
                 }
             }
         }
     }
    }
    public static void main(String[] args) {
        int arr[] = {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9};
        int n=arr.length;
        zeroAtEnd(arr);
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        
    }
}
