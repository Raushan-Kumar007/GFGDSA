package Shorting;

public class InsertionSort {
    static void Insertion(int arr[]){
        int n = arr.length;
        for(int i=0;i<n;i++){
            int key = arr[i];
            int j = i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
    }
    public static void main(String[] args) {
       int arr[] = {2,18,9,7,5};
       Insertion(arr);
       for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i]+" ");
       } 
    }
}
