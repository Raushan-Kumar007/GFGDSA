/*
    timecomplexity is theta(n) 
    Auxullary space is theta(1)
*/

package Array;

public class reverseArray {
    static void reverseArr(int[] arr){
    int n = arr.length;
    int low =0; int heigh = n-1;
    while(low<heigh){
        int temp = arr[low];
        arr[low] = arr[heigh];
        arr[heigh] = temp;
        low++;
        heigh--;
    }
}
    public static void main(String[] args) {
        int[] arr = {30,20,50,10};
        reverseArr(arr);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
