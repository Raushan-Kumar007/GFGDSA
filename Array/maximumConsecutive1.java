package Array;

public class maximumConsecutive1 {
    // naive approch  with timecomplexity is O(n^2) and Aux space is theta(1)
   /* static int maxConsOne(int arr[]){
        int res =0;
        int n = arr.length;
        for(int i=0; i<n; i++){
            int count = 0;
            for(int j = i; j<n; j++){
                if(arr[j]==1)
                count++;
                else
                break;
            }
            res = Math.max(count,res);
        }
        return res;
    }*/
    // efficient approch with timecomplexity is theta(n) and spaceComplexity is theta(1)
    static int maxConsOne(int arr[]){
        int n = arr.length;
        int res =0;
        int count = 0;
        for(int i=0; i<n; i++){
            if(arr[i]==0)
            count = 0;
            else
            count++;
            res = Math.max(count,res);
        }
        return res;
    }
    public static void main(String[] args) {
        int arr[] ={0,1,1,0,1,0}; 
        System.out.print(maxConsOne(arr));
    }
}
