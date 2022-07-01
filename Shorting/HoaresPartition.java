package Shorting;

public class HoaresPartition {
    static int isPartition(int arr[],int low, int high){
        int pivot=arr[low];
        int i=low-1,j=high+1;
        while(true){
            do{
                i++;
            }while(arr[i]<pivot);
            do{
                j--;
            }while(arr[j]>pivot);
            if(i>=j)return j;
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
    }
    public static void main(String[] args) {
        int arr[] = new int[]{5,3,8,4,2,7,1,10};
        
        int n = arr.length;
        isPartition(arr,0,n-1);
        
	    for(int x: arr)
	        System.out.print(x+" ");
    }
}
