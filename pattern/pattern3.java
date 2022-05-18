package pattern;

import java.util.Scanner;

// function for print pattern
public class pattern3 {

  /*    USING FOR LOOPS
    static void printP3(int n){
        for(int i=n; i>=1; i--){
            for(int j=i; j>=1; j--){
                System.out.print("*");
            }
           System.out.println();
        }
    }
    */
    // USING  WHILE LOOPS
    static void printP3(int n){
        int i=n;
        while(i>=1){
            int j=i;
            while(j>=1){
              System.out.print("*");
              j--;
            }
            i--;
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // user input
        int n = scan.nextInt();
        printP3(n);
    }
}
/* 
          if n=5
          then,
          *****
          ****
          ***
          **
          *
*/