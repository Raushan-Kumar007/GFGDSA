package pattern;

import java.util.Scanner;

// function for printing pattern
public class pattern2 {
   /* 
    USING FOR LOOPS
   static void printP2(int n){
        for(int i=1;  i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    */
    // USING WHILE LOOPS
    static void printP2(int n){
        int i=1;
        while(i<=n){
            int j=1; 
            while(j<=i){
                System.out.print("*");
                j++;
            }
            i++;
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // user input
        int n = scan.nextInt();
        printP2(n);
    }
}
/* 
    if n=4
    then
      *
      **
      ***
      **** 
*/