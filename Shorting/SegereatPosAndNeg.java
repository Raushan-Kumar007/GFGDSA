package Shorting;

public class SegereatPosAndNeg {

    // Naive approch with time complexity is theta(n) and Auxullary space is theta(n)

   /*  static void sortPosAndNegative(int arr[]){
        int n = arr.length;
        int temp[] = new int[n];
        int i = 0;
        for(int j=0;j<n;j++)
        if(arr[j]<0){
            temp[i]=arr[j];
            i++;
        }
        for(int j=0;j<n;j++)
        if(arr[j]>=0){
            temp[i]=arr[j];
            i++;
        }
        for(int j=0;j<n;j++){
            arr[j]=temp[j];
        }
    }
    */

    // Hores patition is using in efficient approch

    static void sortPosAndNegative(int arr[], int n){
     
    int i = -1; int j = n;
      while(true){
        do{
           i++; 
        }while(arr[i]<0);
        do{
            j--;
        }while(arr[j]>=0);
        if(i>=j)
            return;
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
      }
    }
    public static void main(String[] args) {
       int arr[] = {13,-12,18,-10};
       sortPosAndNegative(arr,4);
       for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
       } 
    }
}
