package Shorting;

public class SortArrinThree {
    // Naive Approch with BigO(n) time complexity and theta(n) Auxullary Space
    static void sort0s1s2s(int arr[]){
        int n = arr.length;
        int temp[] = new int[n];
        int i = 0;
        for(int j=0;j<n;j++)
        if(arr[j]==0){
            temp[i] = arr[j];
            i++;
        }
        for(int j=0;j<n;j++)
        if(arr[j]==1){
            temp[i]=arr[j];
            i++;
        }
        for(int j=0;j<n;j++)
        if(arr[j]==2){
            temp[i]=arr[j];
            i++;
        }
        for(int j=0;j<n;j++){
            arr[j]=temp[j];
        }
    }
   public static void main(String[] args) {
       int arr[] = {0,0,1,2,1,1,0,2,1};
       sort0s1s2s(arr);
       for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
       }
   } 
}
