/* 
     linear search with bigO(n) timecomplexity
*/

package Array;

public class linearSearch {
    static int LinearSearch(int n, int arr[], int x){
        for(int i = 0; i<n; i++){
            if(arr[i]==x)
            return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {2,5,7,4,9};
        System.out.println(LinearSearch(5, arr, 9));
    }
    
}
