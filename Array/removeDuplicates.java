package Array;

public class removeDuplicates {
    // naive approch
    // timecomplexity is BigO(n)
    // Auxullary space is BigO(n)
  /*  static int removeDup(int arr[], int n){
        int[] temp = new int[n];
        temp[0]=arr[0]; 
        int res = 1;
        for(int i=1; i<n; i++){
            if(temp[res-1]!=arr[i]){
                temp[res]=arr[i];
                res++;
            }
        }
        for(int i=0; i<res; i++){
            arr[i] = temp[i];
        }
        return res;
    }*/
    // Time Complexity is Bigo(N)
    // Auxullary space is BigO(1)
    static int removeDup(int arr[], int n){
        int res = 1;
        for(int i=1; i<n; i++){
            if(arr[i]!=arr[res-1]){
            arr[res] = arr[i];
            res++;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int arr[] = {10, 20, 20, 30, 30, 30}, n = 6;

       System.out.println("Before Removal");

       for(int i = 0; i < n; i++)
       {
       		System.out.print(arr[i]+" ");
       }

       System.out.println();

       n =  removeDup(arr, n);

       System.out.println("After Removal");

       for(int i = 0; i < n; i++)
       {
       		System.out.print(arr[i]+" ");
       }
 
    }
}
