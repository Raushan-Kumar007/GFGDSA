package Searching;

public class FirstOccurenceInShortedArr {
    // naive approch with timecomplexity is BigO(n)
   /*  static int firstOccurence(int arr[], int x){
        int n = arr.length;
        for(int i=0;i<n; i++){
            if(arr[i]==x)
            return i;
        }
        return -1;
    } 
    */
    // efficient approch to find first occurence in array using Iterarive approch
    /*static int firstOccurence(int arr[], int x){
        int n = arr.length;
        int left = 0;
        int right = n-1;
        while(left<=right){
            int mid = left + (right - left)/2;
           if(arr[mid]<x)
           left = mid + 1;
           else if(x < arr[mid])
           right = mid - 1;
           else{
               if(mid==0||arr[mid-1]!=arr[mid])
               return mid;
               else 
               right = mid - 1;
           }
        }
        return -1;
    }
    */

    //recursive approch to find first occurence in an array

    static int firstOccurence(int arr[], int x , int left, int right){
        if(left>right)
        return -1;
        int mid = left + (right - left)/2;
        if(arr[mid]<x)
        return firstOccurence(arr, x,mid+1, right);
        else if(arr[mid]>x)
        return firstOccurence(arr, x, left, mid-1);
        else{
            if(mid==0 || arr[mid-1] != arr[mid])
            return mid;
            else
            return firstOccurence(arr, x, left,mid-1);
        } 
    }
    public static void main(String[] args) {
        int arr[] = {1,10,10,10,20,20,40};
        int n = 7;
        int x = 20;
        System.out.print(firstOccurence(arr, x,0,n-1));
    }
}
