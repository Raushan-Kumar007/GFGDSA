package Searching;

public class SearchingInfiniteArr {
    // Naive aprroch time complexity is bigO(position) & bigO(1) Auxullary space

   /*  static int SearchArr(int arr[],int x){
        int i =0;
        while (true) {
            if(arr[i]==x)
            return i;
            if(arr[i]>x)
            return -1;
            i++;
        }
    }*/

    // efficient approch to search an element in an shorted array
    static int binarySearch(int arr[],int x, int left, int right){
            if(left > right)
				return -1;
            int mid = left+(right-left)/2;
            if(arr[mid]==x)
               return mid;
            else if(arr[mid]>x)
                return binarySearch(arr, x, left, mid-1);
            else
               return binarySearch(arr, x,mid+1,right);
        
    }
    static int SearchArr(int arr[],int x){
        if(arr[0]==x)
        return 0;
        int i = 1;
        while(arr[i]<x)
            i*=2;
            if(arr[i]==x)
            return i;

        return binarySearch(arr, x, i/2 + 1, i-1);
    }
    public static void main(String[] args) {
        int arr[]={1,12,15,20};
        int x = 12;
        System.out.print(SearchArr(arr, x));
    }
}
