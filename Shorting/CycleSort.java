package Shorting;

public class CycleSort {
    // in this Cycle Sort for disticnt element with time Complexity is BigO(n^2) && spaceComplexity is theta(n)
    static void cycleSort(int arr[]){
        int n = arr.length;
        for(int cs = 0; cs < n; cs++){
            int item = arr[cs];
            int pos = cs;
            for(int i=cs+1; i<n; i++)
            if(arr[i]<item)
              pos++;
              int temp = item;
              item = arr[pos];
              arr[pos] = temp;
              while(pos != cs){
                pos = cs ;
                for(int i= cs+1; i<n; i++)
                if(arr[i]<item)
                pos++;
                 temp = item;
                 item = arr[pos];
                 arr[pos] = temp;
              }
        }
    }
    
    public static void main(String[] args) {
        int arr[] = {1,9,8,6,11};
        cycleSort(arr);
        for(int i=0;i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
