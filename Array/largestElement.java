package Array;

public class largestElement {

    /*   Naive Approch to find largest element in array with time Complexity is theta(n^2)
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
        */
        // efficient approch to find largest element in array with time complexity is theta(n)
        static int largeElem(int arr[],int n){
            int res = 0;
            for(int i=1; i<n; i++){
                if(arr[i]>arr[res])
                res = i;
            }
            return res;
        }
    public static void main(String[] args) {
        int arr[] = {5,27,19,3,4};
        System.out.println(largeElem(arr, 4));
    }
}
