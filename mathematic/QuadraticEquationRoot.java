package mathematic;

import java.util.ArrayList;

public class QuadraticEquationRoot {
     static ArrayList<Integer>  QuadRoot(int a, int b, int c){
        ArrayList<Integer> al = new ArrayList<>();
        int d = (b*b)-(4*a*c);
        int r1 = ((-b) + d^1/2)/(2*a);
        int r2 = ((-b) - d^1/2)/(2*a);
        if(d>0){
            al.add(r1);
            al.add(r2);
      }else if(d==0) {
          al.add(r1);
          al.add(r1);
      }
      return al;
    }
    public static void main(String[] args) {
        int a=1,b=-2,c=1;
        System.out.println( QuadRoot(a, b, c));
    }
}
