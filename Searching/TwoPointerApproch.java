package Searching;

public class TwoPointerApproch {
    // naive approch for unshorted array
   /*  static void pairSum(int arr[], int x){
        int n = arr.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==x)
                System.out.print(arr[i]+" "+arr[j]);
            }
        }
    }
    */
    // for shorted array finding sum two pinter approch is better then other approch
    static void pairSum(int arr[],int x){
        int n = arr.length;
        int left = 0; int right = n-1; 
        while(left<=right){
            if(arr[left]+arr[right]==x){
                System.out.print(left+" "+right);
                break;
            }else if(arr[left]+arr[right]>x)
            right--;
            else
                left++;
        }
    }

    public static void main(String[] args) {
        int arr[] = new int[]{2, 3, 7, 8, 11};
        int x = 14;
       pairSum(arr, x);
    }
}
