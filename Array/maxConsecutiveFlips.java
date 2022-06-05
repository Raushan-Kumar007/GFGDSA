package Array;

public class maxConsecutiveFlips {
    static void ConsecutiveFlips(int[] arr){
        int n = arr.length;
        for(int i=1; i<n; i++){
            if(arr[i]!=arr[i-1]){
                if(arr[i]!=arr[0])
                System.out.print("from"+" "+i+" "+"to");
                else
                System.out.println(i-1+" ");
            }
        }
        if(arr[n-1]!=arr[0]){
        System.out.print(n-1+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {0,0,1,1,0,0,1,1,0};
        ConsecutiveFlips(arr);
    }
}
