package Shorting;

public class CountInversion {
     static int count(int arr[]){
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

    public static void main(String[] args) {
        int[] arr = {2,4,1,3,5};  // if arr are in decreasing then inversion is zeros
        System.out.println(count(arr));
    }
}
