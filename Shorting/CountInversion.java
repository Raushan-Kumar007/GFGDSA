package Shorting;

public class CountInversion {
   /*   static int count(int arr[]){
        int n = arr.length;
        int res = 0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]>arr[j])
                res++;
            }
        }
        return res;
    }
    */
    static int countMerge(int arr[] , int low, int high, int mid){
        int n1 = mid-low+1;
        int n2 = high-mid;
        int res = 0;
        int left[] = new int[n1]; int right[] = new int[n2];
        for(int i=0;i<n1;i++)
            left[i]=arr[i+low];
        for(int j=0;j<n2;j++)
            right[j]=arr[mid+1+j];
        int i=0,j=0,k=low;
        while (i<n1 && j<n2){
           if(left[i]<=right[j]){
               arr[k]=left[i];
               i++;
           }else {
               arr[k]=right[j];
               j++;
               res=res+(n1-i);
           }
           k++;
        }
        while (i<n1){
            arr[k]=left[i];
            i++;
            k++;
        }
        while (j<n2){
            arr[k]=right[j];
            j++;
            k++;
        }
        return res;
    }
    static int count(int arr[],int low, int high){
        int mid = low+(high-low)/2;
        int res = 0;
        if(high>low){
            res+=count(arr,low,mid);
            res+=count(arr, mid+1, high);
            res+=countMerge(arr, low, high, mid);
        }
        return res;
    }
    public static void main(String[] args) {
       // int[] arr = {2,4,1,3,5};  // if arr are in decreasing then inversion is zero
       int[] arr = {10,20,30,40,50};
       int l=0; int h = 4; 
       System.out.println(count(arr, l, h));
    }
}
