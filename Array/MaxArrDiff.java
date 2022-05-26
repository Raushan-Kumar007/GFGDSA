package Array;

public class MaxArrDiff {
    // naive approch to find max diff in an array
   /* static int Maxdiff(int[] arr){
        int n = arr.length;
        int res = arr[1]-arr[0];
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                res = Math.max(res,arr[j]-arr[i]);
            }
        }
        return res;
    }*/
    // efficient approch to find max diff in an array
    static int Maxdiff(int[] arr){
        int n = arr.length;
        int res = arr[1]-arr[0];
        int minVlu = arr[0];
        for(int i=0; i<n; i++){
            res = Math.max(res,arr[i]-minVlu);
            minVlu = Math.min(minVlu,arr[i]);
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr = {2,3,10,6,4,8,1};
        System.out.println(Maxdiff(arr));
    }
    
}
