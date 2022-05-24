package Array;

public class leftrotateArr11 {
    // naive approch with time complexity is theta(nd) and Auxullary space is theta(1)
   /* static void leftrotateOne(int[] arr, int n){
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
    }*/
    /*
         <===method11===>
         timecomplexity is theta(n) bcoz theta(d+n-d+d)
         Auxullary space is theta(d)

    */
    /*static void leftrotate(int[] arr, int n, int d){
        int[] temp = new int[d];
        for(int i=0; i<d; i++){
             temp[i]=arr[i];
        }
        for(int i=d; i<n; i++){
            arr[i-d]=arr[i];
       }
       for(int i=0; i<d; i++){
        arr[n-d+i]=temp[i];
       }
    }*/
    /*
        Auxullary Space = theta(1)
    */
    static void reverseArr(int[] arr, int low, int high){
        while(low<high){
            int temp = arr[low];
            arr[low]=arr[high];
            arr[high]=temp;
            low++;
            high--;
        }
    }
    static void  leftrotate(int[] arr, int n, int d){
        reverseArr(arr, 0, d-1);   // timeComplexity ===> theta(d + n - d + n)
        reverseArr(arr, d, n-1);       //   timeComplexity ===> theta(2n)
        reverseArr(arr, 0, n-1);  //  timeComplexity ===> theta(n)
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
