package Array;

public class maxevenoddSubArr {
    // naive approch with time complexity is bigO(n^2)
   /*  static int EvenOddSubArr(int arr[]){
        int n = arr.length;
        int res = 1;
        for(int i=0;i<n;i++){
            int curr = 1;
            for(int j=i+1;j<n;j++){
              if((arr[j]%2==0 && arr[j-1]%2!=0)||(arr[j]%2!=0 && arr[j-1]%2==0))
              curr++;
              else
              break;
            }
            res = Math.max(res,curr);
        }
        return res;
    }*/

    //efficient approch with time complexity is theta(n) and aux space is theta(1)

    static int EvenOddSubArr(int arr[]){
        int n = arr.length;
        int res = 1;
        int curr = 1;
        for(int i=1; i<n; i++){
            if(arr[i]%2==0&&arr[i-1]%2!=0 || arr[i]%2!=0&&arr[i-1]%2==0){
                curr++;
                res = Math.max(res,curr);
            }else{
                curr = 1;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int arr[]={5,10,20,6,3,8};
        System.out.print(EvenOddSubArr(arr));
    }
}
