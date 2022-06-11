package Searching;

public class Count1sinShortedArr {

    // timeComplexity is bigO(logn) and BigO(1) auxullary space
    static int count1s(int arr[]){
        int n = arr.length;
        int left = 0;
        int right = n-1;
        int mid = left+(right-left)/2;
        while(left<=right){
            if(arr[mid]==0)
            left = mid + 1;
            else {
                if(mid==0||arr[mid-1]==0)
                return (n-mid);
                else{
                    right=mid-1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {0,0,1,1,1,1,1};
        System.out.print(count1s(arr));
    }
}
