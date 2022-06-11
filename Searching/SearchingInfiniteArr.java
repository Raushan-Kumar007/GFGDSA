package Searching;

public class SearchingInfiniteArr {
    // Naive aprroch time complexity is bigO(position) & bigO(1) Auxullary space
    
    static int SearchArr(int arr[],int x){
        int i =0;
        while (true) {
            if(arr[i]==x)
            return i;
            if(arr[i]>x)
            return -1;
            i++;
        }
    }
    public static void main(String[] args) {
        int arr[]={1,12,15,20};
        int x = 10;
        System.out.print(SearchArr(arr, x));
    }
}
