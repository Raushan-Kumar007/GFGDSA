package Array;

public class insertingAnElementAtAnyIndex {
    static void insertElement(int[] arr, int n ,int index, int element){
        if(index==n-1){
            arr[index]=element;
            return;
        }
        arr[n-1]=-1;
        for(int i=n-1; i>index; i--){
            int temp = arr[i];
            arr[i] = arr[i-1];
            arr[i-1] = temp;
        }
        arr[index]=element;
    }
    public static void main(String[] args) {
        int[] arr = new int[5]; int n=5;
        arr[0]=12;
        arr[1]=14;
        arr[2]=16;
        arr[3]=20;
        for(int i=0;i<n-1;i++){
            System.out.print(arr[i]+" ");
        }
          System.out.println();
        int index = 2; int element = 15;
        insertElement(arr,n,index,element);
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
