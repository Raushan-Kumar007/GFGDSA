package Searching;

public class repeatElement {

    // timecomplexity is BigO(n^2)
  /*   static int Supernive(int arr[]){
        int n = arr.length;
        for(int i=0;i<n;i++){
            for(int j=i+1; j<n; j++){
                if(arr[i]==arr[j])
                return arr[i];
            }
        }
        return -1;
    }
    */

    // timecomplexity is bigO(n)

   /*  static int naiveApproch(int arr[]){
        int n = arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]==arr[i+1])
            return arr[i];
        }
        return -1;
    }
*/

// efficient approch to find repeat element int array
static int repeat(int arr[], int n)
{
    boolean visit[] = new boolean[n];

    for(int i = 0; i < n; i++)
    {
        if(visit[arr[i]])
            return arr[i];
        visit[arr[i]] = true;
    }

    return -1;
}

    public static void main(String[] args) {
        int arr[] = {0, 2, 1, 3, 2, 2};int n =6;
        System.out.println(repeat(arr,n)); 
    }
}
