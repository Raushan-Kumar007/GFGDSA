package Shorting;

public class BubbleSort {

    // Naive Approch 

   /*  static void Bubble(int arr[]){
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=0; j<n-i-1; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                     arr[j] = arr[j+1];
                     arr[j+1] = temp;
                }
            }
        }
    }
    */

    // optimised approch
    static void Bubble(int arr[]){
        int n = arr.length;
        for(int i=0;i<n;i++){
           Boolean swapped = false;
           for(int j=0;j<n-i-1;j++){
            if(arr[j]>arr[j+1]){
            int temp = arr[j];
            arr[j]=arr[j+1];
            arr[j+1]=temp;
            swapped = true;
            }
           }
           if(swapped==false)
           break;
        }
    }
     public static void main(String[] args) {
        int arr[] = {12,6,18,3};
        Bubble(arr);
        for(int i=0;i<arr.length;i++){
         System.out.print(arr[i]+" ");
        }
     }
}
