/*
    leader of an array  means it's left or right side not greater element than this element

*/


package Array;

public class leaderInArr {
    // naive approch with timeComplexity is theta(n^2)
    /*static void leaderArr(int[] arr, int n){
        for(int i=0; i<n; i++){
            boolean flag = false;
            for(int j=i+1; j<n; j++){
                 if(arr[i]<=arr[j]){
                     flag = true;
                     break;
                 }     
            }
            if(flag==false)
                 System.out.print(arr[i]+" ");
        }
         
    }*/
    // efficient approch to find leader of an array
    static void leaderArr(int[] arr, int n){
        int currentLeader = arr[n-1];
        System.out.print(currentLeader+" ");
        for(int i=n-2; i>=0; i--){
            if(currentLeader < arr[i]){
                currentLeader=arr[i];
                System.out.print(currentLeader+" ");
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {7, 10, 4, 10, 6, 5, 2}, n = 7;
        leaderArr(arr, n);
        
    }
}
