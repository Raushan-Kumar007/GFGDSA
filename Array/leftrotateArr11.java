package Array;

public class leftrotateArr11 {
    // naive approch with time complexity is theta(nd) and Auxullary space is theta(1)
    static void leftrotateOne(int[] arr, int n){
        int temp = arr[0];
        for(int i=1; i<n; i++){
            arr[i-1]=arr[i];
        }
        arr[n-1]=temp;
    }
    static void leftrotate(int[] arr, int n, int d){
        for(int i=0; i<d; i++){
        leftrotateOne(arr, n);
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5}; int n=5; int d = 2;
        System.out.println("Before left rotation");
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        leftrotate(arr, n, d);
        System.out.println("After left rotation");
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
