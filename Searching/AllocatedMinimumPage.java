package Searching;

public class AllocatedMinimumPage {

    // Naive APPROCH--------->>>>> THIS APPROCH IS VERY SLOW TIME COMPLEXITY IS EXPONENTIAL

    /*  static int minPage(int arr[],int n, int k){  
        if(k==1)
        return sum(arr,0,n-1);
        if(n==1)
        return arr[0];
        int res = Integer.MAX_VALUE;
        for(int i=1;i<n;i++){
            res = Math.min(res,Math.max(minPage(arr,i,k-1),sum(arr,i,n-1)));
        }
        return res;
    }
    static int sum(int arr[], int b, int e){
        int s = 0;
        for(int i=b;i<=e;i++){
          s += arr[i];
        }
        return s;
    }*/
   
// Efficient approch to find aloction of minimum page using binaray search with time complexity is BigO(n*log(sum-max))

    static int minPage(int arr[], int n,int k){
        int sum = 0;
        int max = 0;
        for(int i=0;i<n;i++){
            sum += arr[i];
            max = Math.max(max,arr[i]);
        }
        int low = max;
        int high = sum;
        int res = 0;
        while(low<=high){
            int mid = (low+high)/2;
            if(isfavrable(arr,n,k,mid)){
                res=mid;
                high=mid-1;
            }else{
                low = mid+1;
            }
        }
        return res;
    }
    static boolean isfavrable(int arr[],int n,int k, int ans){
        int req = 1;
        int sum = 0;
        for(int i=0;i<n;i++){
            if(sum+arr[i]>ans){
                req++;
                sum = arr[i];
            }else{
                sum += arr[i];
            }
        }
        return (req<=k);
    }
   public static void main(String[] args) {
    int arr[]={10,20,10,30};
    int n=arr.length;
    int k=2;
    
    System.out.print(minPage(arr,n,k)); 
   } 
}
