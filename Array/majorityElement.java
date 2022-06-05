package Array;

public class majorityElement {
    // naive approch with time complexity is theta(n^2)
    static int majorityElementS(int arr[]){
        int n = arr.length;
        for(int i=0;i<n; i++){
            int count = 1;
            for(int j=i+1; j<n; j++){
                if(arr[i]==arr[j]){
                    count++;
                }
                if(count > n/2)
                return i;
            }
        }
        return -1;
    }
   public static void main(String[] args) {
       int arr[] = {8,7,6,8,6,6,6,6};
       System.out.print(majorityElementS(arr));
   } 
}
