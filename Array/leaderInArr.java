package Array;

public class leaderInArr {
    // naive approch with timeComplexity is theta(n^1/2)
    static void leaderArr(int[] arr, int n){
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
         
    }
    public static void main(String[] args) {
        int arr[] = {7,10,4,10,6,5,2};int n=6;
        leaderArr(arr, n);
        
    }
}
