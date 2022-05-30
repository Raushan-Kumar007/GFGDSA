package Array;

public class arrayInsertAtend {
    static void arrInsert(int[] arr, int n, int element){
        
            arr[n-1]=element;

    }
    public static void main(String[] args) {
        int arr[] = new int[4];
        arr[0]=10;
        arr[1]=20;
        arr[2]=30;
        System.out.println("Before Insertion");
        for(int i=0;i<arr.length-1; i++){
          System.out.print(arr[i]+" ");
        }
        System.out.println();
        int element = 40;
        int n = 4;
        arrInsert(arr, n, element);
        System.out.println("After Insertion");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
