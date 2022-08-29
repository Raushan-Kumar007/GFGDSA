package matrix;

public class spiralTraversal {
    static void printSprial(int arr[][], int R, int C){
        int top = 0 , left =0,bottom=R-1,right=C-1;
        while(top<=bottom && left<=right){
            for(int i=left; i<=right;i++)
            System.out.println(arr[top][i]+" ");
            top++;
            for(int i=top; i<=bottom; i++)
            System.out.println(arr[i][right]+" ");
            right--;
            if(top<=bottom){
                for(int i=right;i>=left;i--)
                System.out.println(arr[bottom][i]+" ");
                bottom--;
            }
            if(left <= right){
                for(int i=bottom;i>=top;i--)
                System.out.println(arr[i][left]+" ");
                left++;
            }
        }
    }
    public static void main(String[] args) {
        int R = 4,C=4;
        int arr[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};  
        printSprial(arr, R, C);
    }
}
