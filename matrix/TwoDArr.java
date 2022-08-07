package matrix;

import java.util.Scanner;

public class TwoDArr {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int m = scn.nextInt();
        int n = scn.nextInt();
        int arr[][] = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=scn.nextInt();
            }
        }
        for(int x[]:arr){
            for(int y : x){
                System.out.print(y+" ");
            }
            System.out.println();
        }
    }
}
