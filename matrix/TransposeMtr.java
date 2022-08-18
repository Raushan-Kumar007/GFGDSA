package matrix;

import java.util.Scanner;
// Naive approch to transpose the matrix
public class TransposeMtr {
    static void transpose(int arr[][]){
        int n = arr.length;
        int m = arr.length;
        int temp[][] = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                temp[i][j]=arr[j][i];
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=temp[i][j];
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
         transpose(arr);
        for(int i=0;i<R;i++){
            for(int j=0;j<C;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
      }
  }
    
