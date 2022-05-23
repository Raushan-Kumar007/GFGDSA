package Array;

public class arrIsShorted {
    // Naive approch with time Complexity is theta(n^2)
   /* static boolean isShorted(int[] arr){
        int n=arr.length;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(arr[j]<arr[i])
                return false;
            }
            
        }
        return true;
    }*/
    // efficient approch with time complexity is theta(n)
    static boolean isShorted(int[] arr){
        int n = arr.length;
        for(int i=1; i< n; i++){
            if(arr[i]<arr[i-1])
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int arr[] = {7,20,30,10};
        System.out.println(isShorted(arr));
        int arr1[] = {5,7,10,15,30};
        System.out.println(isShorted(arr1));
    }
}
