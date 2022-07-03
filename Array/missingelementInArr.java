package Array;

public class missingelementInArr {
    // naive approch findng missing element in array with timeComplexity is theta(n) and auxullary space is theta(1) but one problem for large size array we will get error like overflow 
   /*  static int missNumber(int arr[]){
        int n = arr.length;
        int n_elem_sum=(n+1)*(n+2)/2;
        for(int i=0;i<n;i++){
            n_elem_sum-=arr[i];
        }
        return n_elem_sum;
    }
    */
    static int missNumber(int arr[]){
        int n = arr.length;
        int res1 = arr[0];
        int res2 = 1;
        for(int i=1; i<n; i++)
            res1^=arr[i];
        for(int i=2; i<=n+1; i++)
            res2^=i;
        return res1^res2;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,5,6};
        System.out.println(missNumber(arr));
    }
}
