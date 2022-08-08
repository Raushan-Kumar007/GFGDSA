package matrix;

public class snakePattern {
    static void printSnakePattern(int arr[][], int n, int m){
         for(int i=0;i<n;i++){
             if(i%2==0){
                for(int j=0;j<m;j++)
                    System.out.print(arr[i][j]+" ");
             }else{
                for(int j = m-1; j>=0; j--)
                System.out.print(arr[i][j]+" ");
             }
         }
    }
    public static void main(String[] args) {
        int arr[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        printSnakePattern(arr, 4, 4);
    }
}
