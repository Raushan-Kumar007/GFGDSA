package Shorting;

public class NaivePartition {

/* in this partion time complexity and space complexity is BigO(n) but it's stable as compare to lomuto and Hoare algorithm */

    static int naivePartition(int arr[] , int low, int high , int p){
        int temp[] = new int[high-low+1];
        int index = 0;
        for(int i=low;i<=high; i++)
          if(arr[i]<arr[p]){
            temp[index] = arr[i];
            index++;
          }
          for(int i=low; i<=high; i++)
          if(arr[i]==arr[p]){
            temp[index]=arr[i];
            index++;
          }
          int res = low + index -1;
          for(int i=low;i<=high; i++)
          if(arr[i]>arr[p]){
            temp[index]=arr[i];
            index++;
          }
        for(int i=low;i<=high;i++)
        arr[i]=temp[i-low];
        return res;
    }
    public static void main(String[] args) {
        int arr[] = {5,3,12,8,5};
        int low = 0;
        int high = 4;
        int p = 0;
        naivePartition(arr, low, high, p);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
