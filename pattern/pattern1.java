package pattern;

import java.util.Scanner;

// function for print pattern
public class pattern1 {
    static void printP1(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in); // user input  
        int n = Scan.nextInt();
        printP1(n);
    }
}
 /*  
        if n = 4
        then , 
        ****
        ****
        ****
        ****    
*/
