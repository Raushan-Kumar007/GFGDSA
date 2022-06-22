package pattern;

import java.util.Scanner;

public class pattern4 {
    static void printP4(int n){
      for(int i=1; i<=n; i++){
          for(int j=1; j<=n; j++){
              System.out.print(" ");
          }
          System.out.print("*");
      }
      System.out.println();
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n= scan.nextInt();
        printP4(n);
    }
}
