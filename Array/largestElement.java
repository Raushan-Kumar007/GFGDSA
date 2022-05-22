package Array;

public class largestElement {
    static int largeElem(int arr[], int n){
        for(int i=0; i<n; i++){
            boolean flag = true;
            for(int j=1; j<n; j++){
                if(arr[j]>arr[i]){
                   flag = false;
                   break;
                }
            }
            if(flag == true){
                return i;
            }

         }
         return -1;
        }
    public static void main(String[] args) {
        int arr[] = {5,27,19,3,4};
        System.out.println(largeElem(arr, 4));
    }
}
