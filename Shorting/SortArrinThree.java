package Shorting;


public class SortArrinThree {
    // Naive Approch with BigO(n) time complexity and theta(n) Auxullary Space
 /*    static void sort0s1s2s(int arr[]){
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
    */

    // Efficient approch for sorting three element
    // Dutch National Flag 

    static void sort(int arr[],int n){
        int l=0,h=n-1,mid=0;
        while(mid<=h){
            switch(arr[mid]){
                case 0:
                    //swapping arr[l] & arr[mid])
                    int temp=arr[l];
                    arr[l]=arr[mid];
                    arr[mid]=temp;
                    
                    l++;mid++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    //swapping arr[h] & arr[mid])
                    temp=arr[h];
                    arr[h]=arr[mid];
                    arr[mid]=temp;
                    
                    h--;
                    break;
            }
        }
     }
   public static void main(String[] args) {
       int arr[] = {0,0,1,2,1,1,0,2,1};int n=9;
       sort(arr,n);
       for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
       }
   } 
}
