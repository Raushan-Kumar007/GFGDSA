package Shorting;

public class kthElement {

    // Naive Approch for finding Kth element

    static void swap(int arr[],int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static void SelectionSort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int min = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[min])
                 min = j;
                swap(arr, i,min);
            }
        }
    }
    static int Kth(int arr[], int k){
        SelectionSort(arr);
        return arr[k-1];
    }
    public static void main(String[] args) {
        int arr[] = new int[]{10,5,30,12};
       System.out.print(Kth(arr, 2));
         
    }
}
