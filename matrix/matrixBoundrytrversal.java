package matrix;

import java.util.Scanner;

public class matrixBoundrytrversal {
    static void MatBoundry(int arr[][], int R, int C){
        R = arr.length;
        C = arr.length;
        if(R==1){
            for(int i=0;i<C;i++){
                System.out.print(arr[0][i]+" ");
            }
        }else if(C==1){
            for(int j=0;j<R;j++){
                System.out.print(arr[j][C-1]+" ");
            }
        }else {
            for(int i=0;i<C;i++){
                System.out.print(arr[0][i]+" ");
            }
            for(int i=1; i<R; i++){
                System.out.print(arr[i][C-1]+" ");
            }
            for(int i=C-2; i>=0; i--){
                System.out.print(arr[R-1][i]+" ");
            }
            for(int i=R-2; i>=1; i--4){
                System.out.print(arr[i][0]+" ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        int C = sc.nextInt();
        int arr[][] = new int[R][C];
        for(int i=0;i<R; i++){
            for(int j=0;j<C;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        MatBoundry(arr, R, C);
    }
}
