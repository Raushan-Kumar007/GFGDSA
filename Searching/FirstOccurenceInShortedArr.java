package Searching;

public class FirstOccurenceInShortedArr {
    // naive approch with timecomplexity is BigO(n)
    static int firstOccurence(int arr[], int x){
        int n = arr.length;
        for(int i=0;i<n; i++){
            if(arr[i]==x)
            return i;
        }
        return -1;
    } 
    public static void main(String[] args) {
        int arr[] = {1,10,10,10,20,20,40};
        int x = 20;
        System.out.print(firstOccurence(arr, x));
    }
}
